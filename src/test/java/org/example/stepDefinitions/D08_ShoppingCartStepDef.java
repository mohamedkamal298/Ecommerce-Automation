package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P08_ShoppingCart;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D08_ShoppingCartStepDef {

    P08_ShoppingCart shoppingCart=new P08_ShoppingCart();

    @When("user selects Apple MacBook")
    public void select_apple(){
        shoppingCart.selectApple().click();
    }

    @And("user clicks on add to cart button for Apple MacBook")
    public void add_apple_to_cart(){
        shoppingCart.AppleMacBookAddToCart().click();
    }

    @Then("product is added successfully")
    public void apple_added_successfully(){
        String expectedResult = "The product has been added to your shopping cart";
        Assert.assertTrue(Hooks.driver.findElement(By.className("content")).getText().contains(expectedResult));
    }

    @When("user selects Asus Laptop")
    public void select_asus(){
        shoppingCart.selectAsusLaptop().click();
    }

    @And("user clicks on add to cart button for Asus Laptop")
    public void add_asus_to_cart(){
        shoppingCart.AsusLaptopAddToCart().click();
    }

}
