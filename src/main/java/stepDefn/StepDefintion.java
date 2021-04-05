//package stepDefn;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import static org.junit.Assert.*;
//
//
//
//
//
//public class StepDefintion {
//	
//	WebDriver driver;
//	@Given("User enter the website on automationpratice.com")
//	public void user_enter_the_website_on_automationpratice_com() {
//	   
//		
//		System.setProperty("webdriver.chrome.driver","C:\\SalesforceEcosystem\\EclipseWorspace\\mano\\cucumberProject\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://automationpractice.com/index.php?controller=authentication");
//	}
//	
//	@Given("user should enters {string} and {string}")
//	public void user_should_enters_and(String emailaddress, String password) {
//	    
//		WebElement  email = driver.findElement(By.id("email"));
//		email.sendKeys(emailaddress);
//		
//		WebElement  pass = driver.findElement(By.id("passwd"));
//		pass.sendKeys(password);
//		
//	}
//
//
//	@When("user should enter on Signin btn")
//	public void user_should_enter_on_signin_btn() {
//	   
//		WebElement  signin = driver.findElement(By.id("SubmitLogin"));
//		signin.click();
//	}
//
//	@Then("user validate the homepage")
//	public void user_validate_the_homepage() {
//	  String title = driver.getTitle();
//	  
//	  
//	  assertEquals("My account - My Store", title);
//	}
//
////	
//	
//
//	@Then("close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//
//
//
//	
//	
//}
