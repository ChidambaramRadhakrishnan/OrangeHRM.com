package POM_Manager;

import org.openqa.selenium.WebDriver;

import POM_Class.login_Page;

public class pom_Manager {

	public WebDriver driver;
	
	private login_Page lgpage;
	
	public pom_Manager(WebDriver driver) {
		this.driver=driver;
	}
	
	public login_Page getlloginpage() {
		if(lgpage==null) {
			lgpage = new login_Page(driver);
		}
		return lgpage;
	}
}
