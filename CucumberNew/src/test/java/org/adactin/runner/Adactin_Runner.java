package org.adactin.runner;
import org.hotel.Pom_Base_Store;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		  features= ".//FeatureFile",		
		  glue="org.adactin.stepdef",
		  dryRun=false,
		  plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		  monochrome=true,		 
		  publish=false	,	  
		  tags= "@Ad1 or @Ad2"
		  
		)

public class Adactin_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver=Pom_Base_Store.browser_Config("chrome");
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	

}
