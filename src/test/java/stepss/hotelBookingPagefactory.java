package stepss;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class hotelBookingPagefactory
	{

		WebDriver driver;
		
		@FindBy(how=How.ID, using="Hotel Booking") 
	    WebElement title; 
		
		@FindBy(how=How.ID, using="txtFirstName") 
	    WebElement firstname; 
		
		@FindBy(how=How.ID, using="txtLastName") 
	    WebElement lastname; 
		
		@FindBy(how=How.ID, using="txtEmail") 
	    WebElement email; 
		
		@FindBy(how=How.ID, using="txtPhone") 
	    WebElement phone; 
		
		@FindBy(how=How.XPATH, using="/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea") 
	    WebElement address; 
		
		@FindBy(how=How.ID_OR_NAME, using="city") 
	    WebElement city; 
		
		@FindBy(how=How.ID_OR_NAME, using="state") 
	    WebElement state; 
		
		@FindBy(how=How.ID_OR_NAME, using="persons") 
	    WebElement person; 
		
		@FindBy(how=How.ID, using="txtCardholderName") 
	    WebElement cardholdername; 
		
		@FindBy(how=How.ID, using="txtDebit") 
	    WebElement debitcardnumer; 
		
		@FindBy(how=How.ID, using="txtCvv") 
	    WebElement cvv; 
		
		@FindBy(how=How.ID, using="txtMonth") 
	    WebElement expirymonth; 
		
		@FindBy(how=How.ID, using="txtYear") 
	    WebElement expiryyear; 
		
		
		public void title()
		{
			String s1=title.getText();
			String actual="Hotel Booking";
			boolean b=s1.equals(actual);
			if(b==true)
			{
				System.out.println("title is correct");
			}
			else 
			{
				System.out.println("title is not correct");
			}
		}
		
		public void numbe(String number)
		{
			phone.sendKeys(number);
			
		}
		
		public hotelBookingPagefactory(WebDriver driver)
		{
			this.driver=driver;
			//PageFactory.initElements(driver, this);
		}
		
	}



