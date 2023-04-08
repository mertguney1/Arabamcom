package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class IlanDetayPage {
    Methods methods;

    public  IlanDetayPage(){
        methods = new Methods();
    }

    public void IlanDetay(){
        methods.findElement(By.cssSelector("tbody .horizontal-half-padder-minus > [href='/ilan/galeriden-satilik-otomobil-volkswagen-passat/volkswagen-passat-b6-cikma-parca/18911716']")).click();
    }
}
