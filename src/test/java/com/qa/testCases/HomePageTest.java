package com.qa.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.utility.Screenshot;

@Listeners(Screenshot.class)
public class HomePageTest extends TestBase{

	public HomePageTest() {
		super();
	}
	
	HomePage home;
	
	
	@Test(alwaysRun=true)
	public void serachBar() {
		home= new HomePage();
		assertEquals(home.enterTextInSearchbar(), "Search - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"serachBar"}, alwaysRun=true)
	public void contactUs() {
		home= new HomePage();
		assertEquals(home.clickOnContactUsButton(), "Contact us - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	
	
}
