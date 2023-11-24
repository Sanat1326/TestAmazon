package in.amazon.generics;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import in.amazon.pom.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		Reporter.log("openBrowser", true);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login", true);
		FileLib f=new FileLib();
		String url=f.getPropertyValue("url","C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\commondata.property.txt");
		String un=f.getPropertyValue("username","C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\commondata.property.txt");
	    String pw=f.getPropertyValue("password","C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\commondata.property.txt");	
		driver.get(url);
	    LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);
		
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		 
	}



}
