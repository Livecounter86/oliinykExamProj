package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ParentPage{

    @FindBy(xpath = ".//button[@id='newUser']")
    private WebElement newUserButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnNewUserButton() {
        clickOnElement(newUserButton);
    }
}
