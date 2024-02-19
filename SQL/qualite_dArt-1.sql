USE Qualitedart;

SHOW columns from estados;
insert into estados(id_estados, estatus) 
values (1, "Solicitud en proceso"), (2, "Evento confirmado"), (3, "Fecha no disponible");

SELECT * FROM qualitedart.estados;

insert into servicios(nomServ, img, descripcion, estado)
values ("Producción", "I", "Producción de contenido para redes sociales, comerciales y cobertura de eventos", 1), 
	("Audiovisuales", "I", "Servicio de fotografía", 1),
	("Postproducción", "I", "Creación de anuncios promocionales para campañas publicitarias", 1);

SELECT * FROM qualitedart.servicios;

insert into USUARIOS(id_usuarios, usuario, email, contraseña)
values(1, "Rocio", "rocio@qualitedart.com", "rocio123"),
(2, "Monse", "monse@qualitedart.com", "monse123"),
(3, "Xime", "xime@qualitedart.com", "xime123"),
(4, "Rodrigo", "rodrigo@qualitedart.com", "rodrigo123"),
(5, "Diego", "diego@qualitedart.com", "diego123"),
(6, "Cindy", "cindy@qualitedart.com", "cindy123"),
(7, "Uriel", "uriel@qualitedart.com", "uriel123"),
(8, "Rey", "rey@qualitedart.com", "rey123");


insert into PORTAFOLIOS(id_portafolios, nomImg)
values(1, "url_img"),
(2, "url_img"),
(3, "url_img"),
(4, "url_img"),
(5, "url_img"),
(6, "url_img"),
(7, "url_img"),
(8, "url_img");


SELECT * FROM qualitedart.agendas;


insert into AGENDAS(id_agendas, nombreCliente, telefono, direccionEvento, fechaEvento, horarioEventoInicial, horarioEventoFinal, comentarioServicio, SERVICIOS_id_SERVICIOS, ESTADOS_id_ESTADOS)
values(1, "Pancho", 5234585768, "Zacatecas 49, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario1", 1, 1),
(2, "Loera Guzmán", 5234587878, "Sinaloa 701, CDMX", "2024-11-05", "12:00:00", "14:00:00", "Comentario2", 1, 1),
(3, "Teresa Mendoza", 5234524563, "Oaxaca 58, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario3", 1, 1),
(4, "Juana Barraza", 5234867586, "Torreón 12, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario4", 1, 1),
(5, "Nemecio Oseguera", 5234578789, "Jalisco 123, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario5", 1, 1),
(6, "Aurelio Casillas", 5234645345, "Colombia 16, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario6", 1, 1),
(7, "Jesús Pinkman", 5234767689, "El Paso 169, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario7", 1, 1),
(8, "Walter White", 5234573534, "Olivo 256, CDMX", "2024-12-05", "12:00:00", "14:00:00", "Comentario8", 1, 1);


SELECT * FROM qualitedart.servicios;





