package webproject;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Red1 {
ChromeDriver driver;
@Before
public void set() {
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void setup() {
	WebElement element=driver.findElement(By.xpath("//table[@id=\'tblcrtac\']/tbody/tr[26]/td[3]/select"));
	Select s1=new Select(element);
	s1.selectByVisibleText("India");
WebElement num	=driver.findElement(By.xpath("//table[@id=\'tblcrtac\']/tbody/tr[28]/td/div/table/tbody/tr[1]/td[3]/select"));
Select s=new Select(num);
s.selectByValue("Cochin");
}
}
