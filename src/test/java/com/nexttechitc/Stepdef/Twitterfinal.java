package com.nexttechitc.Stepdef;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import com.nexttechitc.pageobjectmodel.TwitterfinalPOM;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class Twitterfinal {
	    WebDriver driver;
		@Given("^user visiting Twiter url$")
		public void user_visiting_Twiter_url() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			 
			 //implicit wait
			// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			// how to open URL		                                                                       
			  driver.get("https://twitter.com/i/flow/signup");
		      Thread.sleep(3000);
		    // Maximize the window
		      driver.manage().window().maximize(); 
		}

		@When("^user click create account and enter \"([^\"]*)\" and valid \"([^\"]*)\"$")
		public void user_click_create_account_and_enter_and_valid(String arg1, String arg2) throws Throwable {
		      TwitterfinalPOM obj = new TwitterfinalPOM(driver);
		      obj.createaccount().click();
		      obj.name().sendKeys(arg1);
		      obj.number().sendKeys(arg2);	}

		@When("^user click dropdown Month and dropdown Day and dropdown Year$")
		public void user_click_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
			TwitterfinalPOM obj = new TwitterfinalPOM(driver);
			Select dropdown=new Select (obj.click_month);
			dropdown.selectByIndex(2);
			Thread.sleep(3000);
			Select dropdown1=new Select (obj.click_day);
			dropdown1.selectByValue("2");
			Thread.sleep(3000);
			Select dropdown2=new Select (obj.click_year);
			dropdown2.selectByVisibleText("1990");
			Thread.sleep(3000);
		}

		@Then("^user will be able to click on next button$")
		public void user_will_be_able_to_click_on_next_button() throws Throwable {
			TwitterfinalPOM  obj = new TwitterfinalPOM (driver);
			   obj.nextbutton().click();

		}




	}
	

