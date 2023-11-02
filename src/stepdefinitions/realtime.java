package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class realtime {
	
	public static WebDriver driver;
	@Given("open browser")
	public void before() {
		System.setProperty("webdriver.edge.driver","C:/Users/Raghava/Drivers/msedgedriver.exe");
		 driver = new EdgeDriver();
		//ChromeOptions options = new ChromeOptions(); 
		//options.addArguments("--remote-allow-origins=*"); 
		//driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	
	@Given("user is in home page")
	public void searchpage() {
		
		driver.get("http://tutorialsninja.com/demo");
	}
	@When("user enters {string} in search field")
	public void enterproduct(String product) {
		System.out.println("sending key");
		driver.findElement(By.name("search")).sendKeys(product);
		
	}
	
	@And("user click on search button")
	public void clicksearch() {
		System.out.println("sending search");
		driver.findElement(By.xpath("//div[@id='search']//button")).click();
	}
	@Then("product {string} shud be displayed")
	public void searched(String product2) {
		driver.findElement(By.xpath("//a[text()='"+product2+"']")).isDisplayed();
		
	}
	@Given("close browser")
	public void after() {
		driver.quit();
	}
}
