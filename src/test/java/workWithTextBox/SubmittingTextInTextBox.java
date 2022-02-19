package workWithTextBox;

import baseTestActions.BaseTestActions;
import org.junit.Test;

public class SubmittingTextInTextBox extends BaseTestActions {
    @Test
    public void allDataInTextBoxFieldsEntered(){
        mainPage.openMainPage();
        mainPage.clickOnElementCard();
        elementsPage.clickOnTextBox();
        textBoxPage.enterUsername("Tester Test Testing");
        textBoxPage.enterEmail("test@test.com");
        textBoxPage.enterAddress("Test address 15, 24");
        textBoxPage.enterPermanentAddress("Test address2 27, 15");
        textBoxPage.clickOnSubmitButton();

    }

}
