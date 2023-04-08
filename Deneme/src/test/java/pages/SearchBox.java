package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class SearchBox {
    Methods methods;

    public SearchBox(){
        methods = new Methods();
    }

    public void searchboxwrite(){

        methods.findElement(By.cssSelector("[placeholder='Kelime, galeri adı veya ilan no ile ara']")).click();
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("[placeholder='Kelime, galeri adı veya ilan no ile ara']"),"Otomobil");
        methods.findElement(By.cssSelector(".search-button")).click();
    }
}
