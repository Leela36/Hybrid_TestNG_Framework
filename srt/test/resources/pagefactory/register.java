package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {
	WebDriver driver;
	public register(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  @FindBy(xpath="//input[@id='customer.firstName']")
  WebElement firstname;
  @FindBy(xpath="//input[@id='customer.lastName']")
  WebElement lastname;
  @FindBy(xpath="//input[@id='customer.address.street']")
  WebElement street;
  @FindBy(xpath="//input[@id='customer.address.city']")
  WebElement city;
  @FindBy(xpath="//input[@id='customer.address.state']")
  WebElement state;
  @FindBy(xpath="//input[@id='customer.address.zipCode']")
  WebElement zipcode;
  @FindBy(xpath="//input[@id='customer.phoneNumber']")
  WebElement phonenum;
  @FindBy(xpath="//input[@id='customer.ssn']")
  WebElement ssn;
  
  @FindBy(xpath="//input[@id='customer.username']")
  WebElement uname;
  @FindBy(xpath="//input[@id='customer.password']")
  WebElement pwd;
  @FindBy(xpath="//input[@id='repeatedPassword']")
  WebElement rpwd;
  @FindBy(xpath="//a[text()='Register']")
  WebElement reg;

  @FindBy(xpath="//img[@title='ParaBank']")
  WebElement bankpage;
  public void clickonregisterbutton() {
	  reg.click();
  }
  public void username(String username) {
	  firstname.sendKeys(username);
	 
  }
  public void enter_mandatoryfields() {
	  lastname.sendKeys("Hi");
	  street.sendKeys("Hi");
	  city.sendKeys("Kphb");
	  state.sendKeys("tg");
	  zipcode.sendKeys("500043");
	 phonenum.sendKeys("8903480881");
	 ssn.sendKeys("893828283872");
	 uname.sendKeys("Leela");
	 pwd.sendKeys("thatha");
	  rpwd.sendKeys("thatha");
	  
  }
  public void bankhomepage() {
	  bankpage.isDisplayed();
  }

}
