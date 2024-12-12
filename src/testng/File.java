package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class File {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
	}
	@Test
	public void setup() throws AWTException, InterruptedException  {
		driver.findElement(By.xpath("//*[@id='pickfiles']/span")).click();
		fileUpload("\"C:\\Users\\anjan\\OneDrive\\Documents\\bug report.docx\"");
	}
	private void fileUpload(String p) throws AWTException, InterruptedException {
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rob=new Robot();
		rob.delay(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyPress(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		rob.delay(2000);
	}

}
