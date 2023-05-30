package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.amazonpharmacyPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonpharmacy {

	WebDriver driver;
	@Given("^user visits amazon homepage$")
	public void user_visits_amazon_homepage() throws Throwable {
	    
		   //  open  the browser

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
								  driver = new ChromeDriver();
								  
							
				 // open URL
								driver.get("https://www.amazon.com/");
				                Thread.sleep(3000);
				                
				  //maximize the window
				            driver.manage().window().maximize();    

		
		
		
		
	}

	@When("^user type \"([^\"]*)\" and click on search icon$")
	public void user_type_and_click_on_search_icon(String arg1) throws Throwable {
	   
		amazonpharmacyPOM phar=new amazonpharmacyPOM(driver);
		phar.pharmacy().sendKeys(arg1);
		phar.searchicon().click();
		
		
	}

	@Then("^user should be able to go to pharmacy page$")
	public void user_should_be_able_to_go_to_pharmacy_page() throws Throwable {
	   	}


	
}
