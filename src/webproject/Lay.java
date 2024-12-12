package webproject;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lay {
	ChromeDriver driver;
	@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.in");
	}
	@Test
	public void sets() {
List<WebElement>listdetails = driver.findElements(By.tagName("a"));
System.out.println(listdetails.size());
for(WebElement element:listdetails) {
	String link=element.getAttribute("href");
	String linktext=element.getText();
	System.out.println(link);
	System.out.println(linktext);
}
}}
