package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class test2 {
  @Test
  public void test2() {
	  System.out.println("test2 ");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class 3");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class 3 ");
  }

}
