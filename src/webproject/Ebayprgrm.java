package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayprgrm {
	private static final CharSequence Books = null;
	ChromeDriver driver;
	@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		}
	@Test
	public void sets() {
		String actual=driver.getTitle();
		String exp="Ebay.com";
		if(exp.equals(actual)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		driver.findElement(By.xpath("//*[@id=\"gh-sbc-o\"]/table/tbody/tr/td/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//img[@src='https://i.ebayimg.com/thumbs/images/g/9coAAOSwCyZiYiY8/s-l225.webp']")).click();
		driver.findElement(By.xpath("//div[@id='gh-top']/ul[2]/li[6]/div[1]/a")).click();
		driver.findElement(By.xpath("//form[@id='gh-f']/table/tbody/tr/td/div/div/input")).sendKeys("Books",Keys.ENTER);
	}
	@Test
	public void max() {
		String s=driver.getPageSource();
		if(s.contains("Shop by category")) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
	}
}
