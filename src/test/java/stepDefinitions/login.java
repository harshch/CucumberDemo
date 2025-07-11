package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import io.cucumber.java.en.Then;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	   //open a browser
		driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//go to url
		driver.get("https://www.saucedemo.com/");
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String user, String pwd) {
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}

	@Then("Products label gets displayed")
	public void products_label_gets_displayed() {
	    boolean status = driver.findElement(By.xpath("//span[@class='title']")).isDisplayed();
	    Assert.assertEquals(status, true);
	    driver.quit();
	}

}
