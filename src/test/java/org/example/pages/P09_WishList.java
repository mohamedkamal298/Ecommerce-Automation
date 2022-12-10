package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P09_WishList {

    public WebElement selectHTC(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }
    public WebElement htcAddToWishList(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-18"));
    }

    public WebElement selectPortableSpeakers() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/portable-sound-speakers\"]"));
    }

    public WebElement addSpeakersToWishList(){
        return Hooks.driver.findElement(By.id("add-to-wishlist-button-23"));
    }


}
