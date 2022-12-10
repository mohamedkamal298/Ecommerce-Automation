package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P07_selectTags {

    public WebElement apparelTag() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel-2\"]"));
    }

    public WebElement compactTag() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/compact\"]"));
    }
}
