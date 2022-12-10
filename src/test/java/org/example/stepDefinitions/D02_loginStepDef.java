package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void login(){Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");}

    @When("user enters correct email and password")
    public void valid_data(){
        login.email().sendKeys("MohamedKamal@gmail.com");
        login.password().sendKeys("Asd@12345");
    }

    @And("user press on login button")
    public void login_button(){
        login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void success_login(){

        Assert.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),true);
    }

    @When("user enters wrong email and password")
    public void wrong_data(){
        login.email().sendKeys("Mohamed@gmail.com");
        login.password().sendKeys("zxc@12345");
    }

    @When("user clicks on forget password link")
    public void forget_password(){
        login.forgetPassword().click();
    }

    @And("user enters his Email")
    public void enterEmail(){
        login.enterEmail().sendKeys("MohamedKamal@gmail.com");
    }

    @And("user clicks on Recover button")
    public void recover_btn(){
        Hooks.driver.findElement(By.name("send-email")).click();
    }

    @Then("Reset message is displayed")
    public void reset_password(){
        String ExpectedResult = "Email with instructions has been sent to you";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }
}
