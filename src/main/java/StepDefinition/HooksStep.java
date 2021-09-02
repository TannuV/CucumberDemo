package StepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStep {
	
	
	@Before
	public void setUp() {
		System.out.println("launch ff");
		System.out.println("enter the url for free crm");
		}
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@Given("User is on deal page")
	public void user_is_on_deal_page() {
	    System.out.println("one");
	}

	@When("User fill the deals form")
	public void user_fill_the_deals_form() {
		System.out.println("two");
	}

	@Then("deal is created")
	public void deal_is_created() {
		System.out.println("three");
	}
	
	

}
