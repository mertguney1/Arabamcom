package test;

import driver.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.CookieClosePage;
import pages.SearchBox;

public class SearchBoxTest extends BaseTest {


    @Test
    public void searchBoxTest(){
        SearchBox searchBox = new SearchBox();
        searchBox.searchboxwrite();
    }


}
