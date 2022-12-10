package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01_register {

    public WebElement register(){
        return Hooks.driver.findElement(By.className("ico-register"));
    }
     public WebElement gender(){
         return Hooks.driver.findElement(By.id("gender-male"));
     }
     public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
     }
    public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public Select birthDay(){
        By DateOfBirthDay = By.name("DateOfBirthDay");
        return new Select(Hooks.driver.findElement(DateOfBirthDay));
    }
    public Select birthMonth(){
        By DateOfBirthMonth = By.name("DateOfBirthMonth");
        return new Select(Hooks.driver.findElement(DateOfBirthMonth));
    }
    public Select birthYear(){
        By DateOfBirthYear = By.name("DateOfBirthYear");
        return new Select(Hooks.driver.findElement(DateOfBirthYear));
    }
    public WebElement enterEmail(){
       return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement enterCompany(){
        return Hooks.driver.findElement(By.id("Company"));
    }
    public WebElement enterPassword(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassword(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
}

