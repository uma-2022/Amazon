package org.adactin.stepdef;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hotel.Page_Runner_Manager;
import org.hotel.Pom_Base_Store;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Pom_Runner_Manager extends Pom_Base_Store {
	public static WebDriver driver = browser_Config("Chrome");;
	public static Page_Runner_Manager manager = new Page_Runner_Manager(driver);
	public static Logger log = Logger.getLogger(Pom_Runner_Manager.class);

	public static void main(String[] args) throws IOException {
		PropertyConfigurator.configure("log4j.properties");
		naviagation_Commands("maximize");
		get_Url("https://adactinhotelapp.com/index.php");
		implicitly_Wait(10);
		log.info("Session created.....");
		send_Keys(manager.getLogin().getUsrname(), "umamahes123");
		send_Keys(manager.getLogin().getPassword(), "world123");
		click_On_Element(manager.getLogin().getLogin());
		log.info("Session Closed");
		drop_Down_Text(manager.getSearch().getLocation(), "Sydney");
		drop_Down_Text(manager.getSearch().getHotels(), "Hotel Creek");
		drop_Down_Index(manager.getSearch().getRoom_Type(), 2);
		drop_Down_Text(manager.getSearch().getNo_Rooms(), "2 - Two");
		clear(manager.getSearch().getCheck_In());
		send_Keys(manager.getSearch().getCheck_In(), "01/11/2022");
		clear(manager.getSearch().getCheck_Out());
		send_Keys(manager.getSearch().getCheck_Out(), "03/11/2022");
		drop_Down_Id(manager.getSearch().getAdult_Room(), "1");
		drop_Down_Id(manager.getSearch().getChild_Room(), "2");
		click_On_Element(manager.getSearch().getSearch());
		click_On_Element(manager.getSelect().getSelect());
		click_On_Element(manager.getSelect().getCon());
		send_Keys(manager.getBook().getFirst_Name(), "Uma");
		send_Keys(manager.getBook().getLast_Name(), "Ramadoss");
		send_Keys(manager.getBook().getAddress(), "No 10,road,India");
		send_Keys(manager.getBook().getCredit(), "1234567890123456");
		drop_Down_Id(manager.getBook().getCard_Type(), "MAST");
		drop_Down_Text(manager.getBook().getMonth(), "February");
		drop_Down_Text(manager.getBook().getYear(), "2013");
		send_Keys(manager.getBook().getCcv(), "789");
		click_On_Element(manager.getBook().getBook_Btn());
		click_On_Element(manager.getIt().getItin());
		click_On_Element(manager.getConfirm().getCheck_Box());
		click_On_Element(manager.getConfirm().getCancel_Selected());
		Alert a = driver.switchTo().alert();
		a.accept();
		click_On_Element(manager.getLogout().getLogout());
		screen_Shot("C:\\Users\\Brave\\eclipse-workspace\\Nov_Project\\Screenshot\\hotelpom.png");

	}

}
