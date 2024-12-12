package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redmail {
	ChromeDriver driver;
	@Before
	public void text() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void set() {
	WebElement button=	driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
	String s=button.getAttribute("value");
		
			if(s.equals("Check availability")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
	}

}
