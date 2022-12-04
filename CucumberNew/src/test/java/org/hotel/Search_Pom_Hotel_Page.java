package org.hotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Pom_Hotel_Page {
	public WebDriver driver;
	@FindBy(xpath="//select[@name='location' and @id='location']")
	private WebElement location; 
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNo_Rooms() {
		return no_Rooms;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult_Room() {
		return adult_Room;
	}

	public WebElement getChild_Room() {
		return child_Room;
	}

	public WebElement getSearch() {
		return search;
	}

	@FindBy(xpath="//select[@name='hotels' and @id='hotels']")
	private WebElement hotels;
	@FindBy(xpath="//select[@name='room_type' and @id='room_type']")
	private WebElement room_Type;
	@FindBy(xpath="//select[@name='room_nos' and @id='room_nos']")
	private WebElement no_Rooms;
	@FindBy(xpath="//input[@name='datepick_in' and @id='datepick_in']")
	private WebElement check_In;
	@FindBy(xpath="//input[@name='datepick_out' and @id='datepick_out']")
	private WebElement check_Out;
	@FindBy(xpath="//select[@name='adult_room' and @id='adult_room']")
	private WebElement adult_Room;
	@FindBy(xpath="//select[@name='child_room' and @id='child_room']")
	private WebElement child_Room;
	@FindBy(xpath="//input[@name='Submit' and @id='Submit']")
	private WebElement search;
	
	public Search_Pom_Hotel_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}