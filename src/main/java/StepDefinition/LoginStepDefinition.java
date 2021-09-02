//package StepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepDefinition {
//	WebDriver driver;
//
//	@Given("^User is already on the login page$")
//	public void user_is_already_on_the_login_page() {
//		System.getProperty("webdriver.chrome.driver" , "cromedriver");
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html");
//
//	}
//
//	@When("^Title of the login page is free crm$")
//	public void title_of_the_login_page_is_free_crm() {
//		String title = driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",title);
//	}
//// regular expression \"(.*)\"  or \"([^\"]*)\"
//	
//	@Then("^User enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username ,String password) { //same also for with example 
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//
//	@Then("^User clicks on login button$")
//	public void user_clicks_on_login_button() {
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//		//	    js.executeScript("arguments[0].click()",loginbtn);
//	}
//
//	@Then("^User is on home page$")
//	public void user_is_on_home_page() {
//		String homeTitle = driver.getTitle();
//		System.out.println(homeTitle);
//		Assert.assertEquals("CRMPRO",homeTitle);
//	}
//	
//	@Then("^User move to new contact page$")
//	public void user_move_new_contact_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath(" //a[contains(text(),'Contacts')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
//	}
//	
//  
//    @Then("^User enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//    public void user_enters_contact_details_and_and(String firstname, String lastname, String position) {
//    	driver.findElement(By.name("first_name")).sendKeys(firstname);
//    	driver.findElement(By.name("surname")).sendKeys(lastname);
//    	driver.findElement(By.name("company_position")).sendKeys(position);
//    	driver.findElement(By.xpath("//input[@type ='submit' and @value = 'Save']")).click();
//    }
//
//
//
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.close();
//		
//	}
//
//
//}
