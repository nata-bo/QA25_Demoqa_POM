package org.ait.demoqa.tests.alertsFramesWindows;

import org.ait.demoqa.pages.alertsFramesWindows.AlertsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFramesWindows();
        new SidePanel(driver).selectAlerts();
    }
    @Test
    public void acceptAlertTest(){
        new AlertsPage(driver).clickOnAlertButton()
                .acceptAlert()
                .verifyAlertText("You clicked a button");


    }
    @Test
    public void acceptTimerAlertTest(){
        new AlertsPage(driver).clickOnTimerAlertButton()
                .acceptAlert()
                .verifyAlertText("This alert appeared after 5 seconds");

    }

    @Test
    public void confirmAlertTest(){

        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("ok")
                .verifyConfirmResult("You selected Ok");
    }

    @Test
    public void sendMessageToAlertTest(){

        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("Natali")
                .acceptAlert2()
                .verifyPromptResult("You entered Natali");
    }

}
