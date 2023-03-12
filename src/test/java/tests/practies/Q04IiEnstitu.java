package tests.practies;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.IiEnstitu;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.Driver.driver;

public class Q04IiEnstitu {

    // Kullanici https://www.iienstitu.com/en sayfasina gider
    // Login butonuna tiklar
    // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
    // headers da bulunan egitimler kismina tiklar
    // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
    // ucretsiz egitimlerden herhangi birini alir
    // kimlik dogrulama islemlerini girer
    // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
    // Kullanici profil kismindan dersi basarili bir sekilde kaydedildigini test eder

@Test
    public void iiEnstituTesti(){
    // Kullanici https://www.iienstitu.com/en sayfasina gider

    Driver.getDriver().get(ConfigReader.getProperty("iiEnstituUrl"));

    // Login butonuna tiklar
    IiEnstitu iiEnstitu=new IiEnstitu();
    iiEnstitu.iiEnstituLogiButonu.click();

    // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
    iiEnstitu.eMailBox.sendKeys(ConfigReader.getProperty("iiEnstutiEMail"));

  iiEnstitu.passwortBox.sendKeys(ConfigReader.getProperty("iiEnstutiPasswort"));

  iiEnstitu.loginButton.click();

    // headers da bulunan egitimler kismina tiklar

    iiEnstitu.egitimlerButonu.click();

    // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
    Select select=new Select(iiEnstitu.fiyatAraligi);
    select.selectByVisibleText("Artan fiyat");

    // ucretsiz egitimlerden herhangi birini alir

    iiEnstitu.stresYönetimiEgitimi.click();

    // kimlik dogrulama islemlerini girer

    iiEnstitu.hemenBaslaButonu.click();


    Actions actions=new Actions(driver);
    actions.click(iiEnstitu.kimlikDogrulamaEMail).click()
            .sendKeys(ConfigReader.getProperty("iiEnstutiEMail"))
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB)
            .sendKeys(Keys.TAB).sendKeys("ali")
            .sendKeys(Keys.TAB).sendKeys("yilmaz")
            .sendKeys(Keys.TAB).sendKeys("ingolstad")
            .sendKeys(Keys.TAB).sendKeys("85123")
            .sendKeys(Keys.TAB).sendKeys("ingolstadt")
            .sendKeys(Keys.TAB).sendKeys("123412341234").perform();

    iiEnstitu.odemeyeGecButonu.click();

    // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar
    iiEnstitu.ücretsizYazisi.isDisplayed();

    driver.close();








}







}
