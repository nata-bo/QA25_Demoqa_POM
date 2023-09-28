package org.ait.demoqa.pages.alertsFramesWindows;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(tagName = "iframe")
    List<WebElement> iframes;

    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy(tagName = "body")
    WebElement body;

    public NestedFramesPage handleNestedIframes() {

        System.out.println("The total numbers of iframes in the main page: "+ iframes.size());
        driver.switchTo().frame(frame1);
        System.out.println("The total numbers of iframes in the parent iframe: " +iframes.size());
        System.out.println("Iframe is " + body.getText());
        driver.switchTo().frame(0);
        System.out.println("Iframe is " + body.getText());
        driver.switchTo().parentFrame();

        return this;
    }
}
