package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createaccount extends baseclass{
  public createaccount(WebDriver driver) {
	  super(driver);
  }
  
  @FindBy(xpath="//input[@autocomplete='name']")
  WebElement name;
  @FindBy(xpath="//input[@autocomplete='tel']")
  WebElement number;
  @FindBy(xpath="//input[@autocomplete='new-password']")
  WebElement password;
  public void entername() {
	  name.sendKeys("Leela");  
	  }
  
  
}
