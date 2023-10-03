-- Insertar 10 tipos de puntos
INSERT INTO TIPUS (nom) VALUES ('cim');
INSERT INTO TIPUS (nom) VALUES ('llac');
INSERT INTO TIPUS (nom) VALUES ('riu');
INSERT INTO TIPUS (nom) VALUES ('cascada');
INSERT INTO TIPUS (nom) VALUES ('font');
INSERT INTO TIPUS (nom) VALUES ('cova');
INSERT INTO TIPUS (nom) VALUES ('trencall');
INSERT INTO TIPUS (nom) VALUES ('càmping');
INSERT INTO TIPUS (nom) VALUES ('aparcament');
INSERT INTO TIPUS (nom) VALUES ('metro');

-- Insertar 4 usuarios
INSERT INTO USUARI (login, email, nom, cognom, contrasenya) VALUES
    ('usuario1', 'usuario1@gmail.com', 'Nombre1', 'Apellido1', 'contraseña1');
INSERT INTO USUARI (login, email, nom, cognom, contrasenya) VALUES
    ('usuario2', 'usuario2@gmail.com', 'Nombre2', 'Apellido2', 'contraseña2');
INSERT INTO USUARI (login, email, nom, cognom, contrasenya) VALUES
    ('usuario3', 'usuario3@gmail.com', 'Nombre3', 'Apellido3', 'contraseña3');
INSERT INTO USUARI (login, email, nom, cognom, contrasenya) VALUES
    ('usuario4', 'usuario4@gmail.com', 'Nombre4', 'Apellido4', 'contraseña4');

-- Insertar rutas para usuarios
-- Usuario1 crea 2 rutas
INSERT INTO RUTA (usu_login, titol, descripcio, text, distancia, temps, desnivell_positiu, desnivell_negatiu, dificultat)
VALUES ('usuario1', 'Ruta 1', 'Descripción 1', 'Texto 1', 10, 120, 200, 100, 3);
INSERT INTO RUTA (usu_login, titol, descripcio, text, distancia, temps, desnivell_positiu, desnivell_negatiu, dificultat)
VALUES ('usuario1', 'Ruta 2', 'Descripción 2', 'Texto 2', 15, 180, 250, 150, 4);

-- Usuario2 crea 1 ruta
INSERT INTO RUTA (usu_login, titol, descripcio, text, distancia, temps, desnivell_positiu, desnivell_negatiu, dificultat)
VALUES ('usuario2', 'Ruta 3', 'Descripción 3', 'Texto 3', 8, 90, 150, 80, 2);

-- Insertar puntos en las rutas (al menos 5 puntos por ruta)
-- Ruta 1
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (1, 1, 'Punto 1', 'Descripción punto 1', 41.123456, 2.345678, 1000);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (1, 2, 'Punto 2', 'Descripción punto 2', 41.223456, 2.445678, 1100);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (1, 3, 'Punto 3', 'Descripción punto 3', 41.323456, 2.545678, 1200);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (1, 4, 'Punto 4', 'Descripción punto 4', 41.423456, 2.645678, 1300);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (1, 5, 'Punto 5', 'Descripción punto 5', 41.523456, 2.745678, 1400);

-- Ruta 2
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (2, 6, 'Punto 6', 'Descripción punto 6', 41.623456, 2.845678, 1500);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (2, 7, 'Punto 7', 'Descripción punto 7', 41.723456, 2.945678, 1600);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (2, 8, 'Punto 8', 'Descripción punto 8', 41.823456, 3.045678, 1700);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (2, 9, 'Punto 9', 'Descripción punto 9', 41.923456, 3.145678, 1800);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (2, 10, 'Punto 10', 'Descripción punto 10', 42.023456, 3.245678, 1900);

-- Ruta 3
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (3, 1, 'Punto 11', 'Descripción punto 11', 42.123456, 3.345678, 2000);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (3, 2, 'Punto 12', 'Descripción punto 12', 42.223456, 3.445678, 2100);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (3, 3, 'Punto 13', 'Descripción punto 13', 42.323456, 3.545678, 2200);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (3, 4, 'Punto 14', 'Descripción punto 14', 42.423456, 3.645678, 2300);
INSERT INTO PUNT (id_ruta, id_tipus, nom, descripcio, latitud, longitud, altitud)
VALUES (3, 5, 'Punto 15', 'Descripción punto 15', 42.523456, 3.745678, 2400);

-- Insertar comentarios en rutas
-- Comentario en Ruta 1 (no ha hecho la ruta)
INSERT INTO COMENTARI (usu_login, id_ruta, text, valoracio_informacio, feta, dificultat, valoracio_paisatge, valoracio_seguretat, moment_temp)
VALUES ('usuario2', 1, 'No he hecho esta ruta.', 3, 0, 3, 4, 3, CURRENT_TIMESTAMP);

-- Comentario en Ruta 2 (ha hecho la ruta y agrega 2 compañeros de ruta)
INSERT INTO COMENTARI (usu_login, id_ruta, text, valoracio_informacio, feta, dificultat, valoracio_paisatge, valoracio_seguretat, moment_temp)
VALUES ('usuario3', 2, 'He hecho esta ruta y la recomiendo.', 4, 1, 2, 5, 4, CURRENT_TIMESTAMP);

-- Insertar compañeros de ruta en el comentario de Ruta 2
INSERT INTO COMPANYS (usu_login, id_comentar)
VALUES ('usuario4', 2);
INSERT INTO COMPANYS (usu_login, id_comentar)
VALUES ('usuario1', 2);
