package com.qa.base;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public  static WebDriver driver;
	public static  Properties prop;
	public  static FileInputStream fis;
	
	public TestBase() {
		
		try {
			prop=new Properties();
			fis=new FileInputStream("src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	@BeforeTest
	public static void initializeBrowser()  {
		
//		if(prop.getProperty("browser").equals("chrome")) {
//		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\qa\\drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		}
//		
//		else if(prop.getProperty("browser").equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "src\\main\\java\\com\\qa\\drivers\\geckodriver.exe");
//			driver=new FirefoxDriver();
//		}
//		
//		else if(prop.getProperty("browser").equals("opera")) {
//			System.setProperty("webdriver.opera.driver", "src\\main\\java\\com\\qa\\drivers\\operadriver.exe");
//			driver=new OperaDriver();
//		}
		
		
		System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\qa\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public void failedTest() {
		File sourceFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File ("src\\main\\java\\com\\qa\\utility\\screenshots\\failedtest.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
