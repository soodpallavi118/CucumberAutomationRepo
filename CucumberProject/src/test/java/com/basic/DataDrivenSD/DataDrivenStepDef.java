package com.basic.DataDrivenSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataDrivenStepDef {
	
	
    WebDriver driver;
	@Given("User need to be on Linkedin Login page")
	public void User_need_to_be_on_Linkedin_Login_page()
	{
		driver = new ChromeDriver();	
		System.setProperty("webdriver.chrome.driver","E:\\Cucumber SetUp\\chromedriver_win32\\chromedriver.exe");
		driver.get("https://www.linkedin.com/login");
	}

	
	@When("User enter valid {string} username")
	public void user_enter_valid_username(String validusername) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(validusername);
		Thread.sleep(5000);
	}
	
	@When("User enter invalid username")
	public void user_enter_invalid_username()
	{
		driver.findElement(By.id("username")).sendKeys("soodpccdkcbdfhv@gmail.com");
	}
	
	@And("User enter valid {string} password")
	public void user_enter_valid_password(String validpassword)
	{
		driver.findElement(By.id("password")).sendKeys(validpassword);
	}
	
	@And("User clicks on Login button")
	public void user_clicks_on_Login_button()
	{
		driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
	}
	@And("CloseBrowser")
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	@Then("User should be logged in dislaying logged in username in application")
	public void User_should_be_logged_in_dislaying_logged_in_username_in_application()
	{
	    String usernamedisplayed = driver.findElement(By.xpath("//div[@class='t-16 t-black t-bold']")).getText();
		Assert.assertEquals("Pallavi Sood", usernamedisplayed);
	}
	@Then("User should not be logged in and error is displayed")
	public void user_should_not_be_logged_in_and_error_is_displayed()
	{
		driver.findElement(By.xpath("//div[@id='error-for-username']")).isDisplayed();
	}
	
}
