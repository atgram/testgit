package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonpharmacyPOM {
	
	WebDriver driver;
	
	public amazonpharmacyPOM(WebDriver driver) {		
	this.driver =driver;
	PageFactory.initElements(driver,this );
	
	//xpath for search field
	}
	@FindBy (xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement Type_pharmacy;
	public WebElement pharmacy() {
		return  Type_pharmacy;
	}
	//xpath for search icon
	@FindBy (xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement click_searchicon;
	public WebElement searchicon() {
		return  click_searchicon;
	
	}	
	
	
	
	

	}		
		

