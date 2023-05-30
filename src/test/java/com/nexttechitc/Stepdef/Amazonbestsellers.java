package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestsellers {
	
	WebDriver driver; 
	
	@Given("^User visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.amazon.com/");
      Thread.sleep(3000);
		
	
	
	
	
	
	}

	
	
	@When("^User clicks on Amazon bestsellers$")
	public void user_clicks_on_Amazon_bestsellers() throws Throwable {
	    
	
	}

	
	
	@Then("^User should be able to redirect bestsellers page$")
	public void user_should_be_able_to_redirect_bestsellers_page() throws Throwable {


	}


	
	
}
