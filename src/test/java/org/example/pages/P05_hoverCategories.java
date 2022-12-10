package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P05_hoverCategories {

    public WebElement selectBooksCategory() {
        WebElement selectedCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/books\"]"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedCategory).click().build().perform();
        return selectedCategory;
    }

    public WebElement selectComputersSubCategory() {
        WebElement selectedElectCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        Actions action = new Actions(Hooks.driver);
        action.moveToElement(selectedElectCategory).build().perform();

        WebElement selectedOthersSubcategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]"));
        action.moveToElement(selectedOthersSubcategory).click().build().perform();
        return selectedOthersSubcategory;
    }
}
