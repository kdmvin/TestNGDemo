import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstDemo {
	
	
	@BeforeMethod
	public void m4() {
		System.out.println("Before Test method");
	}
	
	@Test
	public void test() {
		System.out.println("Test Method");
	}

	@Test
	public void test1() {
		System.out.println("Test Method 2");
	}
	
	@Test
	public void test2() {
		System.out.println("Test Method 3");
	}

	@AfterMethod
	public void m6() {
		System.out.println("After Test method");
	}
	
}
