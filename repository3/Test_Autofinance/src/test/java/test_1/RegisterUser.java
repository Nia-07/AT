package test_1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class RegisterUser {
	WebDriver driver;
	//WebDriver implicitlywait;
	//WebDriverWait wait = new WebDriverWait(driver,15) ; 
	
	

  
//Step 1 - set Up the  GoogleChrome driver 
  
  @BeforeTest
  public void beforeClass() {
	  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo}\\eclipse-workspace\\Test_2\\src\\main\\resources\\drivers\\chromedriver.exe");
					
	driver = new ChromeDriver();
			
//Step 2 - open page web
			
	driver.manage(). window(). maximize();
	driver.get("https://autofinance.santanderfinancing.com/QXV0b0ZpbmFuY2U=/");  
	  
  }

//Step 3 - Click  forgotPassword //  Fill userName  // click button "passwordConfirm"
  
  @Test(priority = 2)
  public void registerUser() throws InterruptedException {
   
	  try {
		   
	  
	  Thread.sleep(5000); 
  
 
	  By registerUser = By.xpath("//p[@class='register-container']//strong"); //almacenamiento
	  By name = By.xpath("//app-register//input[@id='name']");
	  By lastName = By.xpath("//input[@id='lastname']");
	  By typeDocument = By.xpath("//div[@class='container-select widh-select']//em[@class='icon-chevrondown']");
	  By ccOption = By.xpath("//div[@class='option-container' and contains (text(),'C.E.')]");
	  By document = By.xpath("//app-register//input[@id='document']");
	  By email = By.xpath("//app-register//input[@type='email']");
	  By telephone = By.xpath("//input[@id='phone_number']");
	  By dateYear = By.xpath("//input[@placeholder='Año']");
	  By dateMonth = By.xpath("(//em[@class=\"icon-chevrondown\"])[2]");
	  By monthOption = By.xpath("//div[@class=\"div-container\"]//div[contains(text(),'Abril')]");
	  By dayDate = By.xpath("(//em[@class='icon-chevrondown'])[3]");
	  By dayOption = By.xpath("//div[contains(text(),'16')]");
	  By rolOption = By.xpath("(//em[@class='icon-chevrondown'])[4]");
	  By vfOption = By.xpath("//div[@class='div-container']//div[contains(text(),'Vendedor')]");
	  By concessionaire = By.xpath("(//em[@class='icon-chevrondown'])[5]");
	  By sconcessionaireOption = By.xpath("//div[@class='div-container']//div[contains(text(),'ALL CAR')]");
	  By showCase = By.xpath("(//em[@class='icon-chevrondown'])[6]");
	  By showCaseOption = By.xpath("//div[@class='div-container']//div[contains(text(),'ALL CAR  - Centro Mayor  - CHEVROLET')]");
	  By userNameRegister = By.xpath("//input[@id='user']");
	  By passwordRegister = By.xpath("//input[@id='password']");
	  By passwordConfirm = By.xpath("//input[@id='confirm_password']");
	  By continButton = By.xpath("//button[@class='button-container button-container-primary']");
	  
	  
	  //WebElement registerButton = driver.findElement(registerUser);  
	  //WebElement registerButton = (WebElement) wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(registerUser));  
	  //registerButton.click();
	  //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(registerUser));
  
	  //wait.until(ExpectedConditions.elementToBeClickable(registerUser));
	  driver.findElement(registerUser).click();
	  Thread.sleep(10000); 
	  driver.findElement(name).sendKeys("Tania Katherine");
	  driver.findElement(lastName).sendKeys("Rocha Hueso");
	  driver.findElement(typeDocument).click();
	  driver.findElement(ccOption).click();
	  driver.findElement(document).sendKeys("20304050");
	  driver.findElement(email).sendKeys("tania.rocha@ext.santander.com.co");
	  driver.findElement(telephone).sendKeys("3132552323");
	  driver.findElement(dateYear).sendKeys("1987");
	  driver.findElement(dateMonth).click();
	  driver.findElement(monthOption).click();
	  driver.findElement(dayDate).click();
	  driver.findElement(dayOption).click();
	  driver.findElement(rolOption).click();
	  driver.findElement(vfOption).click();
	  driver.findElement(concessionaire).click();
	  driver.findElement(sconcessionaireOption).click();
	  driver.findElement(showCase).click();
	  driver.findElement(showCaseOption).click();
	  driver.findElement(userNameRegister).sendKeys("prueba_fi.10");
	  driver.findElement(passwordRegister).sendKeys("Pruebas5*");
	  driver.findElement(passwordConfirm).sendKeys("Pruebas5*");
	  driver.findElement(continButton).click();
	  
	  Thread.sleep(5000); 
	  
	  } catch (Exception exception)  {
		  exception.printStackTrace();
	  }
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  
  }

  
  @AfterTest
  public void afterSuite() {
	  //driver.close();
	  //driver.quit();
  }
  
  
}
  
  
