package com.vbk.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelDemo {
	WebDriver driver=null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinayak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		//driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void m1() {
		System.out.println("M1--Test");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void m2() {
		System.out.println("M2--Test");
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void m3() {
		System.out.println("M3--Test");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void m4() {
		System.out.println("M4--Test");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void m5() {
		System.out.println("M5--Test");
		driver.get("https://www.google.com/");
	}
	
	
}
