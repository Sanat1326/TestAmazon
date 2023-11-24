package in.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
     @FindBy(id="nav-link-accountList-nav-line-1")
     private WebElement accountLists;
     
     @FindBy(id="nav-flyout-ya-signin")
     private WebElement signinBtn;
     
     @FindBy(id="ap_email")
     private WebElement emailTbx;
     
     @FindBy(id="continue")
     private WebElement continueBtn;
     
     @FindBy(id="ap_password")
     private WebElement passwordTbx;
     
     @FindBy(id="signInSubmit")
     private WebElement signinSubmit;
     
     @FindBy(id="nav-item-signout")
     private WebElement signoutBtn;
     
     public LoginPage(WebDriver driver) {
    	 PageFactory.initElements(driver, this);
     }
     
     public void setLogin(String un,String pw) {
    	 
    	 accountLists.click();
    	 emailTbx.sendKeys(un);
    	 continueBtn.click();
    	 passwordTbx.sendKeys(pw);
    	 signinSubmit.click();
     }   

}
