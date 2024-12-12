package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prgrm {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	@Test
	public void pgm() {
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form\']/div[2]/div[1]/div[1]/input")).sendKeys("mobile",Keys.ENTER);
		
	}

}
