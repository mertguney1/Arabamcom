package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;

    public LoginPage(){
        methods = new Methods();
    }

    public void LoginPage(){
        methods.findElement(By.cssSelector("#emailOrPhone")).click();
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("#emailOrPhone"), "mertguney786@gmail.com");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector("#password")).click();
        methods.waitBySeconds(1);
        methods.sendKeys(By.cssSelector("#password"), "DenemeTest");
        methods.waitBySeconds(1);
        methods.findElement(By.cssSelector(".btn-form-submit")).click();
        methods.waitBySeconds(2);
    }

}
