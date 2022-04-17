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

    @FindBy(xpath = ".//p[@id='name']")
    private WebElement resultName;

    @FindBy(xpath = ".//p[@id='email']")
    private WebElement resultEmail;

    @FindBy(xpath = ".//p[@id='currentAddress']")
    private WebElement resultCurrentAddress;

    @FindBy(xpath = ".//p[@id='permanentAddress']")
    private WebElement resultPermanentAddress;

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

    public void checkWrightTextInput(String text1, String text2, String text3, String text4) {
        checkEqualityOfText(text1, resultName);
        checkEqualityOfText(text2, resultEmail);
        checkEqualityOfText(text3, resultCurrentAddress);
        checkEqualityOfText(text4, resultPermanentAddress);
    }
}
