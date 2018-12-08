package Testmater;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//WebElement objElement = new WebElement("A", "B");
    	
    	//WebElement objElement = new WebElement();
    	/*
    	WebElement objElement = new WebElement(Value, CSS)
    	objElement.Input("This is automation Test");
    	objElement.DoAction();
    	*/
    	String fullName = "Nguyen Thi Thu Trang";
    	int firstSpace = fullName.indexOf(" ",0);
    	String firtName = fullName.substring(0, firstSpace);
    	System.out.println(firtName);
    	
    	int lastSpace = fullName.lastIndexOf(" ", fullName.length());
    	String lastName = fullName.substring(lastSpace+1, fullName.length());
    	System.out.println(lastName);
    	
    	String[] arrP = fullName.split(" ");
    	String ho = fullName.split(" ")[0];
    	String ten = fullName.split(" ")[arrP.length-1];
    	
    	System.out.println(ho);
    	System.out.println(ten);
    	
    	//Cat chuoi bat ky
    	Random rad = new Random();
    	int randomNumber = rad.nextInt(fullName.length());
    	String part1 = fullName.substring(0, randomNumber);
    	
    	System.out.println(part1);
    	
    	/*
    	 * public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", 
                "D:\\SeleniumWebdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Open website
        driver.get("https://facebook.com");
        // Maximize the browser
        driver.manage().window().maximize();
        // Login facebook
        FacebookLogin facebookLogin = new FacebookLogin(driver);
        FacebookHomePage homePage = facebookLogin.login("viettuts@gmail.com", 
                "helloPW123");
        if (homePage.isDisplayed()) {
            System.out.println("Login Successfully!");
        } else {
            System.out.println("Login Fail!");
        }
        // Quit driver
        driver.quit();
    }

    	 */
    }
    
    private void test() {
    	NewWebElement objNewElement = new NewWebElement();
    	objNewElement.Input("Viettel");
    	objNewElement.DoAction();
    	objNewElement.HelloViettel();
    	
	}
}
