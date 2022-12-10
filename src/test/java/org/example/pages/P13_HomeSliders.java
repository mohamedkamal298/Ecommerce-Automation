package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P13_HomeSliders {

    public WebElement clkLumiaSlider(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://demo.nopcommerce.com/\"]"));
    }

    public WebElement clkIPhoneSlider(){
        return Hooks.driver.findElement(By.xpath("//a[@style=\"display: none;\"]"));
    }
}
