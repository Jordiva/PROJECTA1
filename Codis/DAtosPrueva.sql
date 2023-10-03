
-- Verificación de restricciones
-- 1. Modificar el comentario en el que ha hecho la ruta (debería borrar v_seg, v_pai y dific y los compañeros de ruta)
UPDATE COMENTARI
SET text = 'Modificar comentario hecho de la ruta.', feta = 0 
WHERE id_comentari = 2;

-- 2. Intentar agregar compañeros de ruta en un comentario que no indica que se ha hecho la ruta
-- Insertar un comentario en Ruta 3 sin marcar que se ha hecho la ruta (debe fallar)
INSERT INTO COMENTARI (usu_login, id_ruta, text, valoracio_informacio, feta, dificultat, valoracio_paisatge, valoracio_seguretat, moment_temp)
VALUES ('usuario1', 3, 'Comentario sin hacer la ruta.', 3, 0, 3, 4, 3, CURRENT_TIMESTAMP);

-- 3. Intentar agregar al usuario del comentario como compañero de ruta
-- Insertar un comentario en Ruta 1 con el usuario1 como compañero (debe fallar)
INSERT INTO COMENTARI (usu_login, id_ruta, text, valoracio_informacio, feta, dificultat, valoracio_paisatge, valoracio_seguretat, moment_temp)
VALUES ('usuario1', 1, 'Comentario con el usuario1 como compañero.', 3, 0, 3, 4, 3, CURRENT_TIMESTAMP);

-- 4. Intentar que el propietario de la ruta haga un comentario
-- Insertar un comentario en Ruta 1 con el usuario1 como propietario (debe fallar)
INSERT INTO COMPANYS(usu_login, id_comentar)
Values ('usuario2', 5);--El 5 pot cambiar

-- 5. Intentar introducir un comentario sin marcar que se ha hecho la ruta y con valor en alguno de los campos v_seg, v_pai o dific
-- Insertar un comentario en Ruta 1 sin marcar que se ha hecho la ruta, pero con valor en v_seg (debe fallar)
-- No da error porque lo modifica a NULL
INSERT INTO COMENTARI (usu_login, id_ruta, text, valoracio_informacio, feta, dificultat, valoracio_paisatge, valoracio_seguretat, moment_temp)
VALUES ('usuario2', 1, 'Comentario sin hacer la ruta pero con valor en v_seg.', 3, 0, 3, 4, 3, CURRENT_TIMESTAMP);
