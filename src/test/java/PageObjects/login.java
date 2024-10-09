package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login extends baseclass{
        WebDriver driver;
        public login(WebDriver driver) {
        	super(driver);
        }
 @FindBy(xpath="//button[text()='Sign in']")
 WebElement Signin;
 public void signinbutton() {
	 Signin.click();
 }
}
