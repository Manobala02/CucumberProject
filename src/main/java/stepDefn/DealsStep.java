package stepDefn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class DealsStep {
	
	WebDriver driver;
	
	
	@Given("user lanunch the browse url in ui.cogmento.com")
	public void user_lanunch_the_browse_url_in_ui_cogmento_com() {
		
		System.setProperty("webdriver.chrome.driver","C:\\SalesforceEcosystem\\EclipseWorspace\\mano\\cucumberProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		
	}
	@Given("user enter the username and password")
	public void user_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	  
		List<String> data = dataTable.row(0);
		
		
		driver.findElement(By.name("email")).sendKeys(data.get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(1));
	}
	@Given("click on login button")
	public void click_on_login_button() {
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
	}
	@When("user click on Deal page")
	public void user_click_on_deal_page() throws InterruptedException {
		Thread.sleep(3000);
		Actions acc =new Actions(driver);
		WebElement moneyicon = driver.findElement(By.xpath("//a[contains(@href,'deals')]"));
	    WebElement add=driver.
	    		findElement(By.xpath("//a[contains(@href,'deals')]//following-sibling::button"));
	    acc.moveToElement(moneyicon).build().perform();
	    acc.moveToElement(add).click().build().perform();		
	}
	@When("create new deal on deal page and enter value on Title,Amount,Commission and Probability")
	public void create_new_deal_on_deal_page_and_enter_value_on_title_amount_commission_and_probability(DataTable dataTable) throws InterruptedException {
		List<String> data = dataTable.row(0);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("title")).sendKeys(data.get(0));
		
		driver.findElement(By.name("amount")).sendKeys(data.get(1));
		
		driver.findElement(By.name("commission")).sendKeys(data.get(2));
		
		driver.findElement(By.name("probability")).sendKeys(data.get(3));
		
	}
	@When("click on save button")
	public void click_on_save_button() {
	    
		
		driver.findElement(By.xpath("//*[contains(text(),'Save')]")).click();
	}
	@Then("logout the browser")
	public void logout_the_browser() {
	   driver.close();
	}




}
