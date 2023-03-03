package Scenarios;

import POM.UserCreationDictionary;
import Steps.UserCreationMethods;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UserCreation {
    UserCreationMethods userCreationMethods = new UserCreationMethods();
    WebDriver driver;
    String excelPath = "C:\\Users\\n498842\\eclipse-workspace\\Autofinance_Testing\\src\\main\\resources\\User_Registration.xlsx";
    String url = "https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/";
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\src\\main\\resources\\drivers\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage(). window(). maximize();
        driver.get(url);
    }
    @Test(priority = 1)
    public void userCreationScenario() throws InvalidFormatException {
        userCreationMethods.registerUser(excelPath, driver);
    }
    @AfterClass
    public void shutUp(){
        //driver.close();
        //driver.quit();
    }


}
