package Testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test {
	@BeforeSuite
	  public void beforeSuite() {
		System.out.println("before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }
  }

