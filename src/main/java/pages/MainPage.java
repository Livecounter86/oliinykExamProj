package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class MainPage extends ParentPage{
    @FindBy(xpath = ".//h5[text()='Elements']")
    private WebElement elementsCard;

    @FindBy(xpath = ".//h5[text()='Book Store Application']")
    private WebElement bookStoreApplicationCard;

    @FindBy(xpath = ".//h5[text()='Alerts, Frame & Windows']")
    private WebElement alertCard;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        try {
            driver.get("https://demoqa.com/");
            logger.info("Page is open");
        }catch (Exception e){
            logger.error("Main page wasn't opened " + e);
            Assert.fail("Main page wasn't opened " + e);
        }
    }

    public void clickOnElementCard(){
        clickOnElement(elementsCard);
    }

    public void clickOnBookStoreCard() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", bookStoreApplicationCard);

        clickOnElement(bookStoreApplicationCard);
    }

    public void clickOnAlertCard() {
        try {
            clickOnElement(alertCard);
        }catch (Exception e){
            logger.error("Couldn't click on element " + e);
            Assert.fail("Couldn't click on element " + e);
        }
    }
}
