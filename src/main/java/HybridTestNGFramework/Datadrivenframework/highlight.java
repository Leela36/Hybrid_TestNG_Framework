package HybridTestNGFramework.Datadrivenframework;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class highlight {
	
	public static void main(String args[]) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
//	practise();}
//	
//	
//	
//	public static void highl(WebElement element) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//    
//	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//	}
//	public static void practise() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	highl(driver.findElement(By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']")));
}

}
