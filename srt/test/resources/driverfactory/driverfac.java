package driverfactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverfac {
	static WebDriver driver=null;
	public static void initializebrowser(String browser) {
		
		if(browser.equals("chrome")) {
			
		driver=new ChromeDriver();
		
	}else if(browser.equals("firefox")) {
		driver=new FirefoxDriver();
	}else if(browser.equals("edge")) {
		driver=new EdgeDriver();
	}else if(browser.equals("safari")) {
		driver=new SafariDriver();
	}}
		public static WebDriver getdriver() {
			return driver;
		}
	
}

