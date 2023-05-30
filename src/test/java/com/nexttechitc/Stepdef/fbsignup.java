package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.pageobjectmodel.fbsignupPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fbsignup {

	        WebDriver driver;
	        @Given("^user visiting facebook url$")
	        public void user_visiting_facebook_url() throws Throwable {		
//how to open  the browser
             System.setProperty("webdriver.chrome.driver", "C:\\Users\\mzhu7\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
					  
						
//how to open URL
			driver.get("https://www.facebook.com/signup");
			Thread.sleep(3000);
			driver.manage().window().maximize();	
	}

	@When("^user enter \"([^\"]*)\" and\"([^\"]*)\" and valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and_and_valid_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		fbsignupPOM signup = new fbsignupPOM(driver);
		signup.firstname().sendKeys(arg1);
		signup.lastname().sendKeys(arg2);
		signup.email().sendKeys(arg3);
		signup.password().sendKeys(arg4);
		
	}

	@Then("^user select dropdown Month and dropdown Day and dropdown Year$")
	public void user_select_dropdown_Month_and_dropdown_Day_and_dropdown_Year() throws Throwable {
		
		fbsignupPOM sign =new fbsignupPOM(driver);
		Select dropdown=new Select (sign.click_month);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		Select dropdown1=new Select (sign.click_day);
		dropdown1.selectByValue("2");
		Thread.sleep(3000);
		Select dropdown2=new Select (sign.click_year);
		dropdown2.selectByVisibleText("2000");
		Thread.sleep(3000);
		Select dropdown3=new Select (sign.click_gender);
		dropdown3.selectByValue("gender");
		Thread.sleep(3000);
		driver.quit();
	}

	}	
	

