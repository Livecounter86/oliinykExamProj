package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends ParentPage{

    @FindBy(xpath = ".//input[@id='userName']")
    private WebElement userName;

    @FindBy(xpath = ".//input[@id='userEmail']")
    private WebElement emailField;

    @FindBy(xpath = ".//textarea[@id='currentAddress']")
    private WebElement addressField;

    @FindBy(xpath = ".//*[@id='permanentAddress']")
    private WebElement permanentAddressField;

    @FindBy(id = "submit")
    private WebElement submitButton;

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String text){
        enterTextIntoField(userName, text);
    }

    public void enterEmail(String text){
        enterTextIntoField(emailField, text);
    }

    public void enterAddress(String text) {
        enterTextIntoField(addressField, text);
    }

    public void enterPermanentAddress(String text) {
        enterTextIntoField(permanentAddressField, text);
    }

    public void clickOnSubmitButton() {
        clickOnElement(submitButton);
    }
}
