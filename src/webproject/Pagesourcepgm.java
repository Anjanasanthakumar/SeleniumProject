package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {
	ChromeDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		
	}
	@Test
	public void pageSource() {
		String s=driver.getPageSource();
		String p="Gmail";
		if(s.contains(p)) {
			System.out.println("gmail is  present");
		}
		else {
			System.out.println("gmail is not  present");
		}
	}
	@After
	public void tear() {
		driver.quit();
	}

}
