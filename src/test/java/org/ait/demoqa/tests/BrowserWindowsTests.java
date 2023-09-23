package org.ait.demoqa.tests;

import org.ait.demoqa.pages.BrowserWindowsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertUndWindow();
        new SidePanel(driver).selectBrowserWindows();
    }

    @Test
    public void switchToNewTabTest(){

        new BrowserWindowsPage(driver)
                .switchToNewTab(1)
                .verifyNewTitle("This is a sample page");
    }
    @Test
    public void switchToNewWindowTest(){

        new BrowserWindowsPage(driver)
                .switchToWindowTab(1)
                .verifyNewTitle("This is a sample page");
    }
}
