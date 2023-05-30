package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.FacebookloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin {
     
	     WebDriver driver;
	     @Given("^User visits facebook home page$")		    
		  public void user_visiting_facebook_url() throws Throwable {		
//how to open  the browser
          System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();

//how to open URL
		  driver.get("https://www.facebook.com/login/");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
	     }

	@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enters_valid_and_valid(String arg1, String arg2) throws Throwable {
	    
		FacebookloginPOM enter= new FacebookloginPOM(driver);
		enter.email().sendKeys(arg1);
		enter.password().sendKeys(arg2);
	
	}
	

	@When("^User clicks on iogin button$")
	public void user_clicks_on_login_button() throws Throwable {
	    
		FacebookloginPOM button = new FacebookloginPOM(driver);
		button.login().click();
	}

	@Then("^user will be able to successfully login\\.$")
	public void user_will_be_able_to_successfully_login() throws Throwable {
	    
	}


}
