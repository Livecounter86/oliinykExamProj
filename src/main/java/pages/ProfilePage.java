package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends ParentPage{
    @FindBy(id = "closeSmallModal-ok")
    private WebElement okBookDeleteButton;

    @FindBy(xpath = ".//div[@class='text-right button di']/button[text()='Delete All Books']")
    private WebElement deleteAllBooksButton;

    @FindBy(xpath = ".//span[text()='Book Store']")
    private WebElement booksStoreMenu;

    @FindBy(id = "see-book-Git Pocket Guide")
    private WebElement bookName;

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDeleteAllBooksButton() {
        clickOnElement(deleteAllBooksButton);
    }

    public void confirmBooksDeleting() {
        clickOnElement(okBookDeleteButton);
    }

    public void confirmAlertAboutDeletedBooks() {
        confirmingAlert();
    }

    public void clickOnBooksStoreMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", booksStoreMenu);
        clickOnElement(booksStoreMenu);
    }

    public void checkBookWasAdded() {
        checkVisibilityOfElement(bookName);
    }
}
