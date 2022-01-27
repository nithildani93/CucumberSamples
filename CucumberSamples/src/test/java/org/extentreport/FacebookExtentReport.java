package org.extentreport;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FacebookExtentReport {
		
	
	
public	WebDriver driver;
public	ExtentHtmlReporter htmlreporter;
public ExtentReports extent;
ExtentTest test;
	

@BeforeTest	
public  void exReport() {
htmlreporter=new ExtentHtmlReporter(System.getProperty("extent.html"));
extent=new ExtentReports();

htmlreporter.config().setDocumentTitle("Facebook");
htmlreporter.config().setReportName("loginpage");
htmlreporter.config().setTheme(Theme.DARK);

extent.attachReporter(htmlreporter);
extent.setSystemInfo("name", "mani");
extent.setSystemInfo("browser", "chrome");
}

@Before
public void browserSetup() {
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
}
 

@After
public void driverClose() {
	extent.flush();
driver.quit();
}

@Test
public void homePage() {
test=extent.createTest("homePage");
String title = driver.getTitle();
Assert.assertEquals(title, "Facebook – log in or sign up");

}

@Test
public void btnHomepage() {

	test=extent.createTest("btnHomepage");
	WebElement login = driver.findElement(By.name("login"));
	boolean displayed = login.isDisplayed();
	Assert.assertTrue(displayed);
}
}

