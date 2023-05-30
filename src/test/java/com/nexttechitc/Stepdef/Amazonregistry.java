package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonregistry {
  WebDriver driver;
	@Given("^User visits Amazon home page$")
	public void user_visits_Amazon_home_page() throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
	}

	@When("^User clicks on Amazon registry$")
	public void user_clicks_on_Amazon_registry() throws Throwable {
	    
	}

	@Then("^User should be able to redirect the Amazon registry page$")
	public void user_should_be_able_to_redirect_the_Amazon_registry_page() throws Throwable {
	    
	}


	
	
	
	
	
	
	
}
