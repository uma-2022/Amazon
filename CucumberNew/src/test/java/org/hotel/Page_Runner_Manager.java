package org.hotel;

import org.openqa.selenium.WebDriver;

public class Page_Runner_Manager {
	public WebDriver driver;
	private Booked_Pom_Itinerary_Page it;
	private Booking_Pom_Confirmation_Page confirm;
	private Login_Pom_Page login;
	private Logout_Pom_Page logout;
	private Search_Pom_Hotel_Page search;
	private Select_Pom_Hotel_Page select;	
	private Book_Pom_Hotel_Page book;
	
	public Book_Pom_Hotel_Page getBook() {
		if(book==null)
		{
		book=new Book_Pom_Hotel_Page(driver);
		}
		return book;
	}
	public  Booked_Pom_Itinerary_Page getIt() {
		if(it==null)
		{
		it= new  Booked_Pom_Itinerary_Page(driver);
		}
		return it;
	}
	public Booking_Pom_Confirmation_Page getConfirm() {
		if(confirm==null)
		{
		confirm=new Booking_Pom_Confirmation_Page(driver);
		}
		return confirm;
	}
	public Login_Pom_Page getLogin() {
		if(login==null)
		{
		login=new Login_Pom_Page(driver);
		}
		return login;
	}
	public Logout_Pom_Page getLogout() {
		if(logout==null)
		{
		logout=new Logout_Pom_Page(driver);
		}
		return logout;
	}
	public Search_Pom_Hotel_Page getSearch() {
		if(search==null)
		{
		search=new Search_Pom_Hotel_Page(driver);
		}
		return search;
	}
	public Select_Pom_Hotel_Page getSelect() {
		if(select==null)
		{
		select= new Select_Pom_Hotel_Page(driver);
		}
		return select;
	}

public Page_Runner_Manager(WebDriver driver)
{
	this.driver=driver;
}
}
	
	
	


