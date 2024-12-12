package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mouseevents {
	ChromeDriver driver;
	@BeforeTest
	public void event() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void set() {
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement amount=driver.findElement(By.xpath("//*[@id='amt7']/li"));
		ac.dragAndDrop(element, amount);
		ac.perform();
		WebElement bank=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		ac.dragAndDrop(bank, account);
		ac.perform();
	
		
	}

}
