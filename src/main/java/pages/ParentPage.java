package pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

    protected void checkEqualityOfText(String text, WebElement element){
        if(element.getText().equalsIgnoreCase(text)){
             logger.info("Text is correct in " + getElementName(element));
        }
        else {
            logger.error("Text isn't correct in " + getElementName(element));
            Assert.fail();
        }
    }

    protected void checkEqualityOfText(String text, String text2){
        if(text2.equalsIgnoreCase(text)){
            logger.info("Text is correct in alert");
        }
        else {
            logger.error("Text isn't correct in alert");
            Assert.fail("Text isn't correct in alert");
        }
    }

    protected boolean checkButtonIsShown(String element){
        try {
            return driver.findElement(By.xpath(element)).isDisplayed();
        }catch (Exception e){
            printErrorAndStop(e);
            return false;
        }
    }

    protected boolean checkСheckBoxIsSet(WebElement element){
        if(element.isEnabled()){
            return true;
        }else {
            return false;
        }
    }

    protected boolean checkCheckBoxNotSet(WebElement element){
        if (!element.isSelected()){
            return true;
        }else {
            return false;
        }
    }

    protected void confirmingAlert(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().accept();
        }catch (Exception e){
            printErrorAndStop(e);
        }
    }

    protected String getTextFromAlert(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            return driver.switchTo().alert().getText();
        }catch (Exception e){
            printErrorAndStop(e);
            return "No alert";
        }
    }

    protected boolean checkVisibilityOfElement(WebElement element){
        if(element.isDisplayed()){
            logger.info("Element is present " + element.getTagName());
            return true;
        }else {
            logger.error("Element isn't present");
            Assert.fail("Element isn't present");
            return false;
        }
    }
}
