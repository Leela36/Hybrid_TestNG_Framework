package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverfactory.driverfac;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Given("User is on Para bank login page")
	public void user_is_on_para_bank_login_page() {
		driver=driverfac.getdriver();
	   driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	}

	@When("User needs to click on register button")
	public void user_needs_to_click_on_register_button() {
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	}
	@When("User enters username {string}")
	public void user_enters_username(String string) {
		 driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(string);
	}
	@When("User needs to fill all the mandatory fields to register")
	public void user_needs_to_fill_all_the_mandatory_fields_to_register() {
	
	 driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Moni");

	 driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Hyd");
	 driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("kphb");
	 driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("telangana");
	 driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("500032");
	 driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("7895849032");
	 driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("985736274984");
	 driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("Leela");
	 driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("Thatha");
	 driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("985736274984");
	 
	}

	@Then("User will navigate to para bank home page.")
	public void user_will_navigate_to_para_bank_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//img[@title='ParaBank']")).isDisplayed();
	}



}
