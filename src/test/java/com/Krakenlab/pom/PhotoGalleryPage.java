package com.Krakenlab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhotoGalleryPage extends BasePage {

	public PhotoGalleryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// String Para Captura de SpypointPage
	private String screenshot = "Screenshot_PhotoGallery_Page";
	
	
	//Localizador Menu Superior
	@FindBy (xpath = "//div[@class='MuiPaper-root jss443 MuiPaper-elevation1 MuiPaper-rounded']")
	private WebElement menuPhotoGallery;
	
	//Localizador Boton Menu HD
	@FindBy (xpath = "//div[@id='root']/div[2]/div[2]/div/div/div/div/div[2]")
	private WebElement menuFullHd;
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------	
			
	//Screenshot
	public void screenshot() throws Exception {
		this.screenShot(screenshot);
	}

	//Activa Boton Full HD 
	public void clickActiveMenuFullHD() throws Exception {
		this.click(menuFullHd);
		Thread.sleep(2000);
		}
	
	//Desactiva Boton Full HD 
	public void clickDeactivEMenuFullHD() throws Exception {
		this.click(menuFullHd);
		Thread.sleep(2000);
		}
			
}
