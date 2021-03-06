package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends ParentPage{

    @FindBy(xpath = ".//span[text()='Text Box']")
    private WebElement textBoxLocator;

    @FindBy(xpath = ".//span[text()='Check Box']")
    private WebElement checkBoxLocator;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }


    public void clickOnTextBox() {
        clickOnElement(textBoxLocator);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBoxLocator);
    }
}
