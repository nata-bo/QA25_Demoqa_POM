package org.ait.demoqa.pages.elements;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "currentAddress")
    WebElement currentAddress;
    public TextBoxPage keyBoardEvent(String text) {
        typeWithJSExecutor(currentAddress,text,0,100);

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        actions.sendKeys(Keys.TAB).perform();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        return this;
    }

    @FindBy(id = "submit")
    WebElement submit;

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement actualText;
    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement expectedText;

    public TextBoxPage assertCopyPastText(String text) {
        clickWithJSExecutor(submit,0,500);

        Assert.assertEquals((shouldHaveText(actualText,text,5)),
                (shouldHaveText(expectedText,text,5)));

      //  Assert.assertTrue(shouldHaveText(actualText,text,5));
      //  Assert.assertTrue(shouldHaveText(expectedText,text,5));
        return this;
    }

}
