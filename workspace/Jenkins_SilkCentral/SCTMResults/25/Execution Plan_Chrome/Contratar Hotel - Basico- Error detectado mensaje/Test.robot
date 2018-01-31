*** Setting ***
Library	RicohWeb
Test Teardown	Cerrar Aplicacion

*** Variable ***
${Browser}	chrome
${OR}	C:\\Software\\OR\\WEB\\NH@1.0.xlsx
${Seguridad}	

*** Test Cases ***

Contratar Hotel - Basico- Error detectado mensaje
	Abrir Aplicacion	https://www.nh-hoteles.es/
	Introducir Texto	Inicio	A donde viajas	Lanzarote
	Pulsar Enlace	Inicio	Playa Dorada
	Pulsar Boton	Inicio	Buscar hotel
	Pulsar Boton	Hotel	Media Pension Standard
	Introducir Texto	Reserva	Nombre	Javier
	Introducir Texto	Reserva	Apellidos	Castro Perez
	Introducir Texto	Reserva	Correo Electronico	javier
	Introducir Texto	Reserva	Confirmar Correo Electronico	javier
	Introducir Texto	Reserva	Telefono	0034914416831
	Validar Mensaje Error	Reserva	Mensaje correo electronico	dirección de mail no válida
	Validar Mensaje Error	Reserva	Mensaje confirmacion correo electronico	dirección de mail no válida

*** Keywords ***


