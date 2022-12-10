package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P12_SuccessfulOrder;
import org.testng.Assert;

import java.time.Duration;

public class D12_SuccessfulOrderStepDef {

    P12_SuccessfulOrder order=new P12_SuccessfulOrder();

    @Given("user clicks on shopping cart link")
    public void shopping_cart_link(){
        order.shoppingCartLink().click();
    }

    @And ("user accepts the agreement")
    public void accept_the_agreement(){
        order.acceptAgreement().click();
    }

    @When("user clicks on checkout button")
    public void checkout_btn(){
        order.checkoutBtn().click();
    }
    @And("user fills all fields")
    public void fill_all_fields() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Thread.sleep(3000);
        order.country();
        order.city().sendKeys("Alex");
        order.address().sendKeys("Monatzah");
        order.zipCode().sendKeys("40004");
        order.phone().sendKeys("0226827189");
    }

    @Then("user click on continue button")
    public void fields_continue_btn() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.fieldsContinueBtn().click();
    }

    @And("user select delivery method and click continue button")
    public void shipping_continue_btn() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.shippingContinueBtn().click();
    }
    @And("user select payment method and click continue button")
    public void payment_method() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.paymentMethodBtn().click();
    }

    @And("user click continue button")
    public void payment_info_Btn() {
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.paymentInfoBtn().click();
    }

    @And("user click confirm button")
    public void confirm_btn(){
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        order.confirmBtn().click();
    }

    @And("order is processed successfully")
    public void orderProcessedSuccessfully() {
        String actualResult= order.orderProceededTitle().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
