package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	@Parameters("s")
	@Test
	public void method(String s) {
		System.out.println("parameter value:"+s);
	}

}
