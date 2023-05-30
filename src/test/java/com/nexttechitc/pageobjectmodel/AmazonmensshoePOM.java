package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonmensshoePOM {
	
	WebDriver driver;
	
	public AmazonmensshoePOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	//xpath for searchfield  
	}
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement Type_productname;
	public  WebElement productname() {
		return Type_productname;
	}
	//xpath for seach icon
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement click_searchicon;
	public WebElement searchicon() {
		return click_searchicon;
	}
	
	
	
}
