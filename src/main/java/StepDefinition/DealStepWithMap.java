package StepDefinition;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DealStepWithMap {
	
	// for parameterization of testcases -->data tabLE for map


	WebDriver driver ;

	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() {
		System.getProperty("webdriver.chrome.driver" , "cromedriver");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");

	}

	@When("^Title of login page is free crm$")
	public void title_of_login_page_is_free_crm() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);

	}

	@Then("^User enters the login details username and password$")
	public void user_enters_the_login_details_username_and_password(DataTable credentials) { //same also for with example 
//		List<Map<String,String> >data =credentials.asMaps(String.class,String.class);
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));
		
		for(Map<String,String> data : credentials.asMaps()){
		driver.findElement(By.name("username")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}
	}

	@Then("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//	    JavascriptExecutor js = (JavascriptExecutor)driver;
		//	    js.executeScript("arguments[0].click()",loginbtn);
	}

	@Then("^User redirects to home page$")
	public void user_redirects_to_home_page() {
		String homeTitle = driver.getTitle();
		System.out.println(homeTitle);
		Assert.assertEquals("CRMPRO",homeTitle);
	}

	@Then("^User move to new deal page$")
	public void user_move_to_new_deal_page() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(" //a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}

	@Then("^User enters deal details title and amount and  probability and commission$")
	public void user_enters_deal_details_title_and_amount_and_probability_and_commission(DataTable dataTable) {
		for(Map<String,String> data : dataTable.asMaps()) {
		driver.findElement(By.id("title")).sendKeys(data.get("title"));
		driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
		driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
		driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
		driver.findElement(By.xpath("//input[@type ='submit'and @value ='Save and Create Another']")).click();
		}	

	}

	@Then("^Close browser $ ")
	public void close_browser() {
		driver.close();
	}

}
