package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
ChromeDriver driver;
@Before
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");}
	@Test
	public void desk() {
	String actualtitle=driver.getTitle();
	String exp="ebay.com";
	if(exp.equals(actualtitle)) {
		System.out.println("the title is ebay");
	}
	else {
		System.out.println("the title is not ebay");
	}
driver.findElement(By.xpath("//button[@id='gh-shop-a'])")).click();
driver.findElement(By.xpath("//a[@_sp='m570.l45104']")).click();
	

String p=driver.getPageSource();
if(p.contains("shop by category")) {
	System.out.println("page contains");
}
else {
	System.out.println("not contain");
}}}
	
		
		
	
	

