package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickprgrm {
	ChromeDriver driver;
	@BeforeTest
	public void month() {
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
	}
	@Test
	public void set() {
		WebElement element=driver.findElement(By.xpath("//*[@id='datepicker1']"));
		element.click();
		datePickMethod("December 2024","23");
	}

	private void datePickMethod(String expmonth, String expdate) {
	
	while(true) {
	String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
		
	if(month.equals(expmonth)) {
		break;
		
	}
	else {
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]")).click();
	}
		
	}
	List<WebElement>date=driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
	for(WebElement d:date) {
	
		String s1=d.getText();
		
	if(s1.equals(expdate)) {
		d.click();
		break;
	}
	}
	}

}
