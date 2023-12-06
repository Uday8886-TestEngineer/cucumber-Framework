package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdeniation {
	ChromeDriver driver;
	
	@Given("Open browser and enter valid url")
	public void Open_browser_and_enter_valid_url() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
	}
	
   @When("Enter valid username")
   public void Enter_valid_username() {
	   driver.findElement(By.id("username")).sendKeys("student");
	      
   }
   @Then("Enter valid password")
   public void Enter_valid_password() {
	 driver.findElement(By.id("password")).sendKeys("Password123"); 
   }
   @And("Click on login button")
   public void Click_on_login_button() {
	   driver.findElement(By.id("submit")).click();
	   
   }
   @Then("User should navigate to dashboard page")
   public void user_should_navigate_to_dashboard_page() {
	   String actualvalue= driver.findElement(By.tagName("h1")).getText();
		  Assert.assertEquals("Client Expectation not matched", "Logged In Successfully",actualvalue );
   }
   @When("Enter invalid username")
   public void  Enter_invalid_username() {
	   driver.findElement(By.id("username")).sendKeys("uday");
	  
   }
   
   @When("Enter invalid password")
   public void Enter_invalid_password() {
	   driver.findElement(By.id("password")).sendKeys("uday");
   }
   @And("Click on login  button")
   public void Click_on_login_button11() {
	   driver.findElement(By.id("submit")).click();
	   
   }
   @Then("User got error as enter valid user name and valid password")
   public void  User_got_error_as_enter_valid_user_name_and_valid_password() {
	   String actualvalue= driver.findElement(By.tagName("h1")).getText();
		  Assert.assertEquals("Client Expectation not matched", "Logged In Successfully",actualvalue );
   }
   @When("Enter valid username ")
   public void Enter_valid_username1() {
	   driver.findElement(By.id("username")).sendKeys("student");
   }
   @When("Enter invalid password")
	   public void Enter_invalid_password1() {
		   driver.findElement(By.id("password")).sendKeys("uday");
}
   @When("Click on login button")
   public void Click_on_login_button1() {
	   driver.findElement(By.id("submit")).click();
   }
	   
   @Then("User got error as enter valid password")
   public void  User_got_error_as_enter_valid_password() {
	   String actualvalue= driver.findElement(By.tagName("h1")).getText();
		  Assert.assertEquals("Client Expectation not matched", "Logged In Successfully",actualvalue );
   }
   @When("Enter invalid username")
   public void  Enter_invalidu_username() {
   }
   @When("Enter valid password")
   public void  Enter_valid_password1() {
	   driver.findElement(By.id("password")).sendKeys("Password123"); 
   }
   @And("Click on login button")
   public void Click_on_login_buttons() {
	   driver.findElement(By.id("submit")).click();
   }
	   
   @Then("User got error as enter valid username")
   public void  User_got_error_as_enter_valid_username() {
	   String actualvalue= driver.findElement(By.tagName("h1")).getText();
		  Assert.assertEquals("Client Expectation not matched", "Logged In Successfully",actualvalue );
   
}
}
