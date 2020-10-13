package com.Krakenlab.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)

@CucumberOptions(
		
		features = {"src/test/resources/features"},
		glue = {"com.Krakenlab.gluecode", "com.Krakenlab.hooks"},
		plugin = {"json:reporte_node/report/cucumber-TestCompleto-report.json"}
		
		//snippets = {SnippetType.CAMELCASE} 
		//monochrome = true
		)

public class TestRunner {
	
   //para generar el reporte
	@AfterClass
    public static void finishReport() {
	   //Ejecuta la creacion del reporte duspues de ejecutar la prueba
		try {
			System.out.println("                                                                          ");
			System.out.println("***************************************************************************************************");
			System.out.println("Generando reporte");
			System.out.println("***************************************************************************************************");
		    System.out.println("                                                                          ");
		    String[] cmd = {"cmd.exe", "/c", "npm run report"};
		    Runtime.getRuntime().exec(cmd);
		    System.out.println("                                                                          ");
		    System.out.println("***************************************************************************************************");
		    System.out.println("Reporte generado Exitosamente!!!");
		    System.out.println("***************************************************************************************************");
		    System.out.println("                                                                          ");
		    
	   } catch (Exception ex) {
		   ex.printStackTrace();
	   }
    }  
	
}
