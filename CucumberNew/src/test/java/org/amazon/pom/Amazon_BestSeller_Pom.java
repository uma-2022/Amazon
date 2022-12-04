package org.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_BestSeller_Pom {
	public WebDriver driver;
	@FindBy(xpath="//a[text()='Best Sellers']")
	private WebElement bestSeller;	
	@FindBy(xpath="//a[@class='a-link-normal']/div/img[1]")
	private WebElement bag;
	@FindBy(xpath="//div[@class='twisterSwatchWrapper_0 twisterSwatchWrapper twisterImages thinWidthOverride']/div/img[@class='imgSwatch'][1]")
	private WebElement color;	
	@FindBy(xpath="//select[@name='quantity' and @id='quantity']")
	private WebElement quan;
	@FindBy(xpath="//input[@title='Add to Shopping Cart' and @type='submit']")
	private WebElement addCart;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getBestSeller() {
		return bestSeller;
	}
	
	public WebElement getBag() {
		return bag;
	}
	
	public WebElement getColor() {
		return color;
	}
	
	public WebElement getQuan() {
		return quan;
	}
	
	public WebElement getAddCart() {
		return addCart;
	}
	public Amazon_BestSeller_Pom (WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);

	}
}
