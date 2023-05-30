package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.googlesigninPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class googlesignin {

	WebDriver driver;
	@Given("^user visits google signin$")
	public void user_visits_google_signin() throws Throwable {
	  
	    //  open  the browser

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
						  driver = new ChromeDriver();
						  
					
		 // open URL
						driver.get("https://accounts.google.com");
		                Thread.sleep(3000);
		                
		  //maximize the window
		            driver.manage().window().maximize();    
	
	
	}
	@When("^user type valid \"([^\"]*)\"  and valid \"([^\"]*)\" and click on next button$")
	public void user_type_valid_and_valid_and_click_on_next_button(String arg1, String arg2) throws Throwable {
	  
		
		
	

		 googlesigninPOM type =new googlesigninPOM(driver);
		 type.email().sendKeys(arg1);
		 type.password().sendKeys(arg2);
		 type.next(). click();
		 
		 
		 
		 // type.password().sendKeys(arg2);
		
		
	}

	@Then("^user should be able to signin to google account$")
	public void user_should_be_able_to_signin_to_google_account() throws Throwable {
	   
	}


	
	
	
}
