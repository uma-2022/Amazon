@Ad
Feature: Hotel Booking
@Ad1
Scenario Outline: Login Page
Given user Launch The Url Page
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Btn and It Navigates To Adactin.com-Search Hotel 
Examples:
|Username|Password|
|Aaa|globe123|
|Baa|nature123|
|umamahes|world123|

@Ad2
Scenario: Search Hotel Page
When user Select Location From The Drop Down Menu Field
And user Select Hotels From The Drop Down Menu Field
And user Select RoomType From The Drop Down Menu Field
And user Select Number of Rooms From the Drop Down Menu Field
And user Enter the Checkin Date In Checkin Field
And user Enter the Checkout Date In Checkout Field
And user Select Adults Per Room From The Drop Down Menu Field
And user Select Children From the Drop Down Menu Field
Then user Click On the Search Btn and It Navigates To "Adactin.com-Select Hotel" Page

@Ad2
Scenario: Select Hotel Page
When user Click On The Radio Btn 
Then user Click On The Continue Btn and It Navigates To "Adactin.com-Book A Hotel" Page

@Ad2
Scenario: Book  Hotel Page
When user Enter The Firstname In Firstname Field
And user Enter The Lastname In Lastname Field
And user Enter The Billingaddress  In Billingaddress Field
And user Enter The Creditcardno In Creditcardno Field
And user Select Creditcardtype  From SelectCreditcardtype  Dropdown Field
And user Select Expirydate  From  Selectmonth Dropdown Field
And user Select Expirydate  From Selectyear Dropdown Field
And user Enter CVVnumber In CVVnumber Field
Then user Click On The Booknow Btn and It Navigates To "Adactin.com-Hotel Booking Confirmation" Page

@Ad3
Scenario: Booking Confirmation Page
Then user Click On The My Itinerary Btn and It Navigates To "Adactin.com-Select Hotel" Page
@Ad3
Scenario: Booked Itinerary Page
When user Click On The Checkbox Btn
And user Click On The Cancelselected Btn and It Naviates To Simplealertprompt
Then user Click On The Ok Btn and It Navigates To "Adactin.com-Logout" Page

@Ad3
Scenario: Booked Logout Page
When user Click On The Logout Btn and It Navigates To "Adactin.com-Hotel Reservation" Page