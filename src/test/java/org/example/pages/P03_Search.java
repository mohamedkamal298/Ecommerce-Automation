package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_Search {

    public WebElement searchProduct(){
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }
    public List getProductResultList() {
        By resultList = By.cssSelector("div[class=\"product-item\"]");
        return Hooks.driver.findElements(resultList);
    }
}
