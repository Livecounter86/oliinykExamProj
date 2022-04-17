package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends ParentPage{

    @FindBy(xpath = ".//button[@id='login']")
    private WebElement loginButton;

    @FindBy(xpath = ".//input[@id='userName']")
    private WebElement userNameField;

    @FindBy(xpath = ".//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//label[@id='userName-value']")
    private WebElement shownUserName;

    public BooksPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void enterLogin(String login) {
        enterTextIntoField(userNameField, login);

    }

    public void enterPassword(String pass) {
        enterTextIntoField(passwordField, pass);
    }

    public void checkUserWasLogin(String login) {
        checkEqualityOfText(login, shownUserName);
        checkButtonIsShown(".//button[@id='submit']");
        }
    }

