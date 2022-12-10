package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P09_WishList;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D09_WishListStepDef {

    P09_WishList wishList= new P09_WishList();

    @When("user selects HTC Mobile")
    public void select_apple(){
        wishList.selectHTC().click();
    }

    @And("user clicks on add to wishlist for mobile")
    public void add_macBook(){
        wishList.htcAddToWishList().click();
    }
    @Then("product is added successfully to Wishlist")
    public void HTC_added_successfully(){
        String expectedResult = "The product has been added to your wishlist";
        Assert.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains(expectedResult));
    }

    @When("user selects Portable Sound Speakers")
    public void select_Speakers() {
        wishList.selectPortableSpeakers().click();
    }

    @And("user clicks on add to wishList for speakers")
    public void add_speakers() {
        wishList.addSpeakersToWishList().click();
    }

}
