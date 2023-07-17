package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources",
        glue = "stepdefinitions",
        tags = "@US1008",
        dryRun = false
)

public class Runner {
    /*
    * Runner class boş bir classs dır
    * Runner class ı bize sağladığı işlev, sahip olduğu 2 notasyon sayesindedir

    dryRun = true yaptigimizda
    var olan adimlari CALISTIRMADAN
    sadece eksik adimlari bulur ve onlarla ilgili stepdefinition'lari bize verir

    EGER eksik adim yoksa,
    bu durumu raporlamak icin Test PASSED isaretlenir

     */



}
