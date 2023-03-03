package Steps;

import POM.QuoteDictionary;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class QuoteMethods {

    QuoteDictionary quoteDictionary= new QuoteDictionary();

    public void  QuoteCus (WebDriver driver) throws InterruptedException {

        Thread.sleep(8000);

        driver.findElement(quoteDictionary.userName).sendKeys("prueba_sefi");
        driver.findElement(quoteDictionary.password).sendKeys("Utv454@D29");
        driver.findElement(quoteDictionary.loginButton).click();
        Thread.sleep(20000);
        driver.findElement(quoteDictionary.ButtonQuote).click();
        Thread.sleep(4000);
        driver.findElement(quoteDictionary.vitrinaDropdownXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.vitrinaDropdownOptionXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.financingPlanDropdownXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.financingPlanDropdownOptionXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.brandDropdownXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.brandDropdownOptionXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.vehicleStatusDropdownXpath).click();
        Thread.sleep(1000);
        driver.findElement(quoteDictionary.vehicleStatusOptionDropdownXpath).click();
        Thread.sleep(2000);
        /*driver.findElement(quoteDictionary.modelYearVehicleDropdownXpath).click();
        //Thread.sleep(1000);
        //driver.findElement(quoteDictionary.modelYearVehicleOptionDropdownXpath).click();
        Thread.sleep(1000);*/
        driver.findElement(quoteDictionary.valueVechicleInputXpath).sendKeys("45000000");
        Thread.sleep(2000);
        driver.findElement(quoteDictionary.initialFeeInputXpath).sendKeys("10000000");
        Thread.sleep(3000);
        driver.findElement(quoteDictionary.paymentsMonthsContainerXpath).click();
        //driver.findElement(quoteDictionary.clicQuoteExtra).click();
        //Thread.sleep(3000);
        //driver.findElement(quoteDictionary.ExtraQuoteMonthsDropdownXpath).click();
        //Thread.sleep(1000);
        //driver.findElement(quoteDictionary.ExtraQuoteMonthsOptionDropdownXpath).click();
        //Thread.sleep(1000);
        driver.findElement(quoteDictionary.ButtonContinueXpathQuote).click();
        //Thread.sleep(2000);
        //driver.findElement(quoteDictionary.DownloadButtonQuote).click();
        //Thread.sleep(40000);
        //driver.findElement(quoteDictionary.ButtonContinueXpathQuoteDetails).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        }


}
