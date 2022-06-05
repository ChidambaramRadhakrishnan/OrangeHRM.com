package POM_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_Page {

	public WebDriver driver;
	
	@FindBy(id = "txtUsername")
	private WebElement username;
	
	@FindBy(id = "txtPassword")
	private WebElement password;
	
	@FindBy(id = "btnLogin")
	private WebElement submit;
	
	public login_Page(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getusername() {
		return username;
	}
	
	public WebElement getpassword() {
		return password;
	}
	
	public WebElement getsubmit() {
		return submit;
	}
}
