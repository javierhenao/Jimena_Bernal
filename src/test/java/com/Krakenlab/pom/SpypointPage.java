package com.Krakenlab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpypointPage extends BasePage {

	public SpypointPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	// String Para Captura de SpypointPage
	private String screenshot = "Screenshot_Spypoint_Page";
	
	// String Para Captura de SpypointPage
	private String pageNameSpypoint = "Spypoint";

	
	// localizador de  LINK-MICRO LTE-R
	@FindBy (xpath = "//img[@src='https://s3.amazonaws.com/spypoint-static-assets/models/icons/LINK-MICRO-LTE.png']")
	private WebElement selectACamera;  
	
	
	//Localizador menu scrollbar - Logout
	@FindBy (id = "main-menu-button")
	private WebElement menuSpyPoint;
	
	
	// Localizador Boton Log out
	@FindBy (xpath = "//span[contains(.,'Log out')]")
	private WebElement logOut;
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------	
		
	// screenShot Spypoint page 
	public void screenshotSpypointPage() throws Exception {
		this.screenShot(screenshot);
		
	}
	
	// Select a Camera dando clic en LINK-MICRO LTE-R
	
	public boolean selectACamera() throws Exception {
	
	if (this.getTitle().equals(pageNameSpypoint)) { // Se pregunta si esta en la pagina Spypoint
		this.click(selectACamera); // Click en LINK-MICRO LTE-R
		Thread.sleep(2000);
		System.out.println("***************************************************************************************************");
		System.out.println("Ingreso a la pagina exitosamente   "+ getTitle());
		System.out.println("***************************************************************************************************");
	}
	
	else {
	
		System.out.println("***************************************************************************************************");
		System.out.println("No Ingreso a la pagina exitosamente   "+ getTitle());
		System.out.println("***************************************************************************************************");
		}
	return false;	
	}
	
	
	//Click en el menu SpyPoint
	public void clickMenuSpyPoint() throws Exception {
		this.click(menuSpyPoint);
		Thread.sleep(2000);
	}
	
	// Clic en la opcion Log out
	public void clickopcionlogOut() throws Exception {
		this.click(logOut);
		Thread.sleep(2000);
	} 
	
}
