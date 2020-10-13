// Inicializa las paginas

package com.Krakenlab.gluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Krakenlab.hooks.Hooks;
import com.Krakenlab.pom.HomePage;
import com.Krakenlab.pom.PhotoGalleryPage;
import com.Krakenlab.pom.SpypointPage;


public class TestBase {
	
	//Inicializa el hook para obtener el Driver
	protected WebDriver driver = Hooks.getDriver();
	
	
	// Inicializa paginas
	
	protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	
	protected SpypointPage spypointPage = PageFactory.initElements(driver, SpypointPage.class);
	
	protected PhotoGalleryPage photoGalleryPage = PageFactory.initElements(driver, PhotoGalleryPage.class);
	

}
