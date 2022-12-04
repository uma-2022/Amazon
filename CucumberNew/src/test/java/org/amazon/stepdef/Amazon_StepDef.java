package org.amazon.stepdef;

import org.adactin.base.Pom_Base_Store;
import org.amazon.base.Amazon_Utility;
import org.amazon.pom.Amazon_BestSeller_PomMgr;
import org.hotel.Page_Runner_Manager;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon_StepDef extends Amazon_Utility{
		
	public static WebDriver driver =Amazon_Utility.browser_Config("chrome");
	public static Amazon_BestSeller_PomMgr mgr = new Amazon_BestSeller_PomMgr(driver);
	
	@Given("user Launch The Url")
	public void user_launch_the_url() {
	    get_Url("https://www.amazon.in/");
	}
	@When("user Click Login With Their Own Id and Password")
	public void user_click_login_with_their_own_id_and_password() {
	   System.out.println("Login to amazon site");
	}
	
	@When("user Click On Best Sellers Link In Amazon Home Page")
	public void user_click_on_best_sellers_link_in_amazon_home_page() {
	   click_On_Element(mgr.getBest().getBestSeller());
	}
	@When("user Click On Bags Image")
	public void user_click_on_bags_image() {
	   click_On_Element(mgr.getBest().getBag());
	}
	@When("user Select The Colour Of The Product")
	public void user_select_the_colour_of_the_product() {
	    click_On_Element(mgr.getBest().getColor());
	}
	@When("user Add The Quantity Of The Product")
	public void user_add_the_quantity_of_the_product() {
	    click_On_Element(mgr.getBest().getQuan());
	}
	@Then("user click On The Add To Cart Btn")
	public void user_click_on_the_add_to_cart_btn() {
		click_On_Element(mgr.getBest().getAddCart());
	    
	}



}
