package POM;

import org.openqa.selenium.By;


public class UserLoginDictionary {

    public final By userName = By.xpath("//app-login//lib-santander-input[@formcontrolname=\"username\"]//input[@id=\"name\"]");
    public final By password = By.xpath("//app-login//input[@id=\"password\"]");
    public final By loginButton = By.xpath("//button[@class='button-container button-container-primary']");

}
