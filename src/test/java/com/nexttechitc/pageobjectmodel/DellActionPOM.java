package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellActionPOM {

WebDriver driver;
	
	public DellActionPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[2]")
     WebElement click_ITinfrastructure;
    public WebElement ITinfrastructure() {
    	return click_ITinfrastructure;
    }

      @FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/a")
      WebElement click_Developers;
  	public WebElement Developers() {
  		return click_Developers;
  	}


}