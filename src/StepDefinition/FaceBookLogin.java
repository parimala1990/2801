package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FaceBookLogin {

	
	WebDriver driver;
	
	@Given("^Open chrome$")
	public void Open_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	  
	}

	@Given("^navigate to facebok application.$")
	public void navigate_to_facebok_application() throws Throwable {
		System.out.println("test1");

	}

	@When("^I enter valid user name and password$")
	public void I_enter_valid_user_name_and_password() throws Throwable {
		System.out.println("test2");

	}

	@When("^click on Submit$")
	public void click_on_Submit() throws Throwable {
		System.out.println("test3");

	  
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("test4");

	 
	}

	@Then("^see home page$")
	public void see_home_page() throws Throwable {
		System.out.println("test5");

	
	}


}
