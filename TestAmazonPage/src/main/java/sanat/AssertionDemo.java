package sanat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionDemo {
	@Test
	public void testHomePageTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String expectedTitle ="Amazon";
	    String actualTitle = driver.getTitle();
		Reporter.log(actualTitle,true);
		//Assert.assertEquals(actualTitle, expectedTitle);
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		driver.close();
		s.assertAll();
	}

}

