package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG_TC3 {
	
	/*
	 * will run this test case first one in the test file
	 * (Per test file)
	 */
	@BeforeMethod
	public  void beforeTest() {

	System.out.println("before every method");
	}
	
	@Test
	public  void webLoginLoan() {

	System.out.println("Web Login");
	}
	
	/*
	 * will run this test case last one in the test file
	 * (Per test file)
	 */
	
	@AfterMethod
	public  void afterTest() {

	System.out.println("after every method");
	}
	
	@Test
	public  void mobileLoginLoan() {

	System.out.println("Mobile login");
	}
	
	@Test
	public  void apiLoginLoan() {

	System.out.println("Api login");
	}
}
