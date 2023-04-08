package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class HasarliAraclarPage {
    Methods methods;

    public HasarliAraclarPage(){
        methods = new Methods();
    }

    public void hasarliAraclarCategory(){
        methods.findElement(By.cssSelector("[href='hasarli-araclar']")).click();
        methods.waitBySeconds(5);
    }
}
