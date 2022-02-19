package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

abstract public class ParentPage {
    Logger logger = Logger.getLogger(getClass());
    WebDriver driver;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void clickOnElement(WebElement element){
        try {
            element.click();
            logger.info(" Element was clicked");
        }catch (Exception e){
            printErrorAndStop(e);
        }

    }

    private String getElementName(WebElement element) {
        String elementName = "";
        if(element instanceof TypifiedElement){
            elementName = " '" + ((TypifiedElement) element).getName() + "' ";
        }
        return elementName;
    }

    protected void enterTextIntoField(WebElement element, String text){
        try{
            element.clear();
            element.sendKeys(text);
            logger.info(text + " was entered " + getElementName(element));
        }catch (Exception e){
            printErrorAndStop(e);
        }

    }

    void printErrorAndStop(Exception e){
        logger.error("Can't work with element" + e);
        Assert.fail("Can't work with element" + e);
    }
}
