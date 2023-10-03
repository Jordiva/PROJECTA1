
CREATE OR REPLACE TRIGGER validar_atributos_comentari
BEFORE INSERT OR UPDATE ON COMENTARI
FOR EACH ROW
BEGIN
    IF :NEW.feta = 1 THEN
        IF :NEW.valoracio_seguretat IS NULL OR :NEW.valoracio_paisatge IS NULL OR :NEW.dificultat IS NULL THEN
            RAISE_APPLICATION_ERROR(-20001, 'Los atributos valoracio_seguretat, valoracio_paisatge y dificultat no pueden ser nulos cuando feta es verdadero.');
        END IF;
    END IF;
END;
/



CREATE OR REPLACE TRIGGER control_fetes
BEFORE INSERT or UPDATE ON COMENTARI
FOR EACH ROW
BEGIN
    IF :NEW.feta = 0 THEN
        :NEW.valoracio_seguretat := NULL;
        :NEW.valoracio_paisatge := NULL;
        :NEW.dificultat := NULL;
        
        DELETE FROM COMPANYS WHERE id_comentar = :NEW.id_comentari;
    END IF;
END;
/


CREATE OR REPLACE TRIGGER control_moment_temp
BEFORE INSERT OR UPDATE ON FETES
FOR EACH ROW
BEGIN
    IF :NEW.moment_temp > SYSTIMESTAMP THEN
        RAISE_APPLICATION_ERROR(-20001, 'El campo moment_temp en la tabla FETES no puede estar en el futuro.');
    END IF;
END;
/

CREATE OR REPLACE TRIGGER control_comentari_usuari_ruta
BEFORE INSERT ON COMENTARI
FOR EACH ROW
DECLARE
    ruta_propietario VARCHAR2(50);
BEGIN
    SELECT usu_login INTO ruta_propietario FROM RUTA WHERE id_ruta = :NEW.id_ruta;
    
    IF :NEW.usu_login = ruta_propietario THEN
        RAISE_APPLICATION_ERROR(-20001, 'El usuario que hace el comentario no puede ser el propietario de la ruta.');
    END IF;
END;
/


CREATE OR REPLACE TRIGGER control_comentari_companys 
BEFORE INSERT ON COMPANYS
FOR EACH ROW
DECLARE 
    cursor c_coment is select * from comentari where id_comentari = :NEW.id_comentar;
begin
    for r_coment in c_coment loop
        if r_coment.usu_login = :NEW.usu_login then
            RAISE_APPLICATION_ERROR(-20001, 'El usuario propietario de la ruta no puede ser un compañero de ruta en el comentario.');
        end if;
    end loop;

end;
/



create or replace trigger trig_calcular_columnes BEFORE insert on COMENTARI
for each row
begin
    if :NEW.feta = 1 then
        update ruta set num_persones = num_persones + 1, num_persones_fet_ruta = num_persones_fet_ruta +1 , suma_valoracions = suma_valoracions + :new.valoracio_informacio
        ,suma_valoracion_saguretat = suma_valoracion_saguretat + :new.valoracio_seguretat , suma_valoracio_paisatge = suma_valoracio_paisatge + :new.valoracio_paisatge
        where id_ruta = :new.id_ruta;
    else
        update ruta set num_persones = num_persones + 1 , suma_valoracions = suma_valoracions + :new.valoracio_informacio where id_ruta = :new.id_ruta;
end if;
end;
/
