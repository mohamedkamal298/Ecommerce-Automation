package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P13_HomeSliders;
import org.testng.Assert;

public class D13_HomeSlidersStepDef {

    P13_HomeSliders sliders= new P13_HomeSliders();

    @And("user click on Lumia slider")
    public void lumia_slider(){
        sliders.clkLumiaSlider().click();
    }

    @Then("user open Lumia product successfully")
    public void lumia_success_open() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020","Error:URL Mismatch");
    }

    @And("user click on iPhone slider")
    public void iphone_slider(){
        sliders.clkIPhoneSlider().click();
    }

    @Then("user open iPhone product successfully")
    public void iphone_page_open() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6", "Error:URL Mismatch");
    }
}
