package baseTestActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import java.util.concurrent.TimeUnit;

public class BaseTestActions {
    WebDriver driver;
    Logger logger = Logger.getLogger(getClass());
    protected MainPage mainPage;
    protected ElementsPage elementsPage;
    protected TextBoxPage textBoxPage;
    protected BooksPage booksPage;
    protected LoginPage loginPage;
    protected RegistrationPage registrationPage;
    protected CheckBoxPage checkBoxPage;
    protected AlertPage alertPage;
    protected ProfilePage profilePage;

    @Before
    public void startTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("-//-//- " + testName.getMethodName() + " test is started -//-//-");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        logger.info("Browser was open");
        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        booksPage = new BooksPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        alertPage = new AlertPage(driver);
        profilePage = new ProfilePage(driver);
    }

    @After
    public void endTest(){
//        driver.quit();
//        logger.info("Browser was closed");
        logger.info("-//-//- " + testName.getMethodName() + " test is ended -//-//-");
    }

    @Rule
    public TestName testName = new TestName();

}
