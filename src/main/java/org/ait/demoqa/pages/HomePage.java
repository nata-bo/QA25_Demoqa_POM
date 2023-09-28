package org.ait.demoqa.pages;

import org.ait.demoqa.pages.widgets.WidgetsPage;
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
    public SidePanel getAlertsFramesWindows() {
        click(alertUndWindow);
        return new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        click(elements);
        return new SidePanel(driver);
    }

    @FindBy(css = ".top-card:nth-child(4)")
    WebElement widgets;
    public SidePanel getWidgets() {
        click(widgets);
        return new SidePanel(driver);
    }
}
