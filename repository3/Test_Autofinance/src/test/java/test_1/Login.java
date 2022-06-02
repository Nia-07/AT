package test_1;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login  {
	
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

//Step 3 - Fill userName  //case 4 - Fill Password
  
  @Test(priority = 2)
  public void loginAutofinance() throws InterruptedException {

	  
  Thread.sleep(4000); 
  
  By userName = By.xpath("//app-login//lib-santander-input[@formcontrolname=\"username\"]//input[@id=\"name\"]"); 
  By password = By.xpath("//app-login//input[@id=\"password\"]"); 
  By loginButton = By.xpath("//button[@class='button-container button-container-primary']");
  driver.findElement(userName).sendKeys("prueba_sefi");
  driver.findElement(password).sendKeys("Utv454@D30");
  driver.findElement(loginButton).click();
  
  
  Thread.sleep(3000); 
   
  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  
  }

  @AfterTest
  public void afterSuite() {
	  

  }
  
}
  
 
 
