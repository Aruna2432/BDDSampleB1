package stepDefs;

import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.When;

public class SampleStepDef {
	
	@BeforeAll
	public static void readFromDB() {
		System.out.println("Before All the Scenarios......");
	}
	
	@Before
	public void launchBrowser() {
		System.out.println("Before Each Scenarios.....");
	}
	
	@When("User creates an Item")
	public void user_creates_an_item() {
		System.out.println("Create Item");  
	}
	
	@When("User updates an Item")
	public void user_updates_an_item() {
	    System.out.println("Update Item");
	}	

}
