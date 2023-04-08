package test;

import driver.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.HasarliAraclarPage;
import pages.HasarliKategorisiUcuzdanPahaliiPage;
import pages.SearchBox;

public class HasarliKategorisiUcuzdanPahaliyaTest extends BaseTest {

    @Test
    public void hasarliKategorisiUcuzdanPahaliyaTest(){
        CookieCloseTest cookieCloseTest = new CookieCloseTest();
        cookieCloseTest.cookieCloseTest();
        SearchBox searchBox = new SearchBox();
        searchBox.searchboxwrite();
        HasarliAraclarPage hasarliAraclarPage = new HasarliAraclarPage();
        hasarliAraclarPage.hasarliAraclarCategory();
        HasarliKategorisiUcuzdanPahaliiPage hasarliKategorisiUcuzdanPahaliiPage = new HasarliKategorisiUcuzdanPahaliiPage();
        hasarliKategorisiUcuzdanPahaliiPage.siralama();
    }

}
