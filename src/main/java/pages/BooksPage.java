package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class BooksPage extends ParentPage{

    @FindBy(xpath = ".//button[@id='login']")
    private WebElement loginButton;

    @FindBy(xpath = ".//input[@id='userName']")
    private WebElement userNameField;

    @FindBy(xpath = ".//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = ".//label[@id='userName-value']")
    private WebElement shownUserName;

    @FindBy(xpath = ".//span[text()='Profile']")
    private WebElement menuProfile;

    @FindBy(id = "see-book-Git Pocket Guide")
    private WebElement bookName;

    @FindBy(xpath = ".//button[text()='Add To Your Collection']")
    private WebElement addToYourCollectionButton;


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



    public void clickOnProfileInMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", menuProfile);
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        clickOnElement(menuProfile);
    }

    public void clickOnBookName() {
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        clickOnElement(bookName);
    }

    public void clickOnAddToYourCollectionButton() {
        clickOnElement(addToYourCollectionButton);
    }

    public void checkAndConfirmAlert() {
        String alertMessage = getTextFromAlert();
        checkEqualityOfText(alertMessage, "Book added to your collection.");
        confirmingAlert();
    }
}

