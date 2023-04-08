package test;

import driver.BaseTest;
import org.junit.Test;
import pages.HasarliAraclarPage;
import pages.SearchBox;

public class HasarliAraclarTest extends BaseTest {

    @Test
    public void hasarliAraclarTest(){
        CookieCloseTest cookieCloseTest = new CookieCloseTest();
        cookieCloseTest.cookieCloseTest();
        SearchBox searchBox = new SearchBox();
        searchBox.searchboxwrite();
        HasarliAraclarPage hasarliAraclarPage = new HasarliAraclarPage();
        hasarliAraclarPage.hasarliAraclarCategory();
    }
}
