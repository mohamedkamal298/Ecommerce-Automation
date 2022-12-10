package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_Search;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D03_searchStepDef {

    P03_Search search=new P03_Search();

    @Given("user opens homepage")
    public void home_page(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user search for apple products")
    public void search_product(){
        search.searchProduct().sendKeys("apple");
        search.searchProduct().submit();
    }
    @Then("user finds product results successfully")
    public void success_search(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=apple");

        int items_count = search.getProductResultList().size();
        Assert.assertTrue(items_count>0);
    }

    @When("user search by SKU for a product")
    public void search_by_SKU() throws InterruptedException {
        Thread.sleep(2000);

        search.searchProduct().sendKeys("AP_MBP_13");
        search.searchProduct().submit();
        Hooks.driver.findElement(By.className("product-title")).click();
    }

    @Then("user finds product result by SKU successfully")
    public void check_correct_SKU(){
        Assert.assertEquals(Hooks.driver.findElement(By.id("sku-4")).getText().contains("AP_MBP_13"),true);

        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
    }
}
