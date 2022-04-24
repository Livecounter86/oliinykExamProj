package workWithElements;

import baseTestActions.BaseTestActions;
import org.junit.Test;

public class CheckBoxSelecting extends BaseTestActions {

    @Test
    public void checkBoxSelected(){
        mainPage.openMainPage();
        mainPage.clickOnElementCard();
        elementsPage.clickOnCheckBox();
        checkBoxPage.clickOnDropdownHome();
        checkBoxPage.clickOnCheckBoxDesktopDeck();
        checkBoxPage.clickOnDropdownDesktopDeck();
        checkBoxPage.clickOnCheckBoxNoteFile();
        checkBoxPage.clickOnDropdownDownloads();
        checkBoxPage.clickOnCheckboxWordFile();
        checkBoxPage.checkOfShowingSelectedFiles();
    }
}
