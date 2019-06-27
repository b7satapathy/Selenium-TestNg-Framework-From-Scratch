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
	public void goToSignInPage() {
		home= new HomePage();
		assertEquals(home.clickOnSignInButton(), "Login - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"goToSignInPage"},alwaysRun=true)
	public void searchAText() {
		home= new HomePage();
		assertEquals(home.enterTextInSearchbar(), "Search - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"searchAText"}, alwaysRun=true)
	public void gotoContactUsPage() {
		home= new HomePage();
		assertEquals(home.clickOnContactUsButton(), "Contact us - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"gotoContactUsPage"}, alwaysRun=true)
	public void gotoCartPage() {
		home= new HomePage();
		assertEquals(home.clickOnCartButton(), "Order - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"gotoCartPage"}, alwaysRun=true)
	public void mouseHoverAndClickOnTopsButton() {
		home= new HomePage();
		assertEquals(home.mouseHoverToWomenTabAndClickOnTops(), "Tops - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnTopsButton"}, alwaysRun=true)
	public void mouseHoverAndClickOnDressesButton() {
		home= new HomePage();
		assertEquals(home.mouseHoverToWomenTabAndClickOnDresses(), "Dresses - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnDressesButton"}, alwaysRun=true)
	public void mouseHoverAndClickOnCasualDresses() {
		home= new HomePage();
		assertEquals(home.mouseHoverToDressesTabAndClickOnCasualDresses(), "Casual Dresses - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnCasualDresses"}, alwaysRun=true)
	public void mouseHoverAndClickOnEveningDresses() {
		home= new HomePage();
		assertEquals(home.mouseHoverToDressesTabAndClickOnEveningDresses(), "Evening Dresses - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnEveningDresses"}, alwaysRun=true)
	public void mouseHoverAndClickOnSummerDresses() {
		home= new HomePage();
		assertEquals(home.mouseHoverToDressesTabAndClickOnSummerDresses(), "Summer Dresses - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	@Test(dependsOnMethods= {"mouseHoverAndClickOnSummerDresses"}, alwaysRun=true)
	public void clickOnTshirtsTab() {
		home= new HomePage();
		assertEquals(home.ClickOntShirtsTab(), "T-shirts - My Store");
		assertEquals(home.returnToHomePage(), "My Store");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
