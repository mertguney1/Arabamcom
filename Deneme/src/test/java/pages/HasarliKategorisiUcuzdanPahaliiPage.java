package pages;

import methods.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HasarliKategorisiUcuzdanPahaliiPage {
    Methods methods;

    public HasarliKategorisiUcuzdanPahaliiPage() {
        methods = new Methods();
    }
    public void siralama(){
        methods.findElement(By.cssSelector("[name='sortOrderBy']")).click();
        methods.waitBySeconds(6);
        methods.aracFiltrelemeUcuzToPahali();
        methods.waitBySeconds(3);
        }
    }

