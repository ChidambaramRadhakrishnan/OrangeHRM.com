package test_runner;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import base_Class.base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".\\src\\main\\java\\featurefile" ,
		glue = "step_Definition",
		monochrome = true
		)

public class test_runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void launch() {
		driver=base_Class.browser("chrome");
	}
	
	
	public static void close() {
		base_Class.quit();
	}
}
