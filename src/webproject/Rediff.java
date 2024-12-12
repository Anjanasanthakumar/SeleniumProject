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
import org.openqa.selenium.support.ui.Select;

public class Rediff {
	ChromeDriver driver;
	@Before
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void sets() throws IOException {
		driver.manage().window().maximize();
		WebElement day=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select"));
	Select s=new Select(day);
	s.selectByValue("06");
	WebElement month=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	Select s1=new Select(month);
	s1.selectByVisibleText("AUG");
	WebElement year=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	Select s2=new Select(year);
	s2.selectByValue("1986");
	File code=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(code, new File("./screenshot/img.png"));
	WebElement element=driver.findElement(By.xpath("//table[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
	File d=element.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(d, new File("./screenshot/drop.png"));
	WebElement button=driver.findElement(By.id("Register"));
	File buttonimg=button.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(buttonimg, new File("./screenshot/button.png"));


	
				
	}

}
