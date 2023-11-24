package sanat;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import in.amazon.generics.FileLib;
import in.amazon.generics.WebDriverCommonLib;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        FileLib f=new FileLib();
        String url= f.getPropertyValue("url", "C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\commondata.property.txt");
        System.out.println(url);
        
        WebDriverCommonLib w=new WebDriverCommonLib();
        w.implicitWait(driver);
        driver.get(url);
      /*  String data=f.getExcelData("CreateCustomer", 1, 2,"C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\testscript1.xlsx");
        System.out.println(data);
        f.setExcelData("InvalidLogin", 9, 1, "sanat","C:\\\\Users\\\\PRANAV\\\\eclipse-workspace\\\\TestAmazonPage\\\\src\\\\test\\\\resources\\\\data\\\\testscript1.xlsx");
        String data1=f.getExcelData("InvalidLogin", 9, 1,"C:\\Users\\PRANAV\\eclipse-workspace\\TestAmazonPage\\src\\test\\resources\\data\\testscript1.xlsx");
        System.out.println(data1);*/
        //driver.close();
        
        
	}

}
