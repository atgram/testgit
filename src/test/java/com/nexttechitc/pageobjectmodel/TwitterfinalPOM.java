package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterfinalPOM {

	WebDriver driver;
	public TwitterfinalPOM (WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);


}
	@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/div")	   
	  WebElement click_createaccount; 
	  public WebElement createaccount(){
	  return click_createaccount;
	  
}
	@FindBy(name="name")
	  WebElement enter_name;
	  public WebElement name() {
	     return enter_name;	  
	  }
	     @FindBy(name="phone_number")
			WebElement enter_phone_number;
			public WebElement number() {
			return enter_phone_number;
			  }

    @FindBy(id="SELECTOR_1")
			public WebElement click_month;
			  
	@FindBy(id="SELECTOR_2")
			public WebElement click_day;
			  
		 @FindBy(id="SELECTOR_3")
			  public WebElement click_year;

		 @FindBy(xpath="//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div")
		  WebElement click_next_button;
		  public WebElement nextbutton() {
		  return click_next_button;
		  }
}