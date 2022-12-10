package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P14_FollowUs;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D14_FollowUsStepDef {

    P14_FollowUs follow = new P14_FollowUs();
    WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));


    @And("user clicks youtube icon")
    public void Youtube_icon() {
        follow.openYoutube().click();
    }

    @Then("youtube is accessed successfully")
    public void Youtube_accessed() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabList = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabList.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce");

        //switch to parent window
        Hooks.driver.switchTo().window(tabList.get(0));

    }

    @And("user clicks facebook icon")
    public void Facebook_icon() {
        follow.openFacebook().click();
    }

    @Then("facebook is accessed successfully")
    public void Facebook_accessed() {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabList = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabList.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce");

        Hooks.driver.switchTo().window(tabList.get(0));

    }
    @And("user clicks twitter icon")
    public void Twitter_icon(){
        follow.openTwitter().click();
    }

    @Then("twitter is accessed successfully")
    public void Twitter_accessed(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabList = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabList.get(1));
        String currentURl = Hooks.driver.getCurrentUrl();

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

        Hooks.driver.switchTo().window(tabList.get(0));

    }
    @And("user clicks RSS icon")
    public void RSS_icon(){
        follow.openRSS().click();
    }

    @Then("RSS is accessed successfully")
    public void RSS_Accessed(){
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        ArrayList<String> tabList = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(tabList.get(1));

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");

        Hooks.driver.switchTo().window(tabList.get(0));

    }
}
