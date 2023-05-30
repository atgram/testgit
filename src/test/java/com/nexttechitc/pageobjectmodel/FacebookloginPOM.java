package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPOM {
	   
	   WebDriver driver;
	   public  FacebookloginPOM (WebDriver driver) {
	   this.driver=driver;
	     PageFactory.initElements(driver, this);
	  }
	
	  @FindBy(id="email")
	  
	   WebElement enter_email;
	     
	   public WebElement email(){
	   return enter_email;
	   }
	
	   @FindBy(id="pass")
		 WebElement enter_password;
		 public WebElement password() {
		 return  enter_password;
		     }
		 
		 
		 @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button")
		 WebElement click_login;
		 public WebElement login() {
		return click_login;
		}

}