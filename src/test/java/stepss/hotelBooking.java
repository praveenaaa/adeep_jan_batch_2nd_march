package stepss;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class hotelBooking {
	public static WebDriver driver;
    public hotelBookingPagefactory pagefac;
    
   
 @Before
 public void precondition_hotelBooking() throws InterruptedException
 {
	 //System.out.println("user_navigates_to_LoginPage()");
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		//driver.get("C:\\Users\\GKISTASH\\Desktop\\HTML\\HOTEL_BOOKING.html");
		Thread.sleep(3000);
		
		pagefac=new hotelBookingPagefactory(driver);
		pagefac= PageFactory.initElements(driver, hotelBookingPagefactory.class);
		Thread.sleep(3000);
 }
 
	@Given("User is on hotel booking page")
	public void user_is_on_hotel_booking_page() throws InterruptedException {
		System.out.println("user_navigates_to_LoginPage()");
		//System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		//driver= new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/html_hotel_booking.html");
		Thread.sleep(3000);
		
		//pagefac=new hotelBookingPagefactory(driver);
		//pagefac= PageFactory.initElements(driver, hotelBookingPagefactory.class);
		//Thread.sleep(3000);
		

	}

	@Then("check the title of the page")
	public void check_the_title_of_the_page() {
		pagefac.title();
		
	}

	@When("user enters all valid data")
	public void user_enters_all_valid_data() {

	}

	@Then("navigate to welcome page")
	public void navigate_to_welcome_page() {

	}

	@When("user leaves first Name blank")
	public void user_leaves_first_Name_blank() {

	}

	@When("clicks the button")
	public void clicks_the_button() {

	}

	@Then("display alert msg")
	public void display_alert_msg() {
		System.out.println("display alert msg");
	}

	@When("user leaves last Name blank and clicks the button")
	public void user_leaves_last_Name_blank_and_clicks_the_button() {

	}

	@When("user enters all data")
	public void user_enters_all_data() {

	}

//	@When("user enters incorrect email format and clicks the button")
//	public void user_enters_incorrect_email_format_and_clicks_the_button() {
//
//	}

	@When("user leaves MobileNo blank and clicks the button")
	public void user_leaves_MobileNo_blank_and_clicks_the_button() {

	}

//	@When("user enters incorrect (.*) format and clicks the button")
//	public void user_enters_incorrect_mobileNo_format_and_clicks_the_button(String number) throws InterruptedException {
//
//		pagefac.numbe(number);
//		Thread.sleep(3000);
//		//driver.findElement(By.id("txtPhone")).sendKeys("999999999");
//		System.out.println("ssss");
//	}
	@When("^user enters incorrect (\\d+) format and clicks the button$")
	public void user_enters_incorrect_format_and_clicks_the_button(String number) throws Throwable {
		System.out.println("ps");
		pagefac.numbe(number);
		Thread.sleep(3000);
		//driver.findElement(By.id("txtPhone")).sendKeys("999999999");
		System.out.println("ssss");
	}

	@When("user doesnot select city")
	public void user_doesnot_select_city() {

	}

	@When("user doesnot select state")
	public void user_doesnot_select_state() {

	}

	@When("user enters (.*)")
	public void user_enters(String s) {

	}

	@Then("allocate rooms such that 1 room for minimum 3 guest")
	public void allocate_rooms_such_that_room_for_minimum_guests() {

	}

	@When("user leaves CardHolderName blank and clicks the button")
	public void user_leaves_CardHolderName_blank_and_clicks_the_button() {

	}

	@When("user leaves DebitCardNo blank and clicks the button")
	public void user_leaves_DebitCardNo_blank_and_clicks_the_button() {

	}

	@When("user leaves expirationMonth blank and clicks the button")
	public void user_leaves_expirationMonth_blank_and_clicks_the_button() {

	}

	@When("user leaves expirationYr blank and clicks the button")
	public void user_leaves_expirationYr_blank_and_clicks_the_button() {

	}


}
