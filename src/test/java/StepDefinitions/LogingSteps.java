package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
public class LogingSteps {
	
	WebDriver driver;
@Before
@Given("open the browser")
public void open_the_browser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}


@When("user is on login page")
public void user_is_on_login_page() {
	System.out.println("loging page");
//	driver.manage().timeouts().implicitlyWait(30,TimeUtil);
    
}

@When("user enters username and password")
public void user_enters_username_and_password() {
	System.out.println("Inside step");
    
}

@When("clicks on login button")
public void clicks_on_login_button() {
	System.out.println("loging button");
    
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
	System.out.println("home page");
	
    
}
@Then("close window")
public void close_window() {
driver.close();
}}



