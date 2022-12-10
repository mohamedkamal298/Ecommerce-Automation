package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P14_FollowUs {
    public WebElement openFacebook(){
        By facebook = By.linkText("Facebook");
        return Hooks.driver.findElement(facebook);
    }

    public WebElement openTwitter(){
        By twitter = By.linkText("Twitter");
        return Hooks.driver.findElement(twitter);
    }

    public WebElement openYoutube(){
        By youtube = By.linkText("YouTube");
        return Hooks.driver.findElement(youtube);
    }
    public WebElement openRSS(){
        By RSS = By.linkText("RSS");
        return Hooks.driver.findElement(RSS);
    }
}
