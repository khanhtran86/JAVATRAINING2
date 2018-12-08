package Testmater;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class FacebookLogin {
    private WebDriver driver;
     
    @FindBy(id="email")
    private WebElement weEmail;
    @FindBy(id="pass")
    private WebElement wsPassword;
    @FindBy(id="loginbutton")
    private WebElement wsTtnLogin;
     
    public FacebookLogin(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    public FacebookHomePage login(String email, String password) {
        // enter email
        weEmail.sendKeys(email);
        // enter password
        wsPassword.sendKeys(password);
        // click login button
        wsTtnLogin.click();
        // return home page
        return new FacebookHomePage(driver);
    }
}
