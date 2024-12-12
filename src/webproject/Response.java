package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response {
	ChromeDriver driver;
	@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.in/");
		
	}
	@Test
	public void setup() {
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		for(WebElement elements:linkdetails) {
			String link=elements.getAttribute("href");
			verify(link);
			
		}
	}
	
private void verify(String link) {
		// TODO Auto-generated method stub
	try {
		URL u=new URL(link);
		HttpURLConnection code=(HttpURLConnection)u.openConnection();
		int c=code.getResponseCode();
		if(c==200) {
			System.out.println("code is 200"+link);
			
		}
		else if(c==400) {
			System.out.println("code is 400"+link);
		}
		else {
			System.out.println("other code");
	}}
	catch(Exception e) {
		
	}
}
}

		

