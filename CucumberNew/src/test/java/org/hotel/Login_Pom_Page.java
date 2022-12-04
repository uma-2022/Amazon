package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom_Page {
	public WebDriver driver;
 @FindBy(xpath="//input[@type='text' and @name='username']")
 private WebElement usrname;
 
 
@FindBy(xpath="//input[@type='password' and @name='password']")
 private WebElement password;

@FindBy(xpath="//input[@type='Submit' and @name='login']")
private WebElement login;
	
	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	   	
	public WebElement getUsrname() {
		return usrname;
	}
	public Login_Pom_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

}
