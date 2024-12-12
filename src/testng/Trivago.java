package testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
		driver.get("https://www.trivago.in/");
	}
@Test
public void setup() {
	WebElement element=driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div/fieldset/button[1]/span/span[2]/span[2]"));
	element.click();
	datePickerMethod("20 2024","November");
}
private void datePickerMethod(String expmonth, String expdate) {
WebElement month=driver.findElement(By.xpath("//*[@id='__next']/div/div/section/div/div/div/div/div/div/div/div/div/div/h3"));
String p=month.getText();
while(true) {
	if(p.equals(expmonth)) {
		break;
	}
	else {
		driver.findElement(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();

	}}
List<WebElement> date=driver.findElements(By.xpath("//*[@id='__next']/div[1]/div[2]/section[1]/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
	for(WebElement d:date) {
		String s=d.getText();
		if(s.equals(expdate)) {
			d.click();
			break;
		}
	}
}
}
