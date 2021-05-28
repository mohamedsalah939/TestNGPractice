package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class testNG_TC2 {
	/*
	 * will run this test case last one in the test Class where this file mentioned
	 * in (Per test class)
	 */
	@AfterClass
	public  void demo3() {

	System.out.println("Test");
	}
	/*
	 * will run this test case first one in the test Class where this file mentioned
	 * in (Per test class)
	 */
	@BeforeClass
	public  void demo4() {

	System.out.println("First");
	}
}
