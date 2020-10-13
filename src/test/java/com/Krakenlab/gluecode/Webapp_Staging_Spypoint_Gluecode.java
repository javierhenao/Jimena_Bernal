package com.Krakenlab.gluecode;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class Webapp_Staging_Spypoint_Gluecode extends TestBase {
	
	
	@Dado("^el usario ingresa a la pagina de la aplicacion webapp-staging\\.spypoint$")
	public void el_usario_ingresa_a_la_pagina_de_la_aplicacion_webapp_staging_spypoint() throws Throwable {
	    
		homePage.pageSpyPoint();
		homePage.screenshot();
	    
	}
	


	@Cuando("^ingresar con User \"([^\"]*)\" y Password \"([^\"]*)\" a la aplicacion$")
	public void ingresar_con_User_y_Password_a_la_aplicacion(String user, String password) throws Throwable {
	    
		
		homePage.logInPageSpyPoint(user, password);
		homePage.screenshot();
		
	   
	}

	@Cuando("^se selecciona la opcion LINK-MICRO LTE-R$")
	public void se_selecciona_la_opcion_LINK_MICRO_LTE_R() throws Throwable {
	    	    
		spypointPage.selectACamera();
		spypointPage.screenshotSpypointPage();
		
	}
	
	@Cuando("^se da click en el botn FULL HD para ctivar filtro$")
	public void se_da_click_en_el_botn_FULL_HD_para_ctivar_filtro() throws Throwable {
	    
		photoGalleryPage.clickActiveMenuFullHD();
		photoGalleryPage.screenshot();
	    
	}

	@Cuando("^se da click en el boton FULL HD para desactivar el filtro$")
	public void se_da_click_en_el_boton_FULL_HD_para_desactivar_el_filtro() throws Throwable {
	    
	    photoGalleryPage.clickDeactivEMenuFullHD();
	    photoGalleryPage.screenshot();
		
	}

	@Entonces("^cerrar la aplicacion por el menu scrollbar$")
	public void cerrar_la_aplicacion_por_el_menu_scrollbar() throws Throwable {
	    
		spypointPage.clickMenuSpyPoint();
		spypointPage.screenshotSpypointPage();
		spypointPage.clickopcionlogOut();
		spypointPage.screenshotSpypointPage();
	    
	}


}
