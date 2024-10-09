package stepdefinations;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import driverfactory.driverfac;

public class login {
	WebDriver driver;
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driver=driverfac.getdriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
	}
	@When("User enters username {string}")
	public void user_enters_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}
	

	@When("User enters password {string}")
	public void user_enters_password(String userpassword) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userpassword);
	   
	}



	@Then("User should login to the home page")
	public void user_should_login_to_the_home_page() throws InterruptedException {
		//div[@class='oxd-topbar-header-title']
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']")).isDisplayed());
	  
	}

	@Then("User gets a warning message")
	public void user_gets_a_warning_message() {
	//Assert.assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).getText(),"Invalid credentials");
	Assert.assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
	   
	}
	@Then("User gets a warning message like required field")
	public void user_gets_a_warning_message_like_required_field() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]")).isDisplayed());
		
	}

	@Given("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	    
	}


}
