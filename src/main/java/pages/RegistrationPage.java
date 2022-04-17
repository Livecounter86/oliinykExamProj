package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends ParentPage{

    @FindBy(id = "firstname")
    private WebElement firstNameInputField;

    @FindBy(id = "lastname")
    private WebElement lastNameInputField;

    @FindBy(id = "userName")
    private WebElement userNameInputField;

    @FindBy(id = "password")
    private WebElement passwordInputField;

    @FindBy(xpath = ".//div[@class='recaptcha-checkbox-border']")
    private WebElement captchaCheckBox; //hope will work)))

    @FindBy(id = "register")
    private WebElement registrationButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public void enterRegistrationData(String firstName, String lastName, String userName, String password) {
        enterTextIntoField(firstNameInputField, firstName);
        enterTextIntoField(lastNameInputField, lastName);
        enterTextIntoField(userNameInputField, userName);
        enterTextIntoField(passwordInputField, password);
    }

    public void clickOnCaptchaCheckBox() {
        clickOnElement(captchaCheckBox);
    }

    public void clickOnRegistrationButton() {
        clickOnElement(registrationButton);
    }
}
