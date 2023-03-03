package Steps;

import CommonMethods.GenericMethods;
import POM.UserCreationDictionary;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class UserCreationMethods {

    GenericMethods genericMethods = new GenericMethods();
    UserCreationDictionary userCreationDictionary = new UserCreationDictionary();

    public void registerUser(String excelPath, WebDriver driver) throws InvalidFormatException {

        List<String> nombreLista = new ArrayList<String>();
        List<String> apellidoLista = new ArrayList<String>();
        List<String> tipoDocumentoLista = new ArrayList<String> ();
        List<String> documentoLista = new ArrayList();
        List<String> emailLista = new ArrayList();
        List<String> telefonoLista = new ArrayList();
        List<String> añoLista = new ArrayList();
        List<String> mesLista = new ArrayList();
        List<String> diaLista = new ArrayList();
        List<String> rolLista = new ArrayList();
        List<String> concesionarioLista = new ArrayList();
        List<String> vitrinaLista = new ArrayList();
        List<String> usuarioLista = new ArrayList();
        List<String> contraseñaLista = new ArrayList();
        List<String> confirmarcontraseñaLista = new ArrayList();

        genericMethods.readExcelFile(excelPath,nombreLista,"NOMBRES");
        genericMethods.readExcelFile(excelPath,apellidoLista,"APELLIDOS");
        genericMethods.readExcelFile(excelPath,tipoDocumentoLista,"TIPO DE DOCUMENTO");
        genericMethods.readExcelFile(excelPath,documentoLista,"DOCUMENTO");
        genericMethods.readExcelFile(excelPath,emailLista,"EMAIL");
        genericMethods.readExcelFile(excelPath,telefonoLista,"TELEFONO");
        genericMethods.readExcelFile(excelPath,añoLista,"AÑO");
        genericMethods.readExcelFile(excelPath,mesLista,"MES");
        genericMethods.readExcelFile(excelPath,diaLista,"DIA");
        genericMethods.readExcelFile(excelPath,rolLista,"ROL");
        genericMethods.readExcelFile(excelPath,concesionarioLista,"CONCESIONARIO");
        genericMethods.readExcelFile(excelPath,vitrinaLista,"VITRINA");
        genericMethods.readExcelFile(excelPath,usuarioLista,"USUARIO");
        genericMethods.readExcelFile(excelPath,contraseñaLista,"CONTRASEÑA");
        genericMethods.readExcelFile(excelPath,confirmarcontraseñaLista,"CONFIRMAR CONTRASEÑA");

        try {
        Thread.sleep(5000);

        for(int indice=0; indice<apellidoLista.size();indice++) {

            String nombre = nombreLista.get(indice);
            String apellido = apellidoLista.get(indice);
            String tipoDocumento = tipoDocumentoLista.get(indice);
            String documento = documentoLista.get(indice);
            String email1 = emailLista.get(indice);
            String telefono = telefonoLista.get(indice);
            String año = añoLista.get(indice);
            String mes = mesLista.get(indice);
            //String dia = diaLista.get(indice);
            //String rol = rolLista.get(indice);
            //String concesionario = concesionarioLista.get(indice);
            //String vitrina = vitrinaLista.get(indice);
            String usuario = usuarioLista.get(indice);
            String contraseña = contraseñaLista.get(indice);
            String confirmarcontraseña = confirmarcontraseñaLista.get(indice);

            By documentTypeOption = By.xpath("//div[@class='option-container' and contains (text(),'"+tipoDocumento+"')]");
            By monthDropdownXpath = By.xpath("//div[@class=\"div-container\"]//div[contains(text(),'"+mes+"')]");

            driver.findElement(userCreationDictionary.registerUser).click();
            Thread.sleep(10000);
            driver.findElement(userCreationDictionary.name).sendKeys(nombre);
            driver.findElement(userCreationDictionary.lastName).sendKeys(apellido);
            driver.findElement(userCreationDictionary.typeDocument).click();
            driver.findElement(documentTypeOption).click();
            driver.findElement(userCreationDictionary.document).sendKeys(documento);
            driver.findElement(userCreationDictionary.email).sendKeys(email1);
            driver.findElement(userCreationDictionary.telephone).sendKeys(telefono);
            driver.findElement(userCreationDictionary.dateYear).sendKeys(año);
            driver.findElement(userCreationDictionary.dateMonth).click();
            driver.findElement(monthDropdownXpath).click();
            driver.findElement(userCreationDictionary.dayDate).click();
            //driver.findElement(userCreationDictionary.dayOption).click(dia);
            //driver.findElement(userCreationDictionary.rolOption).click(rol);
            driver.findElement(userCreationDictionary.vfOption).click();
            //driver.findElement(userCreationDictionary.concessionaire).click(concesionario);
            driver.findElement(userCreationDictionary.sconcessionaireOption).click();
            driver.findElement(userCreationDictionary.showCase).click();
            //driver.findElement(userCreationDictionary.showCaseOption).click(vitrina);
            driver.findElement(userCreationDictionary.userNameRegister).sendKeys(usuario);
            driver.findElement(userCreationDictionary.passwordRegister).sendKeys(contraseña);
            driver.findElement(userCreationDictionary.passwordConfirm).sendKeys(confirmarcontraseña);
            driver.findElement(userCreationDictionary.continButton).click();

            Thread.sleep(5000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}