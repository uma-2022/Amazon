package org.hotel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Pom_Hotel {
	
	    public static WebDriver driver;
	    
	    public static WebDriver browser_Config(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Brave\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Brave\\eclipse-workspace\\Selenium_Programs\\Edgedriver\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			return driver;
		}
	    
	    public static void navigation_commands(String commands) {
	    	
	    		if(commands.equalsIgnoreCase("maximize"))
	    		{
	    		driver.manage().window().maximize();
	    		}
	    		else if(commands.equalsIgnoreCase("minimize")) 
                 {
	            driver.manage().window().minimize();
                 }
                 else if(commands.equalsIgnoreCase("fullscreen"))
                 {
                	 driver.manage().window().fullscreen();
		}
	    }
	    
	    
	    public static void get_Url(String value)
	    {
       driver.get(value);

		}
	    public static  void implicit_Wait(int seconds)
	    {
	    	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

		}
	    
	    public static void click_On_Element(WebElement element) {
			
			element.click();

		}

		public static void send_Keys(WebElement element,String value)
		{
			element.sendKeys(value);
			
			
		}

		public static void clear(WebElement element) {

			element.clear();
		}
		
		public static void drop_Down_Index(WebElement element,int index) {
			Select s=new Select(element);
			s.selectByIndex(index);

		}
		public static void drop_Down_Value(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByValue(value);

		}
		public static void drop_Down_Text(WebElement element,String text) {
			Select s=new Select(element);
			s.selectByVisibleText(text);

		}
		
		public static void screen_Shot(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("path");
			FileUtils.copyFile(src, des);
	       
			
		}
		

	}

	    
	    
	    
