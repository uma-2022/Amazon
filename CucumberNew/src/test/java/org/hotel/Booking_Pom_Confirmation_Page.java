package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Pom_Confirmation_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='checkbox' and @name='check_all']")
	private WebElement check_Box;
	@FindBy(xpath="//input[@type='submit' and @name='cancelall']")
    private WebElement cancel_Selected;

	public WebElement getCheck_Box() {
		return check_Box;
	}

	public WebElement getCancel_Selected() {
		return cancel_Selected;
	}

	
	public Booking_Pom_Confirmation_Page(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
