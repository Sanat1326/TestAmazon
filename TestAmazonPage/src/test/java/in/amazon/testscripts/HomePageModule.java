package in.amazon.testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import in.amazon.generics.BaseClass;

public class HomePageModule extends BaseClass {
	@Test
	public void testHomePageTitle() {
		String expectedTitle=driver.getTitle();
		String actualTitle=driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		driver.close();
		s.assertAll();
	}

}
