package Scenarios;

import Steps.FeasibilityMethods;
import Steps.QuoteMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Feasibility {

    FeasibilityMethods feasibilityMethods = new FeasibilityMethods();
    QuoteMethods quoteMethods = new QuoteMethods();
    List<String> dato = new ArrayList<String>();
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage(). window(). maximize();
        driver.get("https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/");
    }

    @Test(priority = 1)
    public void CustomerFeasibility() throws InterruptedException {
        feasibilityMethods.FeasibilityC(driver);
    }

    @Test(priority = 2)
    public void Otp() throws InterruptedException {
        feasibilityMethods.getValueFromDB();
    }

    @Test(priority = 3)
    public void CustomerQuote() throws InterruptedException {
        feasibilityMethods.QuoteC(driver);
    }

    /*@Test(priority = 4)
    public void CustomerResult() throws InterruptedException {
        feasibilityMethods.ResultC(driver);
    }*/


    @AfterClass
    public void shutUp(){
        //driver.close();
        //driver.quit();
    }


}
