package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
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

}
