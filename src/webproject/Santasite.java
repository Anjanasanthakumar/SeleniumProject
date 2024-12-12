package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Santasite {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	@Test
	public void set() {
		
		String actualtitle=driver.getTitle();
		String exp="sanatamonica abroad";
		if(actualtitle.equals(exp)) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li[2]/ul/li/ul/li/a")).click();
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li[2]/a")).click();

		driver.findElement(By.xpath("//a[@href='https://santamonicaedu.in/country/study-in-australia/']")).click();
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//nav[@id='menu']/div/ul/li[4]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@class='detailPage bg-light-section']/div/div/div[6]/div/div/a/div/img")).click();
		driver.findElement(By.xpath("//div[@id='event-details']/div[3]/div/div[1]/div/div[2]/div[1]/div[2]/div/div")).click();
	driver.findElement(By.xpath("//a[@href='https://docs.google.com/forms/d/e/1FAIpQLSekeUqL6snbGl0hv3U7wui35QhdBK_w7Z77pES-WJRMmcL8IA/viewform']")).click();
		String s=driver.getPageSource();
		if(s.contains("Our Branches")) {
			System.out.println("present");
		}
		else {
			System.out.println("not present");
		}
	}

}
