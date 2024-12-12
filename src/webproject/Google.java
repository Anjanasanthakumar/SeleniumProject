package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
@Test
public void set() {
	driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
	
}
}
