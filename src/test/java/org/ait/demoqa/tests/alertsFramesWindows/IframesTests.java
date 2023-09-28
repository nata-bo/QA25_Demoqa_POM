package org.ait.demoqa.tests.alertsFramesWindows;

import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.pages.alertsFramesWindows.FramesPage;
import org.ait.demoqa.pages.alertsFramesWindows.NestedFramesPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFramesWindows();
    }

    @Test
    public void iframesTest(){
        new SidePanel(driver).selectFrames();
        new FramesPage(driver).returnListOfFrames()
                .switchToIframeByIndex(2);
      // Тест не очень надёжен потому что количество рекламы может меняться
    }

    @Test
    public void switchToIframeByIDTest(){
        new SidePanel(driver).selectFrames();
        new FramesPage(driver).switchToIframeByID();
    }

    @Test
    public void handleNestedIframeTest(){
        new SidePanel(driver).selectNestedFrames();
        new NestedFramesPage(driver).handleNestedIframes();
    }
}
