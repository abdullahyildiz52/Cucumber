package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExcercisePage {
   public AutomationExcercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a/i")
    public WebElement signUpButonu;

   @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement singUpNameElementi;
}
