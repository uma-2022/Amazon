package org.adactin.stepdef;

import org.adactin.base.Pom_Base_Store;
import org.hotel.Page_Runner_Manager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Step_Def extends Pom_Base_Store {
	public static WebDriver driver = Pom_Base_Store.browser_Config("chrome");
	public static Page_Runner_Manager manager = new Page_Runner_Manager(driver);

	@Given("user Launch The Url Page")
	public void user_launch_the_url_page() {
		get_Url("https://adactinhotelapp.com/index.php");

	}
	@When("user Enter The {string} In Username Field")
	public void user_enter_the_in_username_field(String Username) {

		send_Keys(manager.getLogin().getUsrname(),Username );
	}

	
	@When("user Enter The {string} In Password Field")
	public void user_enter_the_in_password_field(String Password) {
		send_Keys(manager.getLogin().getPassword(),Password );
	}
		
	@Then("user Click On The Login Btn and It Navigates To Adactin.com-Search Hotel")
	public void user_click_on_the_login_btn_and_it_navigates_to_adactin_com_search_hotel() {
		click_On_Element(manager.getLogin().getLogin());
	}

	
	
	@When("user Select Location From The Drop Down Menu Field")
	public void user_select_location_from_the_drop_down_menu_field() {
		drop_Down_Text(manager.getSearch().getLocation(), "Sydney");
	}
	

	@When("user Select Hotels From The Drop Down Menu Field")
	public void user_select_hotels_from_the_drop_down_menu_field() {
		drop_Down_Text(manager.getSearch().getHotels(), "Hotel Creek");
	}

	@When("user Select RoomType From The Drop Down Menu Field")
	public void user_select_room_type_from_the_drop_down_menu_field() {
		drop_Down_Index(manager.getSearch().getRoom_Type(), 2);
	}

	@When("user Select Number of Rooms From the Drop Down Menu Field")
	public void user_select_number_of_rooms_from_the_drop_down_menu_field() {
		drop_Down_Text(manager.getSearch().getNo_Rooms(), "2 - Two");
	}

	@When("user Enter the Checkin Date In Checkin Field")
	public void user_enter_the_checkin_date_in_checkin_field() {
		send_Keys(manager.getSearch().getCheck_In(), "01/11/2022");
	}

	@When("user Enter the Checkout Date In Checkout Field")
	public void user_enter_the_checkout_date_in_checkout_field() {
		send_Keys(manager.getSearch().getCheck_Out(), "03/11/2022");
	}

	@When("user Select Adults Per Room From The Drop Down Menu Field")
	public void user_select_adults_per_room_from_the_drop_down_menu_field() {
		drop_Down_Id(manager.getSearch().getAdult_Room(), "1");
	}

	@When("user Select Children From the Drop Down Menu Field")
	public void user_select_children_from_the_drop_down_menu_field() {
		drop_Down_Id(manager.getSearch().getChild_Room(), "2");
	}
	@Then("user Click On the Search Btn and It Navigates To {string} Page")
	public void user_click_on_the_search_btn_and_it_navigates_to_page(String expectedResult) {
	click_On_Element(manager.getSearch().getSearch());
    Assert.assertEquals(expectedResult,"Adactin.com-Select Hotel");
	}

	@When("user Click On The Radio Btn")
	public void user_click_on_the_radio_btn() {
		click_On_Element(manager.getSelect().getSelect());

	}
	
	@Then("user Click On The Continue Btn and It Navigates To {string} Page")
	public void user_click_on_the_continue_btn_and_it_navigates_to_page(String expected) {
		click_On_Element(manager.getSelect().getCon());
		Assert.assertEquals(expected,"Adactin.com-Book A Hotel");
	}
	@When("user Enter The Firstname In Firstname Field")
	public void user_enter_the_firstname_in_firstname_field() {
		send_Keys(manager.getBook().getFirst_Name(), "Uma");
	}

	@When("user Enter The Lastname In Lastname Field")
	public void user_enter_the_lastname_in_lastname_field() {
		send_Keys(manager.getBook().getLast_Name(), "Ramadoss");
	}

	@When("user Enter The Billingaddress  In Billingaddress Field")
	public void user_enter_the_billingaddress_in_billingaddress_field() {
		send_Keys(manager.getBook().getAddress(), "No 10,road,India");
	}

	@When("user Enter The Creditcardno In Creditcardno Field")
	public void user_enter_the_creditcardno_in_creditcardno_field() {
		send_Keys(manager.getBook().getCredit(), "1234567890123456");
	}

	@When("user Select Creditcardtype  From SelectCreditcardtype  Dropdown Field")
	public void user_select_creditcardtype_from_select_creditcardtype_dropdown_field() {
		drop_Down_Id(manager.getBook().getCard_Type(), "MAST");
	}

	@When("user Select Expirydate  From  Selectmonth Dropdown Field")
	public void user_select_expirydate_from_selectmonth_dropdown_field() {
		drop_Down_Text(manager.getBook().getMonth(), "February");
	}

	@When("user Select Expirydate  From Selectyear Dropdown Field")
	public void user_select_expirydate_from_selectyear_dropdown_field() {
		drop_Down_Text(manager.getBook().getYear(), "2013");
	}

	@When("user Enter CVVnumber In CVVnumber Field")
	public void user_enter_cv_vnumber_in_cv_vnumber_field() {
		send_Keys(manager.getBook().getCcv(), "789");
	}

	
	@Then("user Click On The Booknow Btn and It Navigates To {string} Page")
	public void user_click_on_the_booknow_btn_and_it_navigates_to_page(String expected) {
		click_On_Element(manager.getBook().getBook_Btn());
		Assert.assertEquals(expected,"Adactin.com-Hotel Booking Confirmation");
	}	

	

	@Then("user Click On The My Itinerary Btn and It Navigates To Adactin.com-Select Hotel")
	public void user_click_on_the_my_itinerary_btn_and_it_navigates_to_adactin_com_select_hotel() {
		click_On_Element(manager.getIt().getItin());
	}

	@When("user Click On The Checkbox Btn")
	public void user_click_on_the_checkbox_btn() {
		
		click_On_Element(manager.getConfirm().getCheck_Box());	
		
	}	

	@When("user Click On The Cancelselected Btn and It Naviates To Simplealertprompt")
	public void user_click_on_the_cancelselected_btn_and_it_naviates_to_simplealertprompt() {
		click_On_Element(manager.getConfirm().getCancel_Selected());
	}
	@Then("user Click On The Ok Btn and It Navigates To Adactin.com-Logout")
	public void user_click_on_the_ok_btn_and_it_navigates_to_adactin_com_logout() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	
	@When("user Click On The Logout Btn and It Navigates To {string} Page")
	public void user_click_on_the_logout_btn_and_it_navigates_to_page(String expectedResult) {
		click_On_Element(manager.getLogout().getLogout());
		Assert.assertEquals(expectedResult,"Adactin.com-Hotel Reservation");
	}
}