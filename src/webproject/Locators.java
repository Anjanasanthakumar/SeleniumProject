package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	ChromeDriver driver;
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void locator() {
	driver.findElement(By.name("email")).sendKeys("anjana");
	driver.findElement(By.id("pass")).sendKeys("abcd");
	driver.findElement(By.name("login")).click();
}
}
