package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru {
ChromeDriver driver;
@BeforeTest
public void set() {
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void gurumethod() {
	Actions ac=new Actions(driver);

	WebElement element=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	ac.contextClick(element);
	ac.perform();
	driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]")).click();
	Alert b=driver.switchTo().alert();
	b.accept();
	ac.perform();
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id='authentication']/button"));
	ac.doubleClick(doubleclick);
	ac.perform();
	Alert a=driver.switchTo().alert();
	a.accept();
	ac.perform();
	
	
	
}
}
