package data;

import org.testng.annotations.DataProvider;

public class Customizedp {
	@DataProvider(name="login")
	public Object[][] getdata()
	 {
		Object[][] data= {{"hii","123"}};
		return data;
	 }

}
