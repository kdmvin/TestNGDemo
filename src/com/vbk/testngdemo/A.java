package com.vbk.testngdemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {

	@Test(groups = {"smoke"})
	public void m1() {
		Reporter.log("This is first test");
		System.out.println("A--m1");
		// Assert.assertEquals(true, false);
	}

	@Test(groups = {"smoke"})
	public void m2() {
		System.out.println("A--m2");
		//Assert.assertEquals(false, true);
	}

	@Test(dependsOnGroups = {"smoke"})
	public void m3() {
		System.out.println("A--m3");
	}

	/*
	 * @Test public void ab() { System.out.println("A--ab"); }
	 * 
	 * @Test(groups = {"regression"}) public void abcd() {
	 * System.out.println("A--abcd"); }
	 */
}
