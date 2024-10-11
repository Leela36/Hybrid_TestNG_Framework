package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class multiplerahuls {
	WebDriver driver;
	public multiplerahuls(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	@FindBy(xpath="//input[@id='signInBtn']")
	WebElement btn;
	public void enterusername(String uname) {
		username.sendKeys(uname);
	}
	public void enteruserpwd(String upwd) {
		pwd.sendKeys(upwd);
	}
	public void clickonsubmitbtn() {
		btn.click();
	}
	
	
}