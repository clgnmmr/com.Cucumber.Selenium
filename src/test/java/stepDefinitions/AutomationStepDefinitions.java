package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationStepDefinitions {
    AutomationPage atp = new AutomationPage();
    Faker faker = new Faker();
    Actions action = new Actions(Driver.getDriver());

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        atp.singInButton.click();
    }
    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        atp.emailTextBox.sendKeys(faker.internet().emailAddress());
    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        atp.createAccountButton.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        atp.gender.click();
        action.
                click(atp.firstName)
                .sendKeys(faker.name().firstName()+ Keys.TAB)
                .sendKeys(faker.name().lastName() +Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password() + Keys.TAB)
                .sendKeys("28" +Keys.TAB)
                .sendKeys("April" +Keys.TAB)
                .sendKeys("1993" +Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().cityName())
                .sendKeys(Keys.TAB)
                .sendKeys("Alaska" + Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys("United States" + Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB)
                .sendKeys("ALSK")
                .perform();


    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        atp.registerButton.click();
    }
    @Then("hesap olustugunu dogrular")
    public void hesap_olustugunu_dogrular() {
        Assert.assertTrue(atp.positiveResultText.isDisplayed());
    }
}
