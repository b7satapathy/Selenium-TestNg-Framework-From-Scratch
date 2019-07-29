/**
 * 
 */
package com.qa.baseTest;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.basePage.AbstractPage;
import com.qa.basePage.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Biswajit Satapathy
 *
 */

public class BaseTest {

	WebDriver driver;
	public AbstractPage page;
	public Properties prop;
	public FileInputStream fis;
	
	
	public BaseTest() {
		
		try {
			prop=new Properties();
			fis=new FileInputStream("src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	@Parameters(value= {"browser"})
	public void setUpTest(String browser) {
		if(browser.equals("chrome")) {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
		    WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		}else {
			System.out.println("No Brwoser is defined in testng.xml file");
		}
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
//	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
	page = new BasePage(driver);
	
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
