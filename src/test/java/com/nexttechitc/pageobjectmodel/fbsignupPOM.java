 package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbsignupPOM {

	WebDriver driver;
	public  fbsignupPOM  (WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
		   }
		 
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")
	WebElement edit_firstname;
	public WebElement firstname() {
	return edit_firstname;
	  }
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")
	WebElement edit_lastname;
	public WebElement lastname() {
	return  edit_lastname;
	   }
	    
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")
	WebElement edit_email;
	public WebElement email() {
	return  edit_email;
	}


	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input")
	 WebElement edit_password;
	 public WebElement password() {
	 return  edit_password;
	    
	 }

	 
	  @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]")
	  public WebElement click_month;
	      
	        
	   @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]")
	  public WebElement click_day;
	                  
	   @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]")
	  public WebElement click_year;


       @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input")
       public WebElement click_gender;
    
       }        