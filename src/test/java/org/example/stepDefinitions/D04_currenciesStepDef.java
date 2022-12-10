package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_currencies;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class D04_currenciesStepDef {

    P04_currencies curr= new P04_currencies();

    @When("user switches currency to Euro")
    public void to_euro(){
        curr.selectCurrency("Euro");
    }

    @Then("Products currency is switched to Euro successfully")
    public void check_Euro() {
        for (WebElement currentPrice : curr.productLst()) {
            Assert.assertTrue(currentPrice.getText().contains("€"));
        }
    }

    @When("user switches currency to Dollar")
    public void to_dollar(){
        curr.selectCurrency("US Dollar");
    }
    @Then("Products currency is switched to Dollar successfully")
    public void check_dollar() {
        for (WebElement currentPrice : curr.productLst()) {
            Assert.assertTrue(currentPrice.getText().contains("$"));
        }
    }


}
