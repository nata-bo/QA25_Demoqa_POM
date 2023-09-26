package org.ait.demoqa.tests.bookStore;

import org.ait.demoqa.data.UserData;
import org.ait.demoqa.pages.bookStore.BookStorePage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase {

    @BeforeMethod
    public  void  precondition(){
        new HomePage(driver).getBookStore();
    }

   @Test
    public void searchBookTest(){
        new BookStorePage(driver)
                .enterBookName(UserData.BOOK_NAME)
                .verifyBookName("Git");
   }
}
