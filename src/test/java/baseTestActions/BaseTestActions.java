package baseTestActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ElementsPage;
import pages.MainPage;
import pages.TextBoxPage;

import java.util.concurrent.TimeUnit;

public class BaseTestActions {
    WebDriver driver;
    Logger logger = Logger.getLogger(getClass());
    protected MainPage mainPage;
    protected ElementsPage elementsPage;
    protected TextBoxPage textBoxPage;

    @Before
    public void startTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("-//-//- " + testName.getMethodName() + " test is started -//-//-");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("Browser was open");
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @After
    public void endTest(){
//        driver.quit();
//        logger.info("Browser was closed");
//        logger.info("-//-//- " + testName.getMethodName() + " test is ended -//-//-");
    }

    @Rule
    public TestName testName = new TestName();

}
