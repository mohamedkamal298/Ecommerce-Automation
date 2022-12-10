package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement email(){
        return Hooks.driver.findElement(By.className("email"));
    }
    public WebElement password(){
        return Hooks.driver.findElement(By.className("password"));
    }
    public WebElement loginBtn(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement forgetPassword(){
        return Hooks.driver.findElement(By.className("forgot-password"));
    }
    public WebElement enterEmail(){
        return Hooks.driver.findElement(By.className("email"));
    }

}
