package Scenarios;

import Steps.UserLoginMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserLogin {

    UserLoginMethods userLoginMethods = new UserLoginMethods();
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage(). window(). maximize();
        driver.get("https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/");
    }

    @Test(priority = 1)

    public void loginAutofinance() throws InterruptedException {
       userLoginMethods.Login(driver);
    }

    @AfterClass
    public void shutUp(){
        driver.close();
        driver.quit();
    }

}
