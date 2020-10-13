package com.Krakenlab.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;



public class Hooks {
	
	//private static ChromeDriver driver;
	
	public static WebDriver driver;
	Logger log = Logger.getLogger(Hooks.class);
	Scenario scenario = null;

	
	
	private static int numberOfCase = 0;

	
	@Before
	public void setUp(){
		
		numberOfCase ++;
		System.out.println("                                                                          ");
		System.out.println("***************************************************************************************************");
		System.out.println("Se esta ejecutando el escenario Nro.:  " + numberOfCase);
		System.out.println("***************************************************************************************************");
		System.out.println("                                                                          ");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://webapp-staging.spypoint.com/login"); // Pruebas
		driver.manage().window().maximize();
		
	}
	
	
	@After 
	
	public void tearDown(Scenario escenario) {
		
		// Toma screenshot al culminar cada scenario paso o no pase la prueba
		
		

		if(escenario.isFailed()) {
			escenario.write("The scenario failed.");
			escenario.write("Current Page URL is " + driver.getCurrentUrl());	
			byte[] screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
				escenario.embed(screenshot,"image/png");
				//Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
				System.out.println("                                                                          ");
				System.out.println("***************************************************************************************************");
				System.out.println("El escenario Nro.:  " + numberOfCase + "   Fallo!!!!");
				System.out.println("***************************************************************************************************");
				System.out.println("                                                                          ");
		}
		else {
			escenario.write("The scenario NO failed.");
			escenario.write("Current Page URL is " + driver.getCurrentUrl());	
			byte[] screenshot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
			escenario.embed(screenshot,"image/png");
			System.out.println("                                                                          ");			
			System.out.println("***************************************************************************************************");
			System.out.println("El escenario Nro.:  " + numberOfCase + "  se ejecuto correctamente !!!");
			System.out.println("Url Utilizada:  " + driver.getCurrentUrl());
			System.out.println("***************************************************************************************************");
			System.out.println("                                                                          ");
		}

		

		driver.quit();
		
	}
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}

