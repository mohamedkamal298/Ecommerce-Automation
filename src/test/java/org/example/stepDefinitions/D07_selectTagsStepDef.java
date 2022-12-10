package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P07_selectTags;
import org.testng.Assert;

public class D07_selectTagsStepDef {

    P07_selectTags tag= new P07_selectTags();

    @When("user clicks apparel tag")
    public void apparel_tag(){
        tag.apparelTag().click();
    }

    @Then("user go to apparel successfully")
    public void success_apparel(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/apparel-2");
    }

    @When("user clicks compact tag")
    public void compact_tag(){
        tag.compactTag().click();
    }

    @Then("user go to compact successfully")
    public void success_compact(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/compact");
    }

}
