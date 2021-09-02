package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TagHookSteps {
	

	@Before //GLOBAL HOOKS before and after
	public void setUp() {
		System.out.println("launch ff");
		System.out.println("enter the url for free crm");
		}
	
	@After
	public void tearDown() {
		System.out.println("close the browser");
	}
	
	@Before("@First") //local anotation only for first scenarios
	public void beforeFirst() {
		System.out.println("before only first scenario");
	}
	
	@After("@First")
	public void afterFirst() {
		System.out.println("after only first scenario");
	}


	@Before("@Second") //local anotation only for first scenarios
	public void beforeSecond() {
		System.out.println("before only first scenario");
	}
	
	@After("@Second")
	public void afterSecond() {
		System.out.println("after only first scenario");
	}
	
	@Before("@Third") //local anotation only for first scenarios
	public void beforeThird() {
		System.out.println("before only first scenario");
	}
	
	@After("@Third")
	public void afterThird() {
		System.out.println("after only first scenario");
	}

}
