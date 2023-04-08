package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class UyeOlPage {
    Methods methods;

    public UyeOlPage(){
        methods = new Methods();
    }
    public void UyeKayit(){
        methods.findElement(By.cssSelector("[href='/uye-ol']")).click();
        methods.findElement(By.cssSelector("#name")).click();
        methods.sendKeys(By.cssSelector("#name"), "Mert");
        methods.findElement(By.cssSelector("#surname")).click();
        methods.sendKeys(By.cssSelector("#surname"), "Güney");
        methods.findElement(By.cssSelector("#phoneNumber")).click();
        methods.sendKeys(By.cssSelector("#phoneNumber"), "5452138097");
        methods.findElement(By.cssSelector("#password")).click();
        methods.sendKeys(By.cssSelector("#password"), "test");
    }

    public void SozlesmeKabul(){
        methods.findElement(By.cssSelector("[for='kvkkAgreement'] > .check-mark")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector(".btn")).click();
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("[for='membershipAgreement'] > .check-mark")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[for='newsletterAcceptance'] > .check-mark")).click();
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector(".btn-form-submit"));
        methods.waitBySeconds(3);
    }
}
