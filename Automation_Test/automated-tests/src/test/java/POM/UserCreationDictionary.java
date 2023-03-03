package POM;

import org.openqa.selenium.By;

public class UserCreationDictionary {
    public final By registerUser = By.xpath("//p[@class='register-container']//strong"); //almacenamiento
    public final By name = By.xpath("//app-register//input[@id='name']");
    public final By lastName = By.xpath("//input[@id='lastname']");
    public final By typeDocument = By.xpath("//div[@class='container-select widh-select']//em[@class='icon-chevrondown']");
    public final By document = By.xpath("//app-register//input[@id='document']");
    public final By email = By.xpath("//app-register//input[@type='email']");
    public final By telephone = By.xpath("//input[@id='phone_number']");
    public final By dateYear = By.xpath("//input[@placeholder='Año']");
    public final By dateMonth = By.xpath("(//em[@class=\"icon-chevrondown\"])[2]");
    public final By dayDate = By.xpath("(//em[@class='icon-chevrondown'])[3]");
    //public final By dayOption = By.xpath("//div[contains(text(),'16')]");
    //public final By rolOption = By.xpath("(//em[@class='icon-chevrondown'])[4]");
    public final By vfOption = By.xpath("//div[@class='div-container']//div[contains(text(),'F&I')]");
    //public final By concessionaire = By.xpath("(//em[@class='icon-chevrondown'])[5]");
    public final By sconcessionaireOption = By.xpath("//div[@class='div-container']//div[contains(text(),'ALL CAR')]");
    public final By showCase = By.xpath("(//em[@class='icon-chevrondown'])[6]");
    //public final By showCaseOption = By.xpath("//div[@class='div-container']//div[contains(text(),'ALL CAR  - Centro Mayor  - CHEVROLET')]");
    public final By userNameRegister = By.xpath("//input[@id='user']");
    public final By passwordRegister = By.xpath("//input[@id='password']");
    public final By passwordConfirm = By.xpath("//input[@id='confirm_password']");
    public final By continButton = By.xpath("//button[@class='button-container button-container-primary']");
}
