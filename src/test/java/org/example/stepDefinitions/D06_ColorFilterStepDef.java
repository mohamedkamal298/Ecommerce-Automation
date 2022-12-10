package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P06_ColorFilter;

public class D06_ColorFilterStepDef {

    P06_ColorFilter filter = new P06_ColorFilter();

    @When("user select Apparel category then hover to Shoes subcategory")
    public void apparel_category(){
        filter.selectApparel();
    }
    @And("user select Shoes subcategory")
    public void shoes_subCategory(){
        filter.selectShoesSubCategory();
    }
    @Then("user filter by Grey color")
    public void grey_color(){
        filter.filterColor().click();
    }

}
