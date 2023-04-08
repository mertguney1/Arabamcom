package test;

import driver.BaseTest;
import org.junit.Test;
import pages.*;

public class IlanDetayTest extends BaseTest {

    @Test
    public void IlanDetayTest(){
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
        IlanDetayPage ilanDetayPage = new IlanDetayPage();
        ilanDetayPage.IlanDetay();
    }

}
