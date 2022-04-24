package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends ParentPage{

    @FindBy(xpath = ".//button[@title='Toggle']")
    private WebElement homeDeckDropdown;

    @FindBy(xpath = ".//label[@for='tree-node-desktop']")
    private WebElement checkBoxDesktopDeck;

    @FindBy(xpath = ".//label[@for='tree-node-notes']")
    private WebElement checkBoxNotesFile;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[1]/span/button")
    private WebElement desktopDeckDropdown;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[3]/span/button")
    private WebElement downloadsDeckDropdown;

    @FindBy(xpath = ".//label[@for='tree-node-wordFile']")
    private WebElement checkBoxWordFile;

    @FindBy(xpath = ".//span[text()='commands']")
    private WebElement textCommands;

    @FindBy(xpath = ".//span[text()='wordFile']")
    private WebElement textWordFile;

    public CheckBoxPage(WebDriver driver) { super(driver); }

    public void clickOnDropdownHome() {
        clickOnElement(homeDeckDropdown);
    }

    public void clickOnCheckBoxDesktopDeck() {
        clickOnElement(checkBoxDesktopDeck);
    }

    public void clickOnCheckBoxNoteFile() {
        if(checkСheckBoxIsSet(checkBoxNotesFile)){
            clickOnElement(checkBoxNotesFile);
        }
        else {
            Assert.fail("Check Box isn't set");
        }
    }

    public void clickOnDropdownDownloads() {
        clickOnElement(downloadsDeckDropdown);
    }

    public void clickOnDropdownDesktopDeck() {
        clickOnElement(desktopDeckDropdown);
    }

    public void clickOnCheckboxWordFile() {
        if(checkCheckBoxNotSet(checkBoxWordFile)){
            clickOnElement(checkBoxWordFile);
        }else {
            Assert.fail("Check Box is select");
        }
    }

    public void checkOfShowingSelectedFiles() {
        checkEqualityOfText("commands", textCommands);
        checkEqualityOfText("wordfile", textWordFile);
    }
}
