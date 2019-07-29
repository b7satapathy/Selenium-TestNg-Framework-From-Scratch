/**
 * 
 */
package com.qa.basePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Biswajit Satapathy
 *
 */
public abstract class AbstractPage {

	WebDriver driver;
	WebDriverWait wait;
	
	public AbstractPage (WebDriver driver) {
		this.driver = driver;
		this.wait= new WebDriverWait(this.driver, 15);
		 
	}
	
	//abstract methods
	public abstract WebDriver getDriver();
	public abstract String getPageTitle();
	public abstract String getPageHeader(By locator);
	public abstract WebElement getElement(By locator);
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitle(String title);
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} 
		catch (Exception e) {
			e.printStackTrace();
			return null; 
		}
		
		
	}
	
	
	
	
}
