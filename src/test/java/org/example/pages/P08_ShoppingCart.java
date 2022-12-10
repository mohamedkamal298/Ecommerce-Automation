package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P08_ShoppingCart {

    public WebElement selectApple(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apple-macbook-pro-13-inch\"]"));
    }

    public WebElement AppleMacBookAddToCart(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-4"));
    }

    public WebElement selectAsusLaptop(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/asus-n551jk-xo076h-laptop\"]"));
    }

    public WebElement AsusLaptopAddToCart(){
        return Hooks.driver.findElement(By.id("add-to-cart-button-5"));
    }

}
