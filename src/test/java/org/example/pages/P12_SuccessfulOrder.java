package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P12_SuccessfulOrder {

    public WebElement shoppingCartLink(){
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]"));
    }
    public WebElement acceptAgreement(){
        return Hooks.driver.findElement(By.id("termsofservice"));
    }
    public WebElement checkoutBtn(){
        return Hooks.driver.findElement(By.id("checkout"));
    }
    public WebElement country() {
        WebElement Country = Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select = new Select(Country);
        select.selectByValue("123");
        return Country;
    }
    public WebElement city() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_City"));

    }
    public WebElement address() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
    }
    public WebElement zipCode() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phone() {
        return Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
    }
    public WebElement fieldsContinueBtn() {
        return Hooks.driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button"));
    }
    public WebElement shippingContinueBtn() {
        return Hooks.driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
    }

    public WebElement paymentMethodBtn() {
        return Hooks.driver.findElement(By.cssSelector("#payment-method-buttons-container > button"));
    }

    public WebElement paymentInfoBtn() {
        return Hooks.driver.findElement(By.cssSelector("#payment-info-buttons-container > button"));
    }

    public WebElement confirmBtn() {
        return Hooks.driver.findElement(By.cssSelector("#confirm-order-buttons-container > button"));
    }

    public WebElement orderProceededTitle() {
        return Hooks.driver.findElement(By.cssSelector("div.page-body.checkout-data > div > div.title > strong"));
    }

}
