package testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgm {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
@Test
public void setup() {
	
	driver.findElement(By.xpath("//*[@id='username']")).sendKeys("student");
	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password123");
	driver.findElement(By.xpath("//*[@id='submit']")).click();
	String exp="https://practicetestautomation.com/logged-in-successfully/";
	String actual=driver.getCurrentUrl();
Assert.assertEquals(exp, actual);
}

	
}

	

