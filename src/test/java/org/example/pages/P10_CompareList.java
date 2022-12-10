package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P10_CompareList {

    public WebElement selectPrideBook(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/pride-and-prejudice\"]"));
    }

    public WebElement addBook(){
        return Hooks.driver.findElement(By.cssSelector("div div[class=\"compare-products\"]"));
    }

    public WebElement selectPiesBook(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/first-prize-pies\"]"));
    }
}
