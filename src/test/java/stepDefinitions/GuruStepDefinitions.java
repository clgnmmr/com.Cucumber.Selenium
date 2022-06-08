package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage=new GuruPage();

    @And("{string}  sutunundaki tum degerleri yazdirir")
    public void sutunundakiTumDegerleriYazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi=guruPage.baslikListesi;
        //listemiz webelementlerden olusuyor
        //dolasiyle bu webelmeentlerden hangisi
        //istenen sutun baslıgını tasıyor bilemeyiz
        int istenenBaslikIndexi=-3;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi .get(i).getText().equals(istenenSutun)) {
                istenenBaslikIndexi=i+1;
                break;

            }
        }
        //for loop ile tum sutun baslıklarını bana verilen sutun değeri ile karşlaştırdım.
        //loop bittiğinde başlığın bulun bulunmaığını kontrol etmek ve bulundu ise youluma devam etmek istiyorum

        if (istenenBaslikIndexi!=-3){// baslık bulundu

            List<WebElement> istenenSutundakiElementler= Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikIndexi+"]"));
            for (WebElement each:istenenSutundakiElementler
                 ) {
                System.out.println(each.getText());
            }

        }else {//baslık bulunamadı
            System.out.println("İstenen baslik bulunamadi");
    }
}
}
