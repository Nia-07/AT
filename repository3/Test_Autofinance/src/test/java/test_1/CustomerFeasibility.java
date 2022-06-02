package test_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CustomerFeasibility {
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
  public void beforeClass() {
	  
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo}\\eclipse-workspace\\Test_2\\src\\main\\resources\\drivers\\chromedriver.exe");
					
			driver = new ChromeDriver();
			
//Step 2 - open page web
			
			driver.manage(). window(). maximize();
			driver.get("https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/");  
	  
  }

//Step 3 - Fill userName  //case 4 - Fill Password
  
  @Test(priority = 2)
  public void loginAutofinance() throws InterruptedException {

	  
  Thread.sleep(3000); 
  
  By userName = By.xpath("//app-login//lib-santander-input[@formcontrolname='username']//input[@id='name']"); 
  By password = By.xpath("//app-login//input[@id='password']"); 
  By loginButton = By.xpath("//button[@class='button-container button-container-primary']");
  driver.findElement(userName).sendKeys("prueba_vendedor");
  driver.findElement(password).sendKeys("Zxc232@V27");
  driver.findElement(loginButton).click();
  
  
  Thread.sleep(5000); 
   
  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
  
  }
    
  @Test(priority = 3)
  public void feasibility() throws InterruptedException {

	
  Thread.sleep(6000); 
  
  By customerFeasibility = By.xpath("//div[@class=\"card-content\"]//p[contains(text(),'Viabilizar Cliente')]");                                 
  By nameClient = By.xpath("//lib-santander-input[@formcontrolname=\"name\"]//input");
  By lastnameClient = By.xpath("//lib-santander-input[@formcontrolname=\"lastname\"]//input");
  By typeDocument = By.xpath("//div[@class=\"widh-select\"]//em[@class=\"icon-chevrondown\"]");
  By ccOption = By.xpath("//div[@class='option-container' and contains (text(),'C.E.')]");
  By documentNumber = By.xpath("//lib-santander-input[@formcontrolname=\"document\"]//input");
  By phoneNumber = By.xpath("//lib-santander-input[@formcontrolname=\"phone_number\"]//input");
  By dateYearC =  By.xpath("//input[@placeholder=\"Año\"]");
  By dateMonthC = By.xpath("(//em[@class=\"icon-chevrondown\"])[2]");                     
  By monthOption = By.xpath("//div[@class=\"div-container\"]//div[contains(text(),'Agosto')]");
  By dayDate = By.xpath("(//em[@class=\"icon-chevrondown\"])[3]");
  By dayOption = By.xpath("//div[contains(text(),'22')]");
  By typeActivity = By.xpath("(//em[@class=\"icon-chevrondown\"])[4]");
  By typecAc = By.xpath("//div[contains(text(),'INDEPENDIENTE')]");
  By selecActivity = By.xpath("(//em[@class=\"icon-chevrondown\"])[5]");
  By selecAc = By.xpath("//div[contains(text(),'CONTRATISTA')]");
  By emailClient = By.xpath("//input[@type=\"email\"]");  
  By income = By.xpath("//input[@pattern=\"^[^a-zA-Z]+$\"]");
  By contiButton = By.xpath("//button[@class='button-container button-container-primary']");
  
  driver.findElement(customerFeasibility).click();
  driver.findElement(nameClient).sendKeys("Pepe");
  driver.findElement(lastnameClient).sendKeys("Pruebas");
  driver.findElement(typeDocument).click();
  driver.findElement(ccOption).click();
  driver.findElement(documentNumber).sendKeys("898789");
  driver.findElement(phoneNumber).sendKeys("3159889090");
  driver.findElement(dateYearC).sendKeys("1989");
  driver.findElement(dateMonthC).click();
  driver.findElement(monthOption).click();
  driver.findElement(dayDate).click();
  driver.findElement(dayOption).click();
  driver.findElement(typeActivity).click();
  driver.findElement(typecAc).click();
  driver.findElement(selecActivity).click();
  driver.findElement(selecAc).click();
  driver.findElement(emailClient).sendKeys("tania.rocha@ext.santander.com.co");
  driver.findElement(income).sendKeys("5.000.000");
  driver.findElement(contiButton).click();
    
  Thread.sleep(7000); 
   
  driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
  
  
  }

  @BeforeSuite
  public void beforeSuite() {
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }
  

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.close();
	  //driver.quit();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

 
  

  
 
  @AfterClass
  public void afterClass() {
  }

  
}

