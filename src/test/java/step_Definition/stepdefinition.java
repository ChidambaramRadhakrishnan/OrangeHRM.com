package step_Definition;

import org.openqa.selenium.WebDriver;
import POM_Manager.pom_Manager;
import base_Class.base_Class;
import io.cucumber.java.en.*;
import test_runner.test_runner;

public class stepdefinition extends base_Class{
	
	public static WebDriver driver= test_runner.driver;
	public static pom_Manager pm=new pom_Manager(driver);
	
	
	@Given("I Open the browser")
	public void i_open_the_browser() {
	    System.out.println("browser launched");
	}
	
	@When("I use the application URL")
	public void i_use_the_application_url() {
	    url("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify the Title of the Application")
	public void i_verify_the_title_of_the_application() {
	   System.out.println("Title verified");
	}

	@Then("I enter Username {string}")
	public void i_enter_username(String string) {
	    sendeys(pm.getlloginpage().getusername(), string);
	}

	@Then("I enter Password {string}")
	public void i_enter_password(String string) {
	    sendeys(pm.getlloginpage().getpassword(), string);
	}

	@Then("I Click the Submit Button")
	public void i_click_the_submit_button() {
	    click(pm.getlloginpage().getsubmit());
	}

	@Then("I validate Page Navigation")
	public void i_validate_page_navigation() {
	    System.out.println("page validated");
	}

}
