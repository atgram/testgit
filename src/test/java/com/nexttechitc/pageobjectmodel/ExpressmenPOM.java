package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpressmenPOM {
	WebDriver driver;
	
	public ExpressmenPOM(WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/div/div[2]/nav/ol/li[2]/a")
	   WebElement act_xpress;
	   public WebElement xpress_men (){
	   return act_xpress;
}
	
	   @FindBy(xpath="/html/body")
	   
		  WebElement click_jeans; 
		  public WebElement jeans (){
		  return click_jeans;
}

	






}