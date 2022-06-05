package base_Class;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_Class {
	public static WebDriver driver;
	public static WebDriver browser(String string) {
		switch (string) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	public static String url(String url) {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return url;
	}
	
	public static void sendeys(WebElement element,String value) {
		element.click();
		element.sendKeys(value);
	}
	
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	
}
