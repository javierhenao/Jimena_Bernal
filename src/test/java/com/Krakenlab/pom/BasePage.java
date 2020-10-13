package com.Krakenlab.pom;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;

import org.apache.commons.io.FileUtils;



public class BasePage {
	
	
	protected WebDriver driver;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	
	// Para dar clic sobre un elemento
	public void click(By element) throws Exception {
		try {
		driver.findElement(element).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Se dio Click sobre el elemento" + element);
		}catch (Exception e) {
			throw new Exception("No se pudo dar click sobre el elemento:  " + element);
		}
	}
	
	
	public void click(WebElement element) throws Exception {
		try {
		element.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Se dio click sobre el elemento: " + element );
		}catch (Exception e) {
			throw new Exception("No se pudo dar click sobre el elemento:  " + element);
		}
	}
	
	
	//Para eliminar o limpiar informacion de un campo
	public void clear(By element) throws Exception {
		try {
		driver.findElement(element).clear();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Se limpia el contenido del campo:  " + element);
		}catch (Exception e) {
			throw new Exception("No se pudo limpiar el elemento:  " + element);
		}
	}
	
	
	public void clear(WebElement element) throws Exception {
		try {
		element.clear();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("Se limpia el contenido del campo:  " + element);
		}catch (Exception e) {
			throw new Exception("No se pudo limpiar el contendido de:  " + element);
		}
	}
	
	
	//Para hacer Submit sobre la aplicacion
	public void sunmit(By element) throws Exception {
		try {
		driver.findElement(element).submit();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("Se envia la informacion" + element);
		}catch (Exception e) {
			throw new Exception("No se pudo limpiar el elemento:  " + element);
		}
	}
	
	
	public void sunmit(WebElement element) throws Exception {
		try {
		element.submit();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		System.out.println("Se envia la informacion" + element);
		}catch (Exception e) {
			throw new Exception("No se pudo limpiar el elemento:  " + element);
		}
	}
	
	
	
	//Para validar si el elemento esta en la pantalla
	
	public boolean isDisplayed(By element) throws Exception {
		try {
		return driver.findElement(element).isDisplayed();
		}catch (Exception e) {
			throw new Exception("No se pudo Localizar el elemento:  " + element);
		}
	}
	
	
	public boolean isDisplayed(WebElement escenario) throws Exception {
		try {
		return escenario.isDisplayed();
		}catch (Exception e) {
			throw new Exception("No se pudo dar click sobre el elemento:  " + escenario);
		}
	}
	
	
	//Regresa el valor del ID
	
	public String getText(By element) throws Exception {
		try {
		return driver.findElement(element).getText();
		}catch (Exception e) {
			throw new Exception("No se pudo obtener el texto del elemento:  " + element);
		}
	}
	
	
	public String getText(WebElement element) throws Exception {
		try {
		return element.getText();
		}catch (Exception e) {
			throw new Exception("No se pudo obtener el texto del elemento:  " + element);
		}
	}
	
	
	// Trae el titulo de la Pagina
	public String getTitle() throws Exception {
		try {
		return driver.getTitle();
		}catch (Exception e) {
			throw new Exception("No se pudo encontrar el titulo" );
		}
	}
	
	
	
	// para cambiar por el metodo sendKeys para ingresar informacion en un campo
	
	public void type(String inputText, By element) throws Exception {
		try {
			driver.findElement(element).sendKeys(inputText);
			System.out.println("Se selecciona una opcion de la lista" + element + "Opcion seleccionada" + inputText);
		}catch (Exception e) {
			throw new Exception("No se pudo seleccionar una opcion del campo:  " + element + "O no se encontro la opcion" + inputText);
		}
	}
	
	
	
	public void type(String inputText, WebElement element) throws Exception {
		try {
			element.sendKeys(inputText);
			System.out.println("Se ingresa informacion en el campo: " + element + "Opcion seleccionada:   " + inputText);
		}catch (Exception e) {
			throw new Exception("No se pudo ingresar informacion en el campo:  " + element + "Opcion seleccionada:  " + inputText);
		}
	}
	
	
	
	
	// Accion para subir un archivo
	//Tenga en cuenta que la carga solo funcionará Si el elemento que envía un archivo debe tener el formato <input type="file">
	public void subirFile(WebElement element, String rutaArchivo ) throws Exception {
	
		try {
			element.sendKeys(rutaArchivo);
		}catch (Exception e) {
			throw new Exception("No se selecciono el archivo a subir del campo:  " + element);
		}
	}
	
	
	
	
	//Seleciona numero N del listado sin importar el nombre del campo 
	public void select(WebElement element, int n) throws Exception {
		//n = 10;
		try {
			 Select sel=new Select(element);
			    sel.selectByIndex(n);
			    System.out.println("Se da clic en el campo   " + element + "    y se se selecciona la opcion  " + n);
			    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		}catch (Exception e) {
			throw new Exception("No se selecciona una opcion de la lista:  " + element);
		}
	}
	
	//Toma captura de pantalla

    public void screenShot(String testCaptura) throws Exception {
        try {
        	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
            //String screenShotName = readProperties("test/report/Screenshots") + "\\" + testCaptura + "_(" + dateFormat.format(GregorianCalendar.getInstance().getTime()) + ")";
        	//String screenShotName = ("test/report/Screenshots") + "\\" + ("Chorme") + "\\" + testCaptura + "_(" + dateFormat.format(GregorianCalendar.getInstance().getTime()) + ")";
        	//String screenShotName = ("test/report/screenshots") + "\\" + testCaptura + "_(" + dateFormat.format(GregorianCalendar.getInstance().getTime()) + ")";
        	String screenShotName = ("reporte_node/screenshots") + "\\" + testCaptura + "_(" + dateFormat.format(GregorianCalendar.getInstance().getTime()) + ")";
        	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(String.format("%s.png", screenShotName)));
            System.out.println("Se toma Camputa de la pantalla: " + testCaptura);
        }catch (Exception e) {
			throw new Exception("No se toma Captura de la pantalla" );
		}
    	
    }

  /*     	
   public byte[] attachScreenShot(){
    	
    	byte[]  screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    	Allure.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    	//Nodejs.addAttachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    	System.out.println("Se toma captura de pantala: " + "Screenshot");
    	return screenshot;
 	
   	}    	   

    */    
    
       public byte[] attachScreenShot(String testCapturaInforme ){
    	
    	byte[]  screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    	Allure.addAttachment(testCapturaInforme, new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES))); ; 
    	System.out.println("Se toma Camputa de la pantalla: ALLURE");
    	return screenshot;
 	
   	}    	   
    	
      
   
   //Toma screenshot a un elemento de la pagina
   public static void takeSnapShot(WebElement element,String fileWithPath) throws Exception{

       //Convert web driver object to TakeScreenshot
	   TakesScreenshot scrShot =((TakesScreenshot)element);
	   
       //Call getScreenshotAs method to create image file
	   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	   
	   //Move image file to new destination
	   File DestFile=new File(fileWithPath);
	   
	   //Copy file at destination
	   FileUtils.copyFile(SrcFile, DestFile);

   }
            

	@SuppressWarnings("unused")
	private String readProperties(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//Manejo de los mensajes emergentes
	
	public void acceptAlert(String want) throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);  //EXPLICIT_TIMEOUT);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println( alert.getText());
			if(want == "accept") {
				alert.accept();
				System.out.println("Se cierra mensaje emergente accept:  " + want);
			}else {
				alert.dismiss();
				System.out.println("Se cierra mensaje emergente dismiss:  " + want);
			}
		}catch (Exception e){
			throw new Exception("Error al cerrar el mensaje: " + e.getMessage());			
		}
	}

	
	
	public void dismissAlert() throws Exception {
		try {
			WebDriverWait wait = new WebDriverWait(driver,10);  //EXPLICIT_TIMEOUT);
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			System.out.println( alert.getText());
			alert.dismiss();
			System.out.println("Se cierra mensaje emergente accept");
		}catch (Exception e){
			throw new Exception("Error al cerrar el mensaje: " + e.getMessage());			
		}

	}
	
	// Para subir archivos desde una ventana del Win
	
	public void cargarArchvioDesdeWin (String rutaEjecutable) throws IOException, InterruptedException {
		//Runtime.getRuntime().exec("C:\\eclipse-workspace_ANLA\\Ejecutables_Subir_Archivos\\1.ArchivoAportes");
		Runtime.getRuntime().exec(rutaEjecutable);
		//Runtime.getRuntime().exec("./src/test/resources/archivos/AbrirArchivoAportes");
		Thread.sleep(2000);

	}
	
	
	
	
}

