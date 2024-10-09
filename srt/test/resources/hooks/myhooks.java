package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import driverfactory.driverfac;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class myhooks {
	WebDriver driver;
  @Before
  public void setup() {
	  driverfac.initializebrowser("chrome");
	  
	  driver=driverfac.getdriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	
	 
  }
  @After
  public void teardown() {
	  driver.quit();
  }
  
  
  
  
}
