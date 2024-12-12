package testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrive {
	ChromeDriver driver;
	@BeforeTest
	public void set() {
		driver=new ChromeDriver();
	}
	@Test
	public void count() throws IOException {
		driver.get("https://www.facebook.com/");
		FileInputStream fi=new FileInputStream("C:\\Users\\anjan\\OneDrive\\Documents\\Desktop\\New Microsoft Excel Worksheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("sheet1");
		int rowCount=sh.getLastRowNum();
		for(int i=1;i<=rowCount;i++) {
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username:"+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password:"+password);
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
		}
		
	}

}
