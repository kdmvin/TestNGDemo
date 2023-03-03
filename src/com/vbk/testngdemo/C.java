package com.vbk.testngdemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C {
	
	@Parameters({"browser"})
	@Test
	public void testLogin(String bname) {
		if(bname.equals("chrome"))
		{
			System.out.println(bname);
			System.out.println(bname);
		}
		
		if(bname.equals("firefox"))
		{
			System.out.println(bname);
		}
		
		
	}

}
