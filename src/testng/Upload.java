package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Upload {
ChromeDriver driver;
@BeforeTest
public void set() {
	driver=new ChromeDriver();
}
@Test
public void setuo() throws InterruptedException, IOException {
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
Thread.sleep(3000);
Runtime.getRuntime().exec("\"C:\\Users\\anjan\\Downloads\\autoit\\t5.exe\"");
Thread.sleep(3000);
}
}
