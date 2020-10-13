package com.Krakenlab.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	// Localizadores del HomePage
	
	// String Para Captura de Home Page
	private String screenshot = "Screenshot_Home_Page";
	
	// Nombre de la pagina
	private String pageSpyPoint = "Login - Spypoint";
	
	
	//Localizador Log in Email
	@FindBy (id = "email")
	private WebElement email;
	
	
	//Localizador Log in Password
	@FindBy (id = "password")
	private WebElement passwordField;
	
	@FindBy (xpath = "//*[@type='submit']//ancestor::div[1]")
	private WebElement botonLogin;

	
//------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------	
	

	// ScreenShot
	public void screenshot() throws Exception {
		this.screenShot(screenshot);
	}

	
	// Acciones sobre el Home Page 
	
	
	// Valida si abrió la pagina principal de SpyPoint
	
	public boolean pageSpyPoint() throws Exception {
		if (this.getTitle().equals(pageSpyPoint)) {
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
	
	
	// Insert Email and Password and click LogIn 
	
	public void logInPageSpyPoint(String user, String password) throws Exception {
		
		email.sendKeys(user);
		passwordField.sendKeys(password);
		Thread.sleep(2000);
		this.screenShot(screenshot);
		this.click(botonLogin);
		this.screenShot(screenshot);
		System.out.println("***************************************************************************************************");
		System.out.println("Successful log in   "+ getTitle());
		System.out.println("***************************************************************************************************");
		Thread.sleep(2000);
				
	}
	
}
