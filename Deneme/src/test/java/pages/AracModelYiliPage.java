package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class AracModelYiliPage {
     Methods methods;

     public AracModelYiliPage(){
         methods = new Methods();
     }

     public void modelYili(){
         methods.scrollWithJavaScript(By.cssSelector("tr:nth-of-type(3) > .horizontal-half-padder-minus > [href='/ilan/galeriden-satilik-otomobil-audi-a6/audi-a6-v6-2-8-cikma-motor/19911144']"));
         methods.waitBySeconds(4);
         methods.findElement(By.cssSelector("form > div:nth-of-type(6) .facet-button")).click();
         methods.waitBySeconds(3);
         methods.findElement(By.cssSelector("[maxlength='4'][placeholder='Min ']")).click();
         methods.waitBySeconds(2);
         methods.sendKeys(By.cssSelector("[maxlength='4'][placeholder='Min ']"),"2010");
         methods.findElement(By.cssSelector("[maxlength='4'][placeholder='Max ']")).click();
         methods.waitBySeconds(2);
         methods.sendKeys(By.cssSelector("[maxlength='4'][placeholder='Max ']"), "2013");
         methods.waitBySeconds(2);
         methods.findElement(By.cssSelector("#yil .btn")).click();
         methods.waitBySeconds(2);
     }
}
