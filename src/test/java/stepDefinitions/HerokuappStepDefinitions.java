package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.matcher.EqualityMatcher;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HerokuappPage;
import utilities.Driver;

import java.time.Duration;
import java.util.function.Function;

public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();

    @Given("Add Element butonuna basar")
    public void add_element_butonuna_basar() {
       herokuappPage.addElementButtonu.click();


    }
    @Then("Delete butonu gorunur oluncaya kadar bekleyin")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(herokuappPage.deleteElementButonu));
    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(herokuappPage.deleteElementButonu.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
        herokuappPage.deleteElementButonu.click();



    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {

        Assert.assertTrue(herokuappPage.deleteListesi.isEmpty());
    }

}
