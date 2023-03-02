package com.vbk.testngdemo;

import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "myData",dataProviderClass = com.vbk.testngdemo.ExcelDemo.class)
	public void login(String uname, String pass) throws InterruptedException {
		System.out.println(uname + " " + pass);
	//	Thread.sleep(5000);
	}

	

}
