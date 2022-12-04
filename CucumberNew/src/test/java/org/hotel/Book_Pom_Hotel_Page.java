package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Pom_Hotel_Page {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement first_Name;
	@FindBy(xpath="//input[@name='last_name' and @id='last_name']")
	private WebElement last_Name;
	@FindBy(xpath="//textarea[@id='address' and @name='address']")
	private WebElement address;
	@FindBy(xpath="//input[@name='cc_num' and @id='cc_num']")
	private WebElement credit;		
	@FindBy(xpath="//select[@id='cc_type']")
	private WebElement card_Type;	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	private WebElement month;
	@FindBy(xpath="//select[@id='cc_exp_year']")
	private WebElement year;
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement ccv;
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement book_Btn;
	public WebElement getFirst_Name() {
		return first_Name;
	}
	
	public WebElement getLast_Name() {
		return last_Name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCredit() {
		return credit;
	}
	public WebElement getCard_Type() {
		return card_Type;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBook_Btn() {
		return book_Btn;
	}
	
	
	public Book_Pom_Hotel_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	}

