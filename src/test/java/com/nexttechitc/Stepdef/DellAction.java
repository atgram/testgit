package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver;
	@Given("^user visits dell homepage$")
	public void user_visits_dell_homepage() throws Throwable {
	   
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  
	// open URL
		driver.get("https://www.dell.com/en-us");
     Thread.sleep(3000);
	driver.manage().window().maximize();
		
		
		
	}

	@When("^user go to dell IT infrastructure dropdown menu will be able to view all product$")
	public void user_go_to_dell_IT_infrastructure_dropdown_menu_will_be_able_to_view_all_product() throws Throwable {
	 
		Actions act=new Actions(driver);
		DellActionPOM obj =new DellActionPOM (driver);
		act.moveToElement(obj.ITinfrastructure()).build().perform();
		obj.Developers().click();
	}

	@Then("^user redirects to IT infrastructure portfolio$")
	public void user_redirects_to_IT_infrastructure_portfolio() throws Throwable {
	    
	}


	
	
}
