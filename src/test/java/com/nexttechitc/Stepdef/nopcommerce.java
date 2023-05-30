package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class nopcommerce {

	WebDriver driver;
	@Given("^User visits nopcommerce homepage$")
	public void user_visits_nopcommerce_homepage() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// how to open URL
		driver.get("https://www.nopcommerce.com/");
      Thread.sleep(3000);
		
		
	
	
	
	}

	@When("^user write nopcommerce and enter$")
	public void user_write_nopcommerce_and_enter() throws Throwable {
	   
	}

	@Then("^User should be able to redirect nopcommerce home page$")
	public void user_should_be_able_to_redirect_nopcommerce_home_page() throws Throwable {
	   
	}











}
