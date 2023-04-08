package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class IlanFavoriAddPage {
    Methods methods ;

    public IlanFavoriAddPage(){
        methods = new Methods();
    }

    public void IlanFavoriAdd(){
        methods.scrollWithJavaScript(By.xpath("//span[.='Favori']"));
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("#js-hook-for-favourite > .font-default-minus")).click();
        methods.waitBySeconds(3);
    }

}
