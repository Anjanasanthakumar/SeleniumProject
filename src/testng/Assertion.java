package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertion {
ChromeDriver driver;
@BeforeTest
public void set() {
	driver=new ChromeDriver();
	driver.get("https://www.google.in");
}
@Test
public void setup() {
	String actual=driver.getTitle();
	String exp="Google";
	//soft assertion if(actual.equals(exp)) {
		//System.out.println("pass");
	//}
//	else {
	//	System.out.println("fail");
	//}
	//Assert.assertEquals(exp, actual);
	System.out.println("hello");

}
}
