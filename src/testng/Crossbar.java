package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Crossbar {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser) {
		if(browser.equals("Chromedriver")) {
		driver=new ChromeDriver();}
		else if(browser.equals("Edgedriver")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	}
	@Test
	public void cross() {
		driver.get("https://www.guru99.com/drag-drop-selenium.html");
		String s=driver.getTitle();
		if(s.equals("Drag and Drop Action")) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		WebElement element=driver.findElement(By.xpath("//*[@id='menu-item-3173']/a/span"));
		element.click();
		
		
		
	}

}
