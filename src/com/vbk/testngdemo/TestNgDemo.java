package com.vbk.testngdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	WebDriver driver=null;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vinayak\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void validateLoginFunctionality() {
		
		WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("john");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	
	}
	
	@Test
	public void validateBillPayment() {
		WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("john");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.linkText("Bill Pay")).click();
	
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
