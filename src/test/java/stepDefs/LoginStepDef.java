package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/login");
	}
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//		 driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
//		 driver.findElement(By.cssSelector(".radius")).click();
//	}
//	@When("User enters {string} and {string}")
//	public void user_enters_and(String strUser, String strPwd) {
//	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
//	driver.findElement(By.cssSelector("#password")).sendKeys(strPwd);
//	driver.findElement(By.cssSelector(".radius")).click();
//	}
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable dataTable) {
//		List<List<String>> data = dataTable.asLists();
//		String strUser = data.get(0).get(0);
//		String strPwd = data.get(0).get(1);
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
//		driver.findElement(By.cssSelector("#password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector(".radius")).click();
//	}
	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		String strUser = data.get(0).get("username");
		String strPwd = data.get(0).get("password");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strUser);
		driver.findElement(By.cssSelector("#password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector(".radius")).click();
	}
	

	@Then("Should display Home Page")
	public void should_display_home_page() {
		boolean isDisp = driver.findElement(By.cssSelector(".flash.success")).isDisplayed();
        Assert.assertTrue(isDisp);	
    }

}
