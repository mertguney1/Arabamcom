package test;

import driver.BaseTest;
import methods.Methods;
import org.junit.Test;
import pages.*;

public class IlanFavoriAddTest extends BaseTest {

    @Test
    public void IlanFavoriAdd(){
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
        IlanFavoriAddPage ilanFavoriAddPage = new IlanFavoriAddPage();
        ilanFavoriAddPage.IlanFavoriAdd();
    }
}
