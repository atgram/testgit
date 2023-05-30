package com.nexttechitc.Testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestrunnerTestNG {
	@CucumberOptions (
			   
			   features = {"Features"},
			   glue = {"com.nexttechitc.Stepdef"}
			   
			   )

			public class TestRunner extends AbstractTestNGCucumberTests{}
	/*Automation framework 
	 * 1. Maven project: Maven gives us a std. structure to create project
	 * 2. selenium webdriver automation tool
	 * 3. BDD cucumber framework 
	 *
	 * 4. TestNG
	 * 5. Testrunner
	 * 6. Page object model
	 * 7. Language: Java
	 */
}
