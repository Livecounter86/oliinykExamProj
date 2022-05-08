package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends ParentPage{

    @FindBy(xpath = ".//span[text()='Alerts']")
    private WebElement alertInMenu;

    @FindBy(id = "alertButton")
    private WebElement simpleAlertButton;

    @FindBy(id = "timerAlertButton")
    private WebElement simpleFiveSecAlertButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmAlertButton;

    @FindBy(id = "promtButton")
    private WebElement promptAlertButton;

    @FindBy(id = "confirmResult")
    private WebElement confirmResult;

    @FindBy(id = "promptResult")
    private WebElement promptResult;


    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSideAlert() {
            clickOnElement(alertInMenu);
    }

    public void clickOnSimpleAlertButton() {
        clickOnElement(simpleAlertButton);
    }

    public void acceptSimpleAlert() {
        confirmingAlert();
    }

    public void clickOnFiveSecondsDelayAlert() {
        clickOnElement(simpleFiveSecAlertButton);
    }

    public void acceptSimpleFiveSecAlert() {
        confirmingAlert();
    }

    public void clickOnConfirmBox() {
        clickOnElement(confirmAlertButton);
    }

    public void checkResultOfConfirming() {
       checkEqualityOfText("You selected Ok", confirmResult);
    }

    public void clickOnPromptAlertButton() {
        clickOnElement(promptAlertButton);
    }

    public void enterTextAndConfirmAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
        confirmingAlert();
    }

    public void checkEnteredTextIsCorrect(String text) {
        checkEqualityOfText(text, promptResult);
    }
}
