package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Blogpage {
	
	@Before
	public void beforecucumber() {
		System.out.println("before1");
	}
	@Before(order=1)
	public void beforecucumber2() {
		System.out.println("before2");
	}
	@BeforeStep
	public void beforestep() {
		System.out.println("beforestep");
	}
	@Given("user is in blog page")
	public void userisinBlogpage() {
		System.out.println("given section");
	}
	@When("user enters data in search field")
	public void userEnterintoblog() {
		System.out.println("when section");
	}
	@Then("data should appear in search field")
	public void thenpage() {
		System.out.println("then section");
	}
	@After
	public void aftercucumber() {
		System.out.println("after1");
	}
	@After(order=1)
	public void aftercucumber2() {
		System.out.println("after2");
	}
	@AfterStep
	public void afterstep() {
		System.out.println("after step");
	}
	
}
