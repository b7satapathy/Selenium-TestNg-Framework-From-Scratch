package com.qa.pages;

import org.openqa.selenium.WebElement;
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
	
	public HomePage() {
		PageFactory.initElements(driver, this);
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
	
	
}
