package Steps;

import POM.UserLoginDictionary;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class UserLoginMethods {

    UserLoginDictionary userLoginDictionary = new UserLoginDictionary();

    public void  Login (WebDriver driver) throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(userLoginDictionary.userName).sendKeys("prueba_sefi");
                Thread.sleep(1000);
        driver.findElement(userLoginDictionary.password).sendKeys("Utv454@D29");
                Thread.sleep(1000);
        driver.findElement(userLoginDictionary.loginButton).click();
                Thread.sleep(6000);
       //Captura de pantalla
        File screenshotLoginUser = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               File directory = new File ("C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\screenshotLoginUser\\Login_Sefi_1");
                    try {
                        Date fecha = new Date();
                        DateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd HH.mm.ss");
                        FileUtils.copyFile(screenshotLoginUser, new File(directory +   formatDate.format(fecha) + ".png"));
                        } catch (IOException e) {
                                            e.printStackTrace();
                        }

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

        Thread.sleep(2000);

    }

}