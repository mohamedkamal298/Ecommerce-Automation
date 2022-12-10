package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P10_CompareList;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D10_CompareListStepDef {

    P10_CompareList compareList=new P10_CompareList();

    @When("user selects Pride and Prejudice Book")
    public void select_pride_book(){
        compareList.selectPrideBook().click();
    }
    @And("user clicks on add to CompareList")
    public void add_to_compareList(){
        compareList.addBook().click();
    }

    @Then("product is added successfully to CompareList")
    public void success_added_prideBook() {
        String expectedResult = "The product has been added to your product comparison";
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText().contains(expectedResult));
    }

    @When("user selects First Prize Pies book")
    public void select_pies_book(){
        compareList.selectPiesBook().click();
    }

}
