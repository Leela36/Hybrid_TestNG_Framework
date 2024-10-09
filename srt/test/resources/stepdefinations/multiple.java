package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import driverfactory.driverfac;

public class multiple {
	WebDriver driver;

@Given("User is already on login page")
public void user_is_already_on_login_page() {
    driver=driverfac.getdriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enters an username {string}")
public void user_enters_an_username(String username) {
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
}

@When("User enters an password {string}")
public void user_enters_an_password(String userpassword) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(userpassword);
}

@When("User clicks on submit button")
public void user_clicks_on_submit_button() {
	driver.findElement(By.xpath("//button[@type='submit']")).click();
}

@Then("User should naviage to the home page")
public void user_should_naviage_to_the_home_page() throws InterruptedException {
	Thread.sleep(5000);
	Assert.assertTrue(driver.findElement(By.xpath("//div[@class='oxd-topbar-header-title']")).isDisplayed());
  
}






}
