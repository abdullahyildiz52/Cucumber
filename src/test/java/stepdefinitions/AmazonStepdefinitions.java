package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon anasayfaya gider")
    public void kullanici_amazon_anasayfaya_gider() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("arama kutusuna Nutella Yazip ENTER tusuna basar")
    public void arama_kutusuna_nutella_yazip_enter_tusuna_basar() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

    }

    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        // Write code here that turns the phrase above into concrete actions
        String expectedIcerik = "Nutella";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        // Write code here that turns the phrase above into concrete actions

        Driver.closeDriver();

    }

    @Then("arama kutusuna Samsung Yazip ENTER tusuna basar")
    public void aramaKutusunaSamsungYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Samsung" + Keys.ENTER);

    }

    @And("arama sonuclarinin Samsung icerdigini test eder")
    public void aramaSonuclarininSamsungIcerdiginiTestEder() {
        String expectedIcerik = "Samsung";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }


    @Then("arama kutusuna Java Yazip ENTER tusuna basar")
    public void aramaKutusunaJavaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }

    @And("arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclariniJavaIcerdiginiTestEder() {
        String expectedIcerik = "Java";
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedIcerik));
    }

    @Then("arama kutusuna Nutella yazip, ENTER tusuna basar")
    public void aramaKutusunaNutellaYazipENTERTusunaBasar() {
        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("arama kutusuna {string} yazip, ENTER tusuna basar")
    public void aramaKutusunaYazipENTERTusunaBasar(String arananIcerik) {
        amazonPage.aramaKutusu.sendKeys(arananIcerik+Keys.ENTER);
    }

    @And("arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String aranacakIcerik) {
        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(aranacakIcerik));
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklemeSuresi) throws InterruptedException {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullaniciAnasayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }
    @When("ilk urunu tiklar")
    public void ilk_urunu_tiklar() {
        // Write code here that turns the phrase above into concrete actions
        amazonPage.ilkUrunElementi.click();

    }
    @Then("urun isminde {string} oldugunu test eder")
    public void urun_isminde_oldugunu_test_eder(String istenenIcerik) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(amazonPage.ilkUrunIsimElementi.getText().contains(istenenIcerik));

    }

}