package test;

import driver.BaseTest;
import org.junit.Test;
import pages.*;

public class LoginPageTest extends BaseTest {

    @Test
    public void LoginTest(){
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
        LoginPage loginPage = new LoginPage();
        loginPage.LoginPage();
    }
}
