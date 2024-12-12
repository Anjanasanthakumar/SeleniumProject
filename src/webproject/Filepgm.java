package webproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Filepgm {
	ChromeDriver driver;
	@Before
	public void web() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/anjan/OneDrive/Documents/Desktop/java%20program/webpage.html");
	}
	@Test
	public void filedtls() throws IOException {
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File("C:\\Users\\anjan\\OneDrive\\Pictures\\Screenshots\\imgscreen.png"));
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File buttonimg=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonimg, new File("./screenshot/buttonimg.png"));
		WebElement textfield=driver.findElement(By.xpath("/html/body/input[2]"));
		File field=textfield.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(field, new File("./screenshot/text.png"));
			}

}
