package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Pom_Hotel_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@type='radio']")
	private WebElement select;
	@FindBy(xpath="//input[@id='continue']")
	private WebElement con;


	public WebElement getSelect() {
		return select;
	}

	public WebElement getCon() {
		return con;
	}


	public Select_Pom_Hotel_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}
