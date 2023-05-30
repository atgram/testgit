package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.AmazonmensshoePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonmensshoe {

	WebDriver driver;
	
	@Given("^user visits Amazon home page$")
	public void user_visits_Amazon_home_page() throws Throwable {
	   
		//open browser
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  driver = new ChromeDriver();
			  
		// open URL
			driver.get("https://www.amazon.com/");
	      Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@When("^user type\"([^\"]*)\" and click on search icon$")
	public void user_type_and_click_on_search_icon(String arg1) throws Throwable {
	   
		AmazonmensshoePOM shoe = new AmazonmensshoePOM(driver);
		shoe.productname().sendKeys(arg1);
		shoe.searchicon().click();
		
	
	}

	@Then("^user should be able to see the shoes$")
	public void user_should_be_able_to_see_the_shoes() throws Throwable {
	    
	}
	
	
}
