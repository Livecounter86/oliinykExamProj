package bookStoreTests;

import baseTestActions.BaseTestActions;
import org.junit.Test;

public class WorkWithBookstoreTests extends BaseTestActions {

    @Test
    public void loginToBookstore(){
        mainPage.openMainPage();
        mainPage.clickOnBookStoreCard();
        booksPage.clickOnLoginButton();
        booksPage.enterLogin("TestOfBook");
        booksPage.enterPassword("123456Qwerty!");
        booksPage.clickOnLoginButton();
        booksPage.checkUserWasLogin("TestOfBook");
    }

    @Test
    public void addingBookToProfile(){
        loginToBookstore();
        booksPage.clickOnProfileInMenu();
        profilePage.clickOnDeleteAllBooksButton();
        profilePage.confirmBooksDeleting();
        profilePage.confirmAlertAboutDeletedBooks();
        profilePage.clickOnBooksStoreMenu();
        booksPage.clickOnBookName();
        booksPage.clickOnAddToYourCollectionButton();
        booksPage.checkAndConfirmAlert();
        booksPage.clickOnProfileInMenu();
        profilePage.checkBookWasAdded();
    }
}
