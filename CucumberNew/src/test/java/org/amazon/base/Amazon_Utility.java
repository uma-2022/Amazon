package org.amazon.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Utility {
	public static WebDriver driver;

	public static WebDriver browser_Config(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Brave\\eclipse-workspace\\CucumberNew\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Brave\\eclipse-workspace\\Selenium_Programs\\Edgedriver\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		return driver;
	}

	public static void window_Commands(String commands) {
		if (commands.equalsIgnoreCase("maximize"))
			driver.manage().window().maximize();
		else if (commands.equalsIgnoreCase("minimize"))
			driver.manage().window().minimize();
		else if (commands.equalsIgnoreCase("fullscreen"))
			driver.manage().window().fullscreen();
	}
	public static void implicitly_Wait(int seconds)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

	public static void get_Url(String url) {
		driver.get(url);
	}

	public static void navigate_To(String url) {

		driver.navigate().to(url);

	}

	public static void naviagation_Commands(String commands) {
		if (commands.equalsIgnoreCase("forawrd")) {
			driver.navigate().forward();
		} else if (commands.equalsIgnoreCase("back")) {
			driver.navigate().back();

		} else if (commands.equalsIgnoreCase("refresh")) {
			driver.navigate().refresh();
		}
	}

	public static void send_Keys(WebElement element, String value) {
		element.sendKeys(value);
	}
	public static void click_On_Element(WebElement element) {
		element.click();
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void move_To_Element(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}
	public static void actions_Click(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}
	public static void sleep(long l) throws InterruptedException {
		Thread.sleep(l);
	}

	public static void drop_Down_Index(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void drop_Down_Id(WebElement element, String id) {

		Select s = new Select(element);
		s.selectByValue(id);

	}

	public static void drop_Down_Text(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}
	public static void frame_Switch(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void java_Script(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		js.executeScript("arguments[0].click()", element);

	}

	public static void screen_Shot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(path);
		FileUtils.copyFile(src, des);

	}

	public static List<WebElement> get_Options(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static void close() {

		driver.close();

	}

	public static void quit() {

		driver.quit();

	}

	public static boolean element_Enabled(WebElement element) {

		boolean enabled = element.isEnabled();
		return enabled;
	}

	public static boolean element_isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static boolean element_isSelected(WebElement element) {

		boolean selected = element.isSelected();
		return selected;
	}

	public static String get_Text(WebElement element) {

		String text = element.getText();
		return text;
	}

	public static String get_Attribute(String attribute_Name) {

		return attribute_Name;

	}
	
	
	
	public static void window(String s) {
		String id=driver.getWindowHandle();
		Set<String> all_Id=driver.getWindowHandles();
		for (String id1 : all_Id) {
			if(id1==id)
			{
				continue;
			}
			else
			{
				driver.switchTo().window(id);
		
			}
			
		}
		
	}
	}








