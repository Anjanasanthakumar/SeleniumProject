package webproject;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecode {
	String link="https://www.facebook.com/";
	@Test
	public void response() {
	
		try {
			URL u=new URL(link);
HttpURLConnection c=(HttpURLConnection)u.openConnection();
int code=c.getResponseCode();
System.out.println(code);
if(code==200) {
	System.out.println("successful link");
}
else {
	System.out.println("not succesfull");
}

		}
		catch(Exception e) {
			
		}
	}

}
