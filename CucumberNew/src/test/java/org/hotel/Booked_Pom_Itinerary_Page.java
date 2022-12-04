package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Pom_Itinerary_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='button' and @id='my_itinerary']")
	//@FindBy(xpath="//input[@type='button' and @value='My Itinerary']")
	 private WebElement itin;
	
public WebElement getItin() {
		return itin;
	}
	
public Booked_Pom_Itinerary_Page(WebDriver d)
{
	
	driver=d;
	PageFactory.initElements(driver,this); 
}
}
