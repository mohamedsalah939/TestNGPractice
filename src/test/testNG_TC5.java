package test;

import org.testng.annotations.Test;

public class testNG_TC5 {

	/*
	 * Groups used if I want to run a group of test cases only for example if I have
	 * a group of smoke test cases and group of regression test cases and I need to
	 * run one of them I need to tag each test case so in the XML file will specify
	 * which group to run
	 */
	@Test(groups = { "Smoke" })
	public void carKey() {

		System.out.println("Smoke 1");
	}

	@Test(groups = { "Smoke" })
	public void carDoor() {

		System.out.println("Smoke 2");
	}

	@Test(groups = { "Smoke" })
	public void carWheel() {

		System.out.println("Smoke 3");
	}

	@Test(groups = { "Regression" })
	public void carSteer() {

		System.out.println("Regression 1");
	}

	@Test(groups = { "Regression" })
	public void carSeat() {

		System.out.println("Regression 2");
	}

}
