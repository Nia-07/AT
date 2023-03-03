package POM;

import org.openqa.selenium.By;

public class QuoteDictionary {

    public final By userName = By.xpath("//app-login//lib-santander-input[@formcontrolname=\"username\"]//input[@id=\"name\"]");
    public final By password = By.xpath("//app-login//input[@id=\"password\"]");
    public final By loginButton = By.xpath("//button[@class='button-container button-container-primary']");
    public final By ButtonQuote = By.xpath("//div[@class=\"card-content\"]//p[contains(text(),\"Cotizar\")]");
    public final By vitrinaDropdownXpath  = By.xpath("(//em[@class=\"icon-chevrondown\"])[1]");
    public final By vitrinaDropdownOptionXpath  = By.xpath("//div[@class=\"option-container\" and contains (text(),'LOS COCHES - Peugeot Chia - PEUGEOT')]");
    public final By financingPlanDropdownXpath = By.xpath("(//em[@class=\"icon-chevrondown\"])[2]");
    public final By financingPlanDropdownOptionXpath = By.xpath("//div[@class=\"option-container\" and contains (text(),' Tradicional')]");
    public final By brandDropdownXpath = By.xpath("(//em[@class=\"icon-chevrondown\"])[3]");
    public final By brandDropdownOptionXpath = By.xpath("(//div[@class=\"option-container\" and contains (text(),'PEUGEOT')])[4]");
    public final By vehicleStatusDropdownXpath = By.xpath("(//em[@class=\"icon-chevrondown\"])[4]");
    public final By vehicleStatusOptionDropdownXpath = By.xpath("(//div[@class=\"option-container\" and contains (text(),'Nuevo')])[1]");
    //public final By modelYearVehicleDropdownXpath = By.xpath("(//em[@class=\"icon-chevrondown\"])[5]");
    //public final By modelYearVehicleOptionDropdownXpath = By.xpath("//div[@class=\"option-container\" and contains (text(),'2017')]");
    public final By valueVechicleInputXpath  = By.xpath("//lib-santander-input[@formcontrolname=\"vehicleValue\"]//input");
    public final By initialFeeInputXpath  = By.xpath("//input[@class=\"input-container-data ng-untouched ng-pristine ng-valid\"]");
    //public final By clicQuoteExtra  = By.xpath("//input[@class=\"input-container-data ng-pristine ng-valid ng-touched\"]");
    public final By paymentsMonthsContainerXpath = By.xpath("//div[@class=\"card\"]//p[contains(text(),'36')]");
    //public final By ExtraQuoteMonthsDropdownXpath= By.xpath("//div[@class=\"icon-container\"])[9]");
    //public final By ExtraQuoteMonthsOptionDropdownXpath  = By.xpath("//div[@class=\"option-container\" and contains (text(),' Julio/Enero')]");
    public final By ButtonContinueXpathQuote = By.xpath("(//button[@class=\"button-container button-container-primary\"])[1]");
    public final By DownloadButtonQuote = By.xpath("//a[@class=\"modal-container__container-options-a modal-container__container-options-a__line\"]");
    public final By ButtonContinueXpathQuoteDetails = By.xpath("(//button[@class=\"button-container button-container-primary\"])[2]");

}
