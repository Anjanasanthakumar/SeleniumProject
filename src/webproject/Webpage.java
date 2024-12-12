package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpage {
	ChromeDriver driver;
	@Before
	public void web() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/anjan/OneDrive/Documents/Desktop/java%20program/webpage.html");
	}
	@Test
	public void details() {
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("p");
		
		
	}

}
