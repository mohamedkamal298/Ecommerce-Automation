package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P05_hoverCategories;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {

    P05_hoverCategories hoverCat =new P05_hoverCategories();
    @When("user selects Books category")
    public void selectBooksCategory() throws InterruptedException {
        hoverCat.selectBooksCategory();
        Thread.sleep(3000);
    }
    @Then("user go to Books category successfully")
    public void success_books(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/books");
    }

    @And("user selects Computers category then hover to Others subcategory")
    public void Computers_SubCategory() throws InterruptedException {
        hoverCat.selectComputersSubCategory();
        Thread.sleep(3000);
    }
    @Then("user go to Computers category successfully")
    public void success_computers(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
    }

}
