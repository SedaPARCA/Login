package Pages;

import StepDefinitions.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators extends Events {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this); // Kullanacağım zaman driver üzerinden bulur ve getirir.
    }
    @FindBy(xpath = "//*[@class='jsx-522986549 phoneNumberr']")
    public WebElement tremGlobalphoneNumber;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement TurkishGoodsHomeText;

    @FindBy(xpath = "(//*[text()='Home'])[1]")
    public WebElement TorAdvisoryHomeText;

    @FindBy(xpath = "//*[text()='Check Availability']")
    public WebElement grandSirkeciCheckAvailibalityText;

    @FindBy(xpath = "//*[text()='ANASAYFA']")
    public WebElement WaffleworksAnasayfaText;

    @FindBy(xpath = "(//*[text()='Anasayfa'])[1]")
    public WebElement CabraLocaAnasayfaText;

    @FindBy(xpath = "//*[text()='Home']")
    public WebElement FreightPortalHomeText;

    @FindBy(xpath = "(//*[text()='Home'])[1]")
    public WebElement TremChartHomeText;

    @FindBy(xpath = "//*[text()='EMLAK ACENTELERİNE \"KAPSAMLI DESTEK\"']")
    public WebElement TremTurkeyText;

    @FindBy(xpath = "//*[text()='WELCOME TO TOR TRANSFER']")
    public WebElement TorTransferText;
















































































}