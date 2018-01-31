*** Setting ***
Library	RicohWeb
Test Teardown	Cerrar Aplicacion

*** Variable ***
${Browser}	chrome
${OR}	C:\\Software\\OR\\WEB\\NH@1.0.xlsx
${Seguridad}	

*** Test Cases ***

Contratar Hotel - Avanzada
	Abrir Aplicacion	https://www.nh-hoteles.es/
	Pulsar Enlace	Inicio	Busqueda Avanzada
	Introducir Texto	Busqueda Avanzada	Destino	Madrid
	Pulsar Enlace	Busqueda Avanzada	Buscar
	Pulsar Enlace	Resultados Busqueda	Primer Hotel
	Pulsar Boton	Hotel	Reservar
	Pulsar Boton Modal	Hotel	Seleccionar Precios	Ver Precios
	Pulsar Boton	Hotel	Solo Alojamiento
	Introducir Texto	Reserva	Nombre	Javier
	Introducir Texto	Reserva	Apellidos	Castro Perez
	Introducir Texto	Reserva	Correo Electronico	javier@google.es
	Introducir Texto	Reserva	Confirmar Correo Electronico	javier@google.es
	Introducir Texto	Reserva	Telefono	0034914422533

*** Keywords ***


