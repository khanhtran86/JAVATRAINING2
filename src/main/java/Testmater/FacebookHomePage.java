package Testmater;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
 
public class FacebookHomePage {
    private WebDriver driver;
    private By byUserNavigation = By.id("userNavigationLabel");
 
    public FacebookHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
 
    public boolean isDisplayed() {
        
    }
}

