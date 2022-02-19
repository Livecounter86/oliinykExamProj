package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.TextInput;

public class MainPage extends ParentPage{
    @FindBy(xpath = ".//h5[text()='Elements']")
    private WebElement elementsCard;


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
}
