*** Setting ***
Library	RicohWeb
Test Teardown	Cerrar Aplicacion

*** Variable ***
${Browser}	chrome
${OR}	C:\\Software\\OR\\WEB\\NH@1.0.xlsx
${Seguridad}	

*** Test Cases ***

Contratar Hotel - Avanzada- Error Correo
	Abrir Aplicacion	https://www.nh-hoteles.es/
	Pulsar Enlace	Inicio	Busqueda Avanzada
	Introducir Texto	Busqueda Avanzada	Destino	Madrid
	Pulsar Enlace	Busqueda Avanzada	Buscar
	Pulsar Enlace	Resultados Busqueda	Primer Hotel
	Pulsar Boton	Hotel	Reservar
	Pulsar Boton Modal	Hotel	Seleccionar Precios	Ver Precios
	Pulsar Boton	Hotel	Solo Alojamiento
	Introducir Texto	Reserva	Nombre	Antonio
	Introducir Texto	Reserva	Apellidos	Perez Fernandez
	Introducir Texto	Reserva	Correo Electronico	antonio@google.es
	Introducir Texto	Reserva	Confirmar Correo Electronico	antonio1@google.es
	Introducir Texto	Reserva	Telefono	0034914422533
	Validar Error	Reserva	El email debe coincidir

*** Keywords ***


