package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_TC4 {
	/*
	 * will run this test case last one in the test suite where this file mentioned
	 * in (Per Suite)
	 */
	@AfterSuite
	public void lastTest() {

		System.out.println("Very Last");
	}

	/*
	 * will run this test case first one in the test suite where this file mentioned
	 * in (Per Suite)
	 */
	@BeforeSuite
	public void firstTest() {

		System.out.println("First one");
	}

	// this means that testNG will exclude this test case from excecution
	@Test(enabled = false)
	public void webLoginLoan() {

		System.out.println("Web login");
	}

	// wait for 4 seconds till you fail
	@Test(timeOut = 4000)
	public void mobileLoginLoan() {

		System.out.println("Mobile login");
	}

	/*
	 * will run this test case first one in the test folder where this file
	 * mentioned in (Per test folder)
	 */
	@BeforeTest
	public void mobileRegisterLoan() {

		System.out.println("Mobile Register");
	}

	/*
	 * depends on mean that we cannot run this testcase without running the
	 * secondDemo one this can be used if we want to run the test cases in specific
	 * order
	 */
	@Test(dependsOnMethods = { "apiLoginLoan2" })
	public void apiLoginLoan() {

		System.out.println("Api login");
	}

	@Test(dataProvider = "getData")
	public void apiLoginLoan2(String username, String password) {

		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommercetc", "root", "---");

		Statement smt = con.createStatement();
		String countQuery = "select count(username) from ecommercebasic";
		// Executing the query
		ResultSet rs = smt.executeQuery(countQuery);
		// Retrieving the result
		rs.next();
		int rowCount = rs.getInt(1);

		String query = "select username,country from ecommercebasic";
		ResultSet res = smt.executeQuery(query);

		Object[][] data = new Object[rowCount][2];

		int row = 0;
		while (res.next()) {
			for (int i = 0; i < 2; i++) {
				data[row][i] = res.getObject(i + 1);
			}
			row++;
		}

		return data;
	}
}
