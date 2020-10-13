#language : es

@Aplicacion:webapp-staging.spypoint  
Característica: A. Prueba De concepto Autmatizacion Webapp-Staging.Spypoint 
	
    
	@CP_01_01  @Contratista 
	Esquema del escenario: Ejerccio donde se hace una ejcecucion basica de Automatizacion sobre una Aplicacion Wwb Utilizando Selenium y Cucumbre. 
	
	Dado el usario ingresa a la pagina de la aplicacion webapp-staging.spypoint
	Cuando ingresar con User "<user>" y Password "<password>" a la aplicacion
	Y se selecciona la opcion LINK-MICRO LTE-R
	Y se da click en el botn FULL HD para ctivar filtro
	Y se da click en el boton FULL HD para desactivar el filtro
	Entonces cerrar la aplicacion por el menu scrollbar  
	
	
	Ejemplos:
	
	|user                 |password  |
	|jbernal@krakenlab.dev|1234567890|