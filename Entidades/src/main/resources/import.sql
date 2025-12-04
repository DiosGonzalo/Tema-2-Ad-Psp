INSERT INTO VUELO (id, cod_vuelo, precio, capacidad, plazas_disponibles) VALUES
(1, 'IB3100', 85.50, 180, 150),
(2, 'VY2050', 55.00, 120, 100),
(3, 'FR9012', 30.99, 200, 200);

INSERT INTO PERSONA (id, nombre, apellido, fecha_nacimiento) VALUES
(101, 'Ana', 'García', '1995-10-20'),
(102, 'Luis', 'Martínez', '1988-05-15'),
(103, 'Elena', 'Ruiz', '2000-01-01');

INSERT INTO PERSONA_VUELO (persona_id, vuelo_id) VALUES
(101, 1),
(102, 1),
(102, 2),
(103, 2);