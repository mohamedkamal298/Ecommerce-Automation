package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P06_ColorFilter {

    public WebElement selectApparel() {
        WebElement selected = Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selected).build().perform();
        return selected;
    }

    public WebElement selectShoesSubCategory() {
        WebElement selectedSubcategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/shoes\"]"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedSubcategory).click().build().perform();
        return selectedSubcategory;
    }

    public WebElement filterColor() {
        WebElement filterColor = Hooks.driver.findElement(By.id("attribute-option-14"));
        return filterColor;
    }
}
