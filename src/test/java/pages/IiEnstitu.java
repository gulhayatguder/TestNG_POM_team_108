package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IiEnstitu {

    public IiEnstitu(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//button[@class='button flex items-center font-bold bg-transparent text-black dark:text-white border-2 border-primary -p-0.5 pt-3.5 px-7 pb-3']")
    public WebElement iiEnstituLogiButonu;

    @FindBy(id ="username")
    public  WebElement eMailBox;

    @FindBy(id = "password")
    public WebElement passwortBox;

    @FindBy(id = "loginbtn")
     public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='nav-item nav-link'])[5]")
    public  WebElement egitimlerButonu;

    @FindBy(xpath = "//select[@class='border-0 focus:ring-0 py-2 pl-3 pr-10 bg-primary text-white text-sm rounded-lg']")
    public  WebElement fiyatAraligi;

    @FindBy(xpath = "//img[@alt='Stres Yönetimi Eğitimi']")
    public WebElement stresYönetimiEgitimi;

    @FindBy(xpath = "//button[text()='Hemen Başla']")
    public WebElement hemenBaslaButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement kimlikDogrulamaEMail;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement odemeyeGecButonu;
    @FindBy(xpath = "//strong[text()='ücretsiz']")
    public WebElement ücretsizYazisi;

}
