package com.vbk.testngdemo;

import org.testng.annotations.Test;

public class B {
	
	@Test(groups = {"smoke"})
	public void m6() {
		System.out.println("m6--B");
		System.out.println("m6--B");
	}
	
	@Test(groups = {"smoke"})
	public void m7() {
		System.out.println("m7--B");
	}
	
	@Test(groups = {"regression"})
	public void m8() {
		System.out.println("m8--B");
	}

}
