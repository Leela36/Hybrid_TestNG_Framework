package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverfactory.driverfac;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pagefactory.multiplerahuls;

public class multiplescenariosrahulshetypage {
	
 WebDriver driver;
 multiplerahuls m;
@Given("User is on R loginnpage")
public void user_is_on_r_loginnpage() {
	driver=driverfac.getdriver();
	m=new multiplerahuls(driver);
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
}
    
@When("User enters the u {string}")
public void user_enters_the_u(String uname) {
    m.enterusername(uname);
}
@When("User enters the pwd {string}")
public void user_enters_the_pwd(String upwd) {
    // Write code here that turns the phrase above into concrete actions
    m.enteruserpwd(upwd);
}


@When("User clicks on the submit button")
public void user_clicks_on_the_submit_button() {
   m.clickonsubmitbtn();
}

@Then("User should navigate to the rahulshettypage")
public void user_should_navigate_to_the_rahulshettypage() {
driver.findElement(By.xpath("/a[text()='ProtoCommerce']")).isDisplayed();
 
}


}
