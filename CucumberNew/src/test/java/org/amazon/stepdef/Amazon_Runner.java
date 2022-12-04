package org.amazon.stepdef;

import org.amazon.base.Amazon_Utility;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= ".//FeatureFile//Amazon.feature",		
		glue="org.amazon.stepdef",
		dryRun=false,
		monochrome=true,
		publish=false,
		plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags="@Amaz")
		
		
		
	public class Amazon_Runner {
	    
	public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
			
		driver=Amazon_Utility.browser_Config("chrome");
		
		}
		
		
	@AfterClass
	public static void tearDown() {
			
		driver.close();
			
		}
		

		
	}


