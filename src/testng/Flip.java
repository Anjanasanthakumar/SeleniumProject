package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flip {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void details() {
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		String actual=driver.getTitle();
		String exp="Amazon.in:mobile phones";
		if(exp.equalsIgnoreCase(actual)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		String firstphone=driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Set<String>next=driver.getWindowHandles();
		for(String handle:next) {
			if(!handle.equalsIgnoreCase(firstphone)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				
				driver.close();
			}
			driver.switchTo().window(firstphone);
		}
		
	}

}
