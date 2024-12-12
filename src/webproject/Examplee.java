package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examplee {
ChromeDriver driver;
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.shoppersstop.com/");
}
@Test
public void shop() {
	
		driver.findElement(By.xpath("//div[@id=\"__next\"]/main/header/div/div/nav/ul/div/div/a/div/a")).click();
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		for(WebElement link:linkdetails) {
			String s=link.getAttribute("href");
			System.out.println(s);
		String s1=link.getText();
		System.out.println(s1);
			try {
				URL c=new URL(s);
				HttpURLConnection code=(HttpURLConnection)c.openConnection();
				int u=code.getResponseCode();
				System.out.println(u);
				if(u==400) {
					System.out.println("broken link");
				}
				else {
					System.out.println("no broken link");
				}
			}
			catch(Exception e) {
		
		}
}
}}
