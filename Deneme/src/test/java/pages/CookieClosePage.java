package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class CookieClosePage {
    Methods methods;

    public CookieClosePage() {
        methods = new Methods();
    }

    public void cookieclose(){
        methods.findElement(By.cssSelector("#js-hook-cookie-policy-banner > button")).click();
        methods.waitBySeconds(4);
    }
}
