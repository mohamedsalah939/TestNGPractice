package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNG_TC1 {
	// We can write more than one test case in single file

	/*
	 * will run this test case last one in the test folder where this file mentioned
	 * in (Per test folder)
	 */
	@AfterTest
	public void lastExcec() {

		System.out.println("I will be last one excecuted");
	}

	// Test annotation @Test means that this is a test case and method name is a
	// test case name

	
	public void demo() {

		System.out.println("Hello");
	}
	
	@Test
	public void demo2() {

		System.out.println("Hello");
	}

	@Parameters({"URL","APIKey"})
	@Test
	public void secondDemo(String urlName,String keyName) {

		System.out.println(urlName);
		System.out.println(keyName);
	}


}
