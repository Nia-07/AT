package test_1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ForgotPassword {
	WebDriver driver;
	WebDriver implicitlywait;

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  
//Step 1 - set Up the  GoogleChrome driver 
  
  @BeforeTest
  public void beforeTest() {
	  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo}\\eclipse-workspace\\Test_2\\src\\main\\resources\\drivers\\chromedriver.exe");
					
			driver = new ChromeDriver();
			
//Step 2 - open page web
			
			driver.manage(). window(). maximize();
			driver.get("https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/");  
	  
  }

//Step 3 - Click  forgotPassword //  Fill userName  // click button "passwordConfirm"
  
  @Test(priority = 2)
  public void forgotPassword() throws InterruptedException {

	  
  Thread.sleep(4000); 
  
  By forgotPassword = By.xpath("//p[@class=\"forgot-password-container\"]//strong");
  driver.findElement(forgotPassword).click();
  By userName = By.xpath("//input[@id=\"newPassword\"]");
  driver.findElement(userName).sendKeys("prueba_vendedor");
  By passwordConfirm = By.xpath("//button[@class=\"button-container button-container-primary\"]");
  driver.findElement(passwordConfirm).click();
  
  
  Thread.sleep(4000); 
   
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
  }


  @AfterTest
  public void afterSuite() {
	  
	  driver.close();
	  driver.quit();

  }
  
}
  
