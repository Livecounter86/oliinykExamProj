package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends ParentPage{

    @FindBy(xpath = ".//button[@title='Toggle']")
    private WebElement homeDeckDropdown;

    @FindBy(xpath = ".//label[@for='tree-node-desktop']//span[@class='rct-checkbox']")
    private WebElement checkBoxDesktopDeck;

    @FindBy(xpath = ".//label[@for='tree-node-notes']//span[@class='rct-checkbox']")
    private WebElement checkBoxNotesFile;

    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button")
    private WebElement desktopDeckDropdown;

    @FindBy(xpath = "//*[@id='tree-node']/ol/li/ol/li[3]/span/button")
    private WebElement downloadsDeckDropdown;

    @FindBy(xpath = ".//label[@for='tree-node-wordFile']/span[@class='rct-checkbox']")
    private WebElement checkBoxWordFile;

    public CheckBoxPage(WebDriver driver) { super(driver); }

    public void clickOnDropdownHome() {
        clickOnElement(homeDeckDropdown);
    }

    public void clickOnCheckBoxDesktopDeck() {
        clickOnElement(checkBoxDesktopDeck);
    }

    public void clickOnCheckBoxNoteFile() {
        clickOnElement(checkBoxNotesFile);
    }

    public void clickOnDropdownDownloads() {
        clickOnElement(downloadsDeckDropdown);
    }

    public void clickOnDropdownDesktopDeck() {
        clickOnElement(desktopDeckDropdown);
    }

    public void clickOnCheckboxWordFile() {
        clickOnElement(checkBoxWordFile);
    }
}
