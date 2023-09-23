package org.ait.demoqa.pages;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage{

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="alertButton")
    WebElement alertButton;

    public AlertsPage clickOnAlertButton() {
    click(alertButton);
        return this;
    }


    public AlertsPage acceptAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.alertIsPresent());
        }catch (NoAlertPresentException ex){
        }
        return this;
    }
    public AlertsPage acceptAlert2() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        }catch (NoAlertPresentException ex){
        }
        return this;
    }

    @FindBy(id="timerAlertButton")
    WebElement timerAlertButton;
    public AlertsPage clickOnTimerAlertButton() {
     click(timerAlertButton);
     return this;
    }

    @FindBy(id="confirmButton")
    WebElement confirmButton;
    public AlertsPage clickOnConfirmButton() {
        click(confirmButton);
        return this;
    }

    public AlertsPage selectConfirm(String confirm) {
        if(confirm != null && confirm.equalsIgnoreCase("ok")){
            driver.switchTo().alert().accept();;
        } else if (confirm != null && confirm.equalsIgnoreCase("cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }
    public AlertsPage verifyAlertText(String text) {
         Assert.assertTrue((shouldHaveTextInAlert(text,5)));
        return this;
    }

    @FindBy(id = "confirmResult")
    WebElement confirmResult;

    public AlertsPage verifyConfirmResult(String message) {
        Assert.assertTrue((shouldHaveText(confirmResult,message,5)));
        return this;
    }

    @FindBy(id = "promptResult")
    WebElement promptResult;

    public AlertsPage verifyPromptResult(String message) {
        Assert.assertTrue((shouldHaveText(promptResult,message,5)));
        return this;
    }
    @FindBy(id = "promtButton")
    WebElement promptButton;
    public AlertsPage clickOnPromptButton() {
        click(promptButton);
        return this;
    }

    public AlertsPage enterMessageToAlert(String message) {
        if(message != null){
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }
}
