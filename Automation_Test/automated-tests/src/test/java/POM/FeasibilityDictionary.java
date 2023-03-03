package POM;

import org.openqa.selenium.By;

public class FeasibilityDictionary {
    public final By userName = By.xpath("//app-login//lib-santander-input[@formcontrolname=\"username\"]//input[@id=\"name\"]");
    public final By password = By.xpath("//app-login//input[@id=\"password\"]");
    public final By loginButton = By.xpath("//button[@class='button-container button-container-primary']");
    public final By customerFeasibility = By.xpath("//div[@class=\"card-content\"]//p[contains(text(),\"Viabilizar Cliente\")]");
    public final By nameClient = By.xpath("//lib-santander-input[@formcontrolname=\'name\']//input");
    public final By lastnameClient = By.xpath("//lib-santander-input[@formcontrolname=\'lastname\']//input");
    public final By typeDocument = By.xpath("(//em[@class=\"icon-chevrondown\"])[1]");
    public final By ccOption = By.xpath("//div[@class='option-container' and contains (text(),'C.E.')]");
    public final By documentNumber = By.xpath("//lib-santander-input[@formcontrolname=\'document\']//input");
    public final By phoneNumber = By.xpath("//lib-santander-input[@formcontrolname=\'phone_number\']//input");
    public final By dateYearC =  By.xpath("//input[@placeholder=\"Año\"]");
    public final By dateMonthC = By.xpath("(//em[@class='icon-chevrondown'])[2]");
    public final By monthOption = By.xpath("//div[@class='div-container']//div[contains(text(),'Agosto')]");
    public final By dayDate = By.xpath("(//em[@class=\'icon-chevrondown\'])[3]");
    public final By dayOption = By.xpath("//div[contains(text(),'22')]");
    public final By emailClient = By.xpath("//input[@type=\'email\']");
    public final By typeActivity = By.xpath("(//em[@class=\'icon-chevrondown\'])[4]");
    public final By typecAc = By.xpath("//div[contains(text(),'INDEPENDIENTE')]");
    public final By selecActivity = By.xpath("(//em[@class=\'icon-chevrondown\'])[5]");
    public final By selecAc = By.xpath("//div[contains(text(),'CONTRATISTA')]");
    public final By income = By.xpath("//input[@pattern=\'^[^a-zA-Z]+$\']");
    public final By contiButton = By.xpath("//button[@class='button-container button-container-primary']");
    public final By inputCodeOTP = By.xpath("//input[@type=\'text\']");
    public final By contiButton2 = By.xpath("//button[@class='button-container button-container-primary']");
}
