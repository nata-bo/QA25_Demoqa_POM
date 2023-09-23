package org.ait.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".top-card:nth-child(6)")
    WebElement bookStore;

    public SidePanel getBookStore() {
        click(bookStore);
        return new SidePanel(driver);
    }


    @FindBy(css = ".top-card:nth-child(3)")
    WebElement alertUndWindow;
    public SidePanel getAlertUndWindow() {
        click(alertUndWindow);
        return new SidePanel(driver);
    }
}
