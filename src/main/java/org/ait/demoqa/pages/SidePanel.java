package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{

    public SidePanel(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".show #item-0")
    WebElement login;

    public LoginPage selectLogin() {
        click(login);
        return new LoginPage(driver);
    }
     @FindBy(css = ".show #item-1")
     WebElement alerts;
    public AlertsPage selectAlerts() {
       clickWithJSExecutor(alerts,0,600);
        return new AlertsPage(driver);
    }

    @FindBy(css = ".show #item-0")
    WebElement browser;
    public BrowserWindowsPage selectBrowserWindows() {
        clickWithJSExecutor(browser,0,600);
        return new BrowserWindowsPage(driver);
    }
}
