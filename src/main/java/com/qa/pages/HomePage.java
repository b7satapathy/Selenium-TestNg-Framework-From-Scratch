package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(id="search_query_top")
	WebElement searchBox;
	
	@FindBy(name="submit_search")
	WebElement searchbarSubmitButton;
	
	@FindBy(className="home")
	WebElement homeButton;
	
	@FindBy(id="contact-link")
	WebElement contactUsButton;
	
	@FindBy(className="login")
	WebElement signInButton;
	
	@FindBy(xpath="//div[@class='shopping_cart']/a")
	WebElement cartButton;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li//a[contains(text(),'Women')]")
	WebElement womenTab;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/ul/li//a[contains(text(),'Tops')]")
	WebElement TOPSColumnButton;
	
	@FindBy(xpath="//div[@id='block_top_menu']/ul/li/ul/li[2]//a[contains(text(),'Dresses')]")
	WebElement DRESSESColumnButton;
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String clickOnSignInButton() {
		signInButton.click();
		return driver.getTitle();
	}
	
	public String enterTextInSearchbar() {
		searchBox.sendKeys("Selenium");
		searchbarSubmitButton.click();
		return driver.getTitle();
	}
	
	public String returnToHomePage() {
		homeButton.click();
		return driver.getTitle();
	}
	
	public String clickOnContactUsButton() {
		contactUsButton.click();
		return driver.getTitle();
	}
	
	public String clickOnCartButton() {
		cartButton.click();
		return driver.getTitle();
	}
	
	public String mouseHoverToWomenTabAndClickOnTops() {
		Actions a= new Actions(driver);
		a.moveToElement(womenTab).moveToElement(TOPSColumnButton).click().build().perform();
		return driver.getTitle();
	}
	
	public String mouseHoverToWomenTabAndClickOnDresses() {
		Actions a= new Actions(driver);
		a.moveToElement(womenTab).moveToElement(DRESSESColumnButton).click().build().perform();
		return driver.getTitle();
	}
	
	
	
	
	
	
}
