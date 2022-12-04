package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Pom_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='button' and @name='logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	} 
public Logout_Pom_Page(WebDriver d)
{
	driver=d;
	PageFactory.initElements(driver,this);
}
}
