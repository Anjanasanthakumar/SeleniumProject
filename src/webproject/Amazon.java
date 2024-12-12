package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void locate() {
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_bestsellers']")).click();
	}

}
