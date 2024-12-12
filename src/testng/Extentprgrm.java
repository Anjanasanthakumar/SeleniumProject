package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentprgrm {
		WebDriver driver;
		ExtentHtmlReporter reporter;
		ExtentTest test;
		ExtentReports extent;
		String url="https://www.facebook.com/";
		@BeforeTest
		public void set() {
			reporter =new ExtentHtmlReporter("./Report/myreport.html");
			reporter.config().setDocumentTitle("Automation report");
			reporter.config().setReportName("functional test");
			reporter.config().setTheme(Theme.DARK);
			extent=new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("host name", "local host");
			extent.setSystemInfo("OS", "windows11");
			extent.setSystemInfo("tester name","bcd");
			extent.setSystemInfo("browser name", "chrome");
			driver=new ChromeDriver();
		}
		@BeforeMethod
		public void setup() {
			driver.get(url);
		}
		@Test
		public void del() {
			test=extent.createTest("Fb title verification");
			String actual=driver.getTitle();
			String exp="Facebook – log in or sign up";
			Assert.assertEquals(exp, actual);
		}
@Test
public void title() {
	test=extent.createTest("Fb logo verification");
	boolean b=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);

}
@AfterTest
public void nexr() {
	extent.flush();
}
@AfterMethod
public void tear(ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		test.log(Status.FAIL, "test case failed is:"+result.getName());
		test.log(Status.FAIL," test case failed"+ result.getThrowable());
		
	}
	else if(result.getStatus()==ITestResult.SKIP){
		test.log(Status.SKIP, "test case skipped"+result.getName());
		
	}
	else if(result.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS,"test case passed"+result.getName());
	}
	
}
}
