package org.ait.demoqa.tests.alertsFramesWindows;

import org.ait.demoqa.pages.alertsFramesWindows.BrowserWindowsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFramesWindows();
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
