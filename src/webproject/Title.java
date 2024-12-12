package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	ChromeDriver driver;
	@Before
	public void setup(){
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void titleVerification() {
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String exp="facebook";
		if(exp.equals(actualtitle)) {
			System.out.println("title are same");
		}
		else {
			System.out.println("title are not same");
		}
			}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
