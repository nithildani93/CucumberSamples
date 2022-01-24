package org.logindefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginDefenition {
	static WebDriver driver;
	
	
	@Before
	public static void openbrowser() {
		WebDriverManager.chromedriver().setup();
		if(driver==null) {
		driver = new ChromeDriver();
		}
	}
	
	
	
	
	@Given("the user opens the login page")
	public void the_user_opens_the_login_page() {
		
		driver.get("https://demo.wpjobboard.net/wp-login.php");
		

	}
	
	@When("the user enters the username as {string}")
	public void the_user_enters_the_username_as(String username) {
		
		WebElement user = driver.findElement(By.id("user_login"));
		user.clear();
		user.sendKeys(username);
	}

	@When("clicks submit button")
	public void clicks_submit_button() {
		
		WebElement submit = driver.findElement(By.id("wp-submit"));
		submit.click();
	}

	@Then("the user should be logged into the site")
	public void the_user_should_be_logged_into_the_site() {
	
	    boolean displayed = driver.findElement(By.xpath("(//span[text()='user'])[1]")).isDisplayed();
	    Assert.assertTrue(displayed);
	    
	}

	@When("the user clicks the wp-logo")
	public void the_user_clicks_the_wp_logo() {
	   WebElement wpLogo = driver.findElement(By.id("wp-admin-bar-wp-logo"));
	   wpLogo.click();
	}

	@Then("the user should be displayed about latest release")
	public void the_user_should_be_displayed_about_latest_release() {
	    WebElement wptext = driver.findElement(By.xpath("//h1[contains(text(),'WordPress')]"));
	    Assert.assertTrue(wptext.isDisplayed());
	}

	@When("the user hover the mouse on the wordpress logo")
	public void the_user_hover_the_mouse_on_the_wordpress_logo() {
		Actions action = new Actions(driver);
	   action.moveToElement(driver.findElement(By.id("wp-admin-bar-wp-logo")));
	   action.perform();
	   
	}

	@When("clicks on About Wordpress menu")
	public void clicks_on_About_Wordpress_menu() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("(//a[contains(text(),'WordPress')])[1]"))).click().build().perform();
	}

	public void cleanup() {
		// TODO Auto-generated method stub

	}


	
}
