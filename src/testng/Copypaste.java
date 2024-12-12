package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void events() {
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input"));
		element.sendKeys("anjana");
		WebElement form=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]"));
		ac.keyDown(element, Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL);
		ac.keyDown(element, Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL);
		ac.keyDown(form, Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		ac.perform();
	}

}
