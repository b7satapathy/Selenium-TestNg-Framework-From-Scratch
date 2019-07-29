package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.basePage.BasePage;

public class HomePage extends BasePage{
	
	private By searchBox= By.id("search_query_top");
	private By searchbarSubmitButton= By.name("submit_search");
	private By homeButton= By.className("home");
	private By contactUsButton= By.id("contact-link");
	private By signInButton= By.className("login");
	private By cartButton= By.xpath("//div[@class='shopping_cart']/a");
	private By womenTab= By.xpath("//div[@id='block_top_menu']/ul/li//a[contains(text(),'Women')]");
	private By TOPSColumnButton= By.xpath("//div[@id='block_top_menu']/ul/li/ul/li//a[contains(text(),'Tops')]");
	private By DRESSESColumnButton= By.xpath("//div[@id='block_top_menu']/ul/li/ul/li[2]//a[contains(text(),'Dresses')]");
	private By dressesTab= By.xpath("//div[@id='block_top_menu']/ul/li[2]//a[contains(text(),'Dresses')]");
	private By casualDresses= By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li//a[contains(text(),'Casual Dresses')]");
	private By eveningDresses= By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li[2]//a[contains(text(),'Evening Dresses')]");
	private By summerDresses= By.xpath("//div[@id='block_top_menu']/ul/li[2]/ul/li[3]//a[contains(text(),'Summer Dresses')]");
	private By tShirts= By.xpath("//div[@id='block_top_menu']/ul/li[3]//a[contains(text(),'T-shirts')]");
	
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	public WebElement getSearchBox() {
		return getElement(searchBox);
	}

	public WebElement getSearchbarSubmitButton() {
		return getElement(searchbarSubmitButton);
	}

	public WebElement getHomeButton() {
		return getElement(homeButton);
	}

	public WebElement getContactUsButton() {
		return getElement(contactUsButton);
	}

	public WebElement getSignInButton() {
		return getElement(signInButton);
	}

	public WebElement getCartButton() {
		return getElement(cartButton);
	}

	public WebElement getWomenTab() {
		return getElement(womenTab);
	}

	public WebElement getTOPSColumnButton() {
		return getElement(TOPSColumnButton);
	}

	public WebElement getDRESSESColumnButton() {
		return getElement(DRESSESColumnButton);
	}

	public WebElement getDressesTab() {
		return getElement(dressesTab);
	}

	public WebElement getCasualDresses() {
		return getElement(casualDresses);
	}

	public WebElement getEveningDresses() {
		return getElement(eveningDresses);
	}

	public WebElement getSummerDresses() {
		return getElement(summerDresses);
	}

	public WebElement gettShirts() {
		return getElement(tShirts);
	}


//	public String getLoginPageTitle() {
//		return getPageTitle();
//	}
//	
	
	public String clickOnSignInButton() {
		getSignInButton().click();
		return getPageTitle();
	}
	
	public String enterTextInSearchbar() {
		getSearchBox().sendKeys("Selenium");
		getSearchbarSubmitButton().click();
		return getPageTitle();
	}
	
	public String returnToHomePage() {
		getHomeButton().click();
		return getPageTitle();
	}
	
	public String clickOnContactUsButton() {
		getContactUsButton().click();
		return getPageTitle();
	}
	
	public String clickOnCartButton() {
		getCartButton().click();
		return getPageTitle();
	}
	
	public String mouseHoverToWomenTabAndClickOnTops() {
		Actions a= new Actions(getDriver());
		a.moveToElement(getWomenTab()).moveToElement(getTOPSColumnButton()).click().build().perform();
		return getPageTitle();
	}
	
	public String mouseHoverToWomenTabAndClickOnDresses() {
		Actions a= new Actions(getDriver());
		a.moveToElement(getWomenTab()).moveToElement(getDRESSESColumnButton()).click().build().perform();
		return getPageTitle();
	}
	
	public String mouseHoverToDressesTabAndClickOnCasualDresses() {
		Actions a= new Actions(getDriver());
		a.moveToElement(getDressesTab()).moveToElement(getCasualDresses()).click().build().perform();
		return getPageTitle();
	}
	
	public String mouseHoverToDressesTabAndClickOnEveningDresses() {
		Actions a= new Actions(getDriver());
		a.moveToElement(getDressesTab()).moveToElement(getEveningDresses()).click().build().perform();
		return getPageTitle();
	}
	
	public String mouseHoverToDressesTabAndClickOnSummerDresses() {
		Actions a= new Actions(getDriver());
		a.moveToElement(getDressesTab()).moveToElement(getSummerDresses()).click().build().perform();
		return getPageTitle();
	}
	
	public String ClickOntShirtsTab() {
		gettShirts().click();
		return getPageTitle();
	}
}
