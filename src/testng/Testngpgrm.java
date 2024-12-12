package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpgrm {
	@BeforeTest
	public void beforedetails() {
		System.out.println("URL");
		
	}
	@BeforeMethod
	public void beforemethoddtls() {
		System.out.println("before method details");
	}
	@Test(priority =1,enabled=true,groups = "smoke")
	public void testdetails() {
		System.out.println("Test1");
	}
	@Test(priority=3,groups = "smoke")
	public void testdetails2() {
		System.out.println("test2");
	}
	@Test(priority=2,invocationCount=3)
	public void testdetails3() {
		System.out.println("test3");
	}
	@AfterMethod
	public void afterdetails() {
		System.out.println("after method details");
	}
@AfterTest
public void aftertestdetails() {
	System.out.println("After test details");
}
}
