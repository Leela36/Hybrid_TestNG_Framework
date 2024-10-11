package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(features="srt/test/resources/features/multiplescenarios.feature",glue={"stepdefinations","hooks"},plugin= {"pretty","html:target/htmlreport.html"})
public class myrunner extends AbstractTestNGCucumberTests{
	


}
