package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P04_currencies {

    public WebElement selectCurrency(String currency){
        By by= By.name("customerCurrency");
        WebElement selectEuro= Hooks.driver.findElement(by);
        Select select = new Select(selectEuro);
        select.selectByVisibleText(currency);
        return selectEuro;
    }

    public List<WebElement> productLst(){
        By productLst= By.cssSelector("span[class=\"price actual-price\"]");
        return Hooks.driver.findElements(productLst);
    }
}
