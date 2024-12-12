package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santa {
	ChromeDriver driver;
	@Before
	public void sandetails() {
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	@Test
	public void set() {
		List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
		for(WebElement element:linkdetails) {
			String s=element.getAttribute("href");
			verify(s);
			
		}
	}
	private void verify(String s) {
		try {
			URL u=new URL(s);
			HttpURLConnection c=(HttpURLConnection)u.openConnection();
			int code=c.getResponseCode();
			if(code==404) {
				System.out.println("broken links"+s);
			}
			else {
				System.out.println("no broken links"+s);
			}
			}
			catch(Exception e) {
				
			}

		
	}

}
