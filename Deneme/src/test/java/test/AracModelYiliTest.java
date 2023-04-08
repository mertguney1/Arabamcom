package test;

import driver.BaseTest;
import org.junit.Test;
import pages.AracModelYiliPage;
import pages.HasarliAraclarPage;
import pages.HasarliKategorisiUcuzdanPahaliiPage;
import pages.SearchBox;

public class AracModelYiliTest extends BaseTest {

    @Test
    public void AracModelYili(){
        CookieCloseTest cookieCloseTest = new CookieCloseTest();
        cookieCloseTest.cookieCloseTest();
        SearchBox searchBox = new SearchBox();
        searchBox.searchboxwrite();
        HasarliAraclarPage hasarliAraclarPage = new HasarliAraclarPage();
        hasarliAraclarPage.hasarliAraclarCategory();
        HasarliKategorisiUcuzdanPahaliiPage hasarliKategorisiUcuzdanPahaliiPage = new HasarliKategorisiUcuzdanPahaliiPage();
        hasarliKategorisiUcuzdanPahaliiPage.siralama();
        AracModelYiliPage aracModelYiliPage = new AracModelYiliPage();
        aracModelYiliPage.modelYili();
    }
}
