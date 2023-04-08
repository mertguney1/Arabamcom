package test;

import driver.BaseTest;
import org.junit.Test;
import pages.CookieClosePage;
import pages.SearchBox;

public class CookieCloseTest extends BaseTest {

    @Test
    public void cookieCloseTest(){
        CookieClosePage cookieClosePage= new CookieClosePage();
        cookieClosePage.cookieclose();

    }


}
