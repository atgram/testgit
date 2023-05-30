package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class iphone14 {

	WebDriver driver;
	@Given("^User visits iphone(\\d+) homepage$")
	public void user_visits_iphone_homepage(int arg1) throws Throwable {   

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.iphone14.com/");
      Thread.sleep(3000);
	
	
	
	

	}

	@When("^User write iphone(\\d+)$")
	public void user_write_iphone(int arg1) throws Throwable {
	    
	}

	@Then("^User should be able to redirect the iphone(\\d+) homepage$")
	public void user_should_be_able_to_redirect_the_iphone_homepage(int arg1) throws Throwable {
	    
	}


	
	
	
	
	
	
	
	
	
}
