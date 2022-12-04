package org.amazon.pom;

import java.io.IOException;

import org.amazon.base.Amazon_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Runner_Class  extends Amazon_Utility{
	public static WebDriver driver=browser_Config("chrome"); 
	public static  Amazon_BestSeller_PomMgr mgr=new Amazon_BestSeller_PomMgr(driver);

	
    public static void main(String[] args) throws InterruptedException, IOException {
    	get_Url("https://www.amazon.in/");
       	window_Commands("maximize");
    	implicitly_Wait(2000);
    	click_On_Element(mgr.getBest().getBestSeller());    	
    	click_On_Element(mgr.getBest().getBag());
    	click_On_Element(mgr.getBest().getColor());
    	Thread.sleep(2000);     	
    	drop_Down_Text(mgr.getBest().getQuan(),"2");    	
    	click_On_Element(mgr.getBest().getAddCart());
    	screen_Shot("C:\\Users\\Brave\\eclipse-workspace\\CucumberNew\\Screenshot\\amazon.png");
    	
}
	

}
