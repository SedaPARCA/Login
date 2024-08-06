package StepDefinitions;

import Pages.Locators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Steps {

    private Response apiResponse;
    Locators lc = new Locators();

    @Given("Navigate to TremGlobal")
    public void navigateToTremGlobal()  {

        GWD.getDriver().get("https://www.tremglobal.com/");

    }

    @When("Verification of Access to the TremGlobal Page")
    public void verificationOfAccessToTheTremGlobalPage() throws InterruptedException {

        Thread.sleep(1000);

       Assert.assertTrue(lc.tremGlobalphoneNumber.isDisplayed());
    }

    @Given("Navigate to TurkishGoods")
    public void navigateToTurkishGoods() {

        GWD.getDriver().get("https://turkishgoods.com/");
    }

    @When("Verification of Access to the TurkishGoods Page")
    public void verificationOfAccessToTheTurkishGoodsPage() {

        lc.verifyContainsText(lc.TurkishGoodsHomeText,"Home");

    }

    @Given("Navigate to TorAdvisory")
    public void navigateToTorAdvisory() {
        GWD.getDriver().get("https://www.toradvisory.com/");

    }

    @When("Verification of Access to the TorAdvisory Page")
    public void verificationOfAccessToTheTorAdvisoryPage() {

        lc.verifyContainsText(lc.TorAdvisoryHomeText,"Home");
    }

    @Given("Navigate to GrandSirkeci")
    public void navigateToGrandSirkeci() {

        GWD.getDriver().get("https://grandsirkeci.com/");

    }

    @When("Verification of Access to the GrandSirkeci Page")
    public void verificationOfAccessToTheGrandSirkeciPage() {

        lc.verifyContainsText(lc.grandSirkeciCheckAvailibalityText,"Check Availability");
    }

    @Given("Navigate to WaffleWorks")
    public void navigateToWaffleWorks() {

        GWD.getDriver().get("https://www.waffleworks.com.tr/");
    }

    @When("Verification of Access to the WaffleWorks Page")
    public void verificationOfAccessToTheWaffleWorksPage() {
    lc.verifyContainsText(lc.WaffleworksAnasayfaText,"ANASAYFA");
    }

    @Given("Navigate to CabraLoca")
    public void navigateToCabraLoca() {

        GWD.getDriver().get("https://cabralocaturkiye.com/");
    }

    @When("Verification of Access to the CabraLoca Page")
    public void verificationOfAccessToTheCabraLocaPage() {
     lc.verifyContainsText(lc.CabraLocaAnasayfaText,"Anasayfa");
    }

    @Given("Navigate to FreightPortal")
    public void navigateToFreightPortal() {
        GWD.getDriver().get("https://freightportal.com/");

    }

    @When("Verification of Access to the FreightPortal Page")
    public void verificationOfAccessToTheFreightPortalPage() {
    lc.verifyContainsText(lc.FreightPortalHomeText,"Home");
    }

    @Given("Navigate to TremChart")
    public void navigateToTremChart() {

        GWD.getDriver().get("https://tremchart.com/");
    }

    @When("Verification of Access to the TremChart Page")
    public void verificationOfAccessToTheTremChartPage() {
    lc.verifyContainsText(lc.TremChartHomeText,"Home");

    }

    @Given("Navigate to TremTurkey")
    public void navigateToTremTurkey() {
        GWD.getDriver().get("https://tremturkey.com/");
    }

    @When("Verification of Access to the TremTurkey Page")
    public void verificationOfAccessToTheTremTurkeyPage() {

  lc.verifyContainsText(lc.TremTurkeyText,"EMLAK ACENTELERİNE \"KAPSAMLI DESTEK\"");
    }

    @Given("Navigate to TorTransfer")
    public void navigateToTorTransfer() {
        GWD.getDriver().get("https://tortransfer.com/");

    }

    @When("Verification of Access to the TorTransfer Page")
    public void verificationOfAccessToTheTorTransferPage() {

        lc.verifyContainsText(lc.TorTransferText,"WELCOME TO TOR TRANSFER");

    }
}
