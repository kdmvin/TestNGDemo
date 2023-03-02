package com.vbk.testngdemo;

import org.testng.annotations.DataProvider;

public class DataInput {
	@DataProvider(name = "loginCred")
	public Object[][] data() {

		return new Object[][] { { "paramedu", "paramedu" },
			{ "vinayak", "vinayak" }, 
			{ "john", "demo" } };

	}
}
