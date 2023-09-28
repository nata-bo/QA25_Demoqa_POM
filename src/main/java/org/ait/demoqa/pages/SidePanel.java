package org.ait.demoqa.pages;

import org.ait.demoqa.pages.alertsFramesWindows.AlertsPage;
import org.ait.demoqa.pages.alertsFramesWindows.BrowserWindowsPage;
import org.ait.demoqa.pages.alertsFramesWindows.FramesPage;
import org.ait.demoqa.pages.alertsFramesWindows.NestedFramesPage;
import org.ait.demoqa.pages.bookStore.LoginPage;
import org.ait.demoqa.pages.bookStore.ProfilePage;
import org.ait.demoqa.pages.elements.BrokenLinksImagesPage;
import org.ait.demoqa.pages.elements.ButtonsPage;
import org.ait.demoqa.pages.elements.LinksPage;
import org.ait.demoqa.pages.widgets.AutoCompletePage;
import org.ait.demoqa.pages.widgets.MenuPage;
import org.ait.demoqa.pages.widgets.SliderPage;
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

    @FindBy(xpath = "//span[.='Profile']")
    WebElement profile;

    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile,0,600);
       return new ProfilePage(driver);
    }

    @FindBy(xpath = "//span[.='Links']")
    WebElement links;

    public LinksPage selectLinks() {
        clickWithJSExecutor(links,0,300);
        return new LinksPage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
     clickWithJSExecutor(brokenLinksImages,0,300);
      return new BrokenLinksImagesPage(driver);
    }

    @FindBy(css = ".show #item-2")
    WebElement frames;
    public FramesPage selectFrames() {
      clickWithJSExecutor(frames,0,300);
         return new FramesPage(driver);
    }
    @FindBy(css = ".show #item-3")
    WebElement nestedFrames;
    public NestedFramesPage selectNestedFrames() {
        clickWithJSExecutor(nestedFrames, 0,300);
        return new NestedFramesPage(driver);
    }

    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;

    public ButtonsPage selectButtons() {
        clickWithJSExecutor(buttons,0,300);
        return new ButtonsPage(driver);
    }
    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;
    public SliderPage selectSlider() {
        clickWithJSExecutor(slider,0,500);
        return  new SliderPage(driver);
    }

    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage selectMenu() {
        clickWithJSExecutor(menu,0,600);
        return new MenuPage(driver);
    }


    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement autoComplete;
      public AutoCompletePage selectAutoComplete() {
       clickWithJSExecutor(autoComplete,0,400);
        return new AutoCompletePage(driver);
    }
}

