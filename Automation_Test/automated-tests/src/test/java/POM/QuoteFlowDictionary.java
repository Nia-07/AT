package POM;

import org.openqa.selenium.By;

public class QuoteFlowDictionary {

    public final By vitrinaDropdownXpathQ  = By.xpath("(//em[@class=\"icon-chevrondown\"])[1]");
    public final By vitrinaDropdownOptionXpathQ  = By.xpath("//div[@class=\"option-container\" and contains (text(),'LOS COCHES - Peugeot Chia - PEUGEOT')]");
    public final By financingPlanDropdownXpathQ = By.xpath("(//em[@class=\"icon-chevrondown\"])[2]");
    public final By financingPlanDropdownOptionXpathQ = By.xpath("//div[@class=\"option-container\" and contains (text(),' Tradicional')]");
    public final By brandDropdownXpathQ = By.xpath("(//em[@class=\"icon-chevrondown\"])[3]");
    public final By brandDropdownOptionXpathQ = By.xpath("(//div[@class=\"option-container\" and contains (text(),'PEUGEOT')])[4]");
    public final By vehicleStatusDropdownXpathQ = By.xpath("(//em[@class=\"icon-chevrondown\"])[4]");
    public final By vehicleStatusOptionDropdownXpathQ = By.xpath("(//div[@class=\"option-container\" and contains (text(),'Nuevo')])[1]");
    /*public final By modelYearVehicleDropdownXpathQ = By.xpath("(//em[@class=\"icon-chevrondown\"])[5]");
    //public final By modelYearVehicleOptionDropdownXpathQ = By.xpath("//div[@class=\"option-container\" and contains (text(),'2017')]");*/
    public final By valueVechicleInputXpathQ  = By.xpath("//lib-santander-input[@formcontrolname=\"vehicleValue\"]//input");
    public final By initialFeeInputXpathQ  = By.xpath("//input[@class=\"input-container-data ng-untouched ng-pristine ng-valid\"]");
    //public final By clicQuoteExtraQ  = By.xpath("//input[@class=\"input-container-data ng-pristine ng-valid ng-touched\"]");
    public final By paymentsMonthsContainerXpathQ = By.xpath("//div[@class=\"card\"]//p[contains(text(),'36')]");
    /*public final By ExtraQuoteMonthsDropdownXpathQ= By.xpath("//div[@class=\"icon-container\"])[9]");
    //public final By ExtraQuoteMonthsOptionDropdownXpathQ  = By.xpath("//div[@class=\"option-container\" and contains (text(),' Julio/Enero')]");*/
    public final By ButtonContinueXpathQuoteQ = By.xpath("(//button[@class=\"button-container button-container-primary\"])[1]");
    public final By DownloadButtonQuoteQ = By.xpath("//a[@class=\"modal-container__container-options-a modal-container__container-options-a__line\"]");
    public final By ButtonContinueXpathQuoteDetailsQ = By.xpath("(//button[@class=\"button-container button-container-primary\"])[2]");

}


