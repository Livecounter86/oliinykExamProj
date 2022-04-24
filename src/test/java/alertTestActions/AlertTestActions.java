package alertTestActions;

import baseTestActions.BaseTestActions;
import org.junit.Test;

public class AlertTestActions extends BaseTestActions {

    @Test
    public void TestWithAlerts(){
        mainPage.openMainPage();
        mainPage.clickOnAlertCard();
        alertPage.clickOnSideAlert();
        alertPage.clickOnSimpleAlertButton();
        alertPage.acceptSimpleAlert();
        // alertPage.clickOnFiveSecondsDelayAlert();
        //alertPage.acceptSimpleFiveSecAlert();
        alertPage.clickOnConfirmBox();
        alertPage.acceptSimpleAlert();
        alertPage.checkResultOfConfirming();
        alertPage.clickOnPromptAlertButton();
        alertPage.enterTextAndConfirmAlert("test");
        alertPage.checkEnteredTextIsCorrect("You entered test");
    }
}
