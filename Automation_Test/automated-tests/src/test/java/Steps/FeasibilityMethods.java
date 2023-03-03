package Steps;

import CommonMethods.DataBaseMethods;
import POM.FeasibilityDictionary;
import POM.QuoteFlowDictionary;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FeasibilityMethods {

    FeasibilityDictionary feasibilityDictionary = new FeasibilityDictionary();
    QuoteFlowDictionary quoteFlowDictionary = new QuoteFlowDictionary();

    //Almacena y Trae el Codigo OTP generado
    List<String> codeList = new ArrayList<String>();
    String consult = "SELECT code FROM \"general\".acceptance_of_conditions WHERE email = 'tania.rocha@santanderconsumer.co' AND generated_date BETWEEN '2022-09-04' AND NOW() AND acceptance_date IS null order by generated_date desc fetch first 1 rows only";
    String column = "code";
    String value;

    //
    public void  FeasibilityC (WebDriver driver) throws InterruptedException {

        Thread.sleep(8000);
        driver.findElement(feasibilityDictionary.userName).sendKeys("prueba_sefi");
        driver.findElement(feasibilityDictionary.password).sendKeys("Utv454@D29");
        driver.findElement(feasibilityDictionary.loginButton).click();
        Thread.sleep(40000);
        driver.findElement(feasibilityDictionary.customerFeasibility).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.nameClient).sendKeys("Tania");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.lastnameClient).sendKeys("Probando");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.typeDocument).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.ccOption).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.documentNumber).sendKeys("1040335989");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.phoneNumber).sendKeys("3125891515");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.dateYearC).sendKeys("1995");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.dateMonthC).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.monthOption).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.dayDate).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.dayOption).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.emailClient).sendKeys("tania.rocha@santanderconsumer.co");
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.typeActivity).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.typecAc).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.selecActivity).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.selecAc).click();
        Thread.sleep(1000);
        driver.findElement(feasibilityDictionary.income).sendKeys("8.000.000");
        Thread.sleep(20000);
        //Evidencia
        File customertFeasibility = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File directory = new File ("C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\screenshotFeasibility\\Customer1");
        try {
            Date fecha = new Date();
            DateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd HH.mm.ss");
            FileUtils.copyFile(customertFeasibility, new File(directory +   formatDate.format(fecha) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.findElement(feasibilityDictionary.contiButton).click();
        Thread.sleep(14000);

        //
        getValueFromDB();
        Thread.sleep(50000);
        driver.findElement(feasibilityDictionary.inputCodeOTP).sendKeys(value);
        driver.findElement(feasibilityDictionary.contiButton2).click();

        Thread.sleep(20000);


        driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);

        }




    public void getValueFromDB(){
        DataBaseMethods.consultDB(consult,column, codeList);
        value= codeList.get(0);


    }


    public void  QuoteC (WebDriver driver) throws InterruptedException {

        driver.findElement(quoteFlowDictionary.vitrinaDropdownXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.vitrinaDropdownOptionXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.financingPlanDropdownXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.financingPlanDropdownOptionXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.brandDropdownXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.brandDropdownOptionXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.vehicleStatusDropdownXpathQ).click();
        Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.vehicleStatusOptionDropdownXpathQ).click();
        Thread.sleep(2000);
        //driver.findElement(quoteFlowDictionary.modelYearVehicleDropdownXpathQ).click();
        //Thread.sleep(1000);
        //driver.findElement(quoteFlowDictionary.modelYearVehicleOptionDropdownXpathQ).click();
        //Thread.sleep(1000);
        driver.findElement(quoteFlowDictionary.valueVechicleInputXpathQ).sendKeys("45000000");
        Thread.sleep(2000);
        driver.findElement(quoteFlowDictionary.initialFeeInputXpathQ).sendKeys("10000000");
        Thread.sleep(3000);
        driver.findElement(quoteFlowDictionary.paymentsMonthsContainerXpathQ).click();
        //driver.findElement(quoteFlowDictionary.clicQuoteExtraQ).click();
        //Thread.sleep(3000);
        //driver.findElement(quoteFlowDictionary.ExtraQuoteMonthsDropdownXpathQ).click();
        //Thread.sleep(1000);
        //driver.findElement(quoteFlowDictionary.ExtraQuoteMonthsOptionDropdownXpathQ).click();
        Thread.sleep(1000);
        File customerQuote = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File directory = new File ("C:\\Users\\n498842\\eclipse-workspace\\Automation QA Autofinance\\screenshotQuote\\CustomerQ1");
        try {
            Date fecha = new Date();
            DateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd HH.mm.ss");
            FileUtils.copyFile(customerQuote, new File(directory +   formatDate.format(fecha) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        driver.findElement(quoteFlowDictionary.ButtonContinueXpathQuoteQ).click();
        Thread.sleep(2000);
        driver.findElement(quoteFlowDictionary.DownloadButtonQuoteQ).click();
        Thread.sleep(60000);
        driver.findElement(quoteFlowDictionary.ButtonContinueXpathQuoteDetailsQ).click();

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
    /*public void  ResultC (WebDriver driver) throws InterruptedException {

    }*/
}