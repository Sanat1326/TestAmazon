package in.amazon.generics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * WebDriver Generic class
 * @author PRANAV
 *
 */
public class WebDriverCommonLib {
	/**
	 * Implicit wait for WebElement
	 * @param driver
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	/**
	 * Explicit wait for WebElement
	 * @param driver
	 * @param element
	 */
    public void explicitWaitUntilVisiblity(WebDriver driver,WebElement element) {
    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    /**
     * Custom wait for Enabled WebElement
     * @param element
     */
    public void customWaitForEnabledElement(WebElement element) {
    	int i=0;
    	while(i<=100) {
    		try {
    			element.isEnabled();
    		}
    		catch(Exception e) {
    			i++;
    		}
    	}
    	
    }
    /**
     * select the option from the listbox on the basis of index
     * @param element
     * @param index
     */
    public void selectOption(WebElement element,int index) {
    	
    	Select s=new Select(element) ;
    	s.selectByIndex(index); 	
    }
    /**
     * select the option from the listbox on the basis of visibleText
     * @param element
     * @param text
     */
    public void selectOption(WebElement element,String text) {
    	Select s=new Select(element) ;
    	s.selectByVisibleText(text);
    	
    }
    
}
