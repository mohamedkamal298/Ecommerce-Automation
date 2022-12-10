package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.testng.Assert;


public class D01_registerStepDef {

    P01_register reg = new P01_register();

    @Given("user go to register page")
    public void register_page(){
        reg.register().click();
    }

    @When("user select gender type")
    public void gender_type(){
        reg.gender().click();
    }
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void first_last_name(String firstName,String lastName){
        reg.firstName().sendKeys(firstName);
        reg.lastName().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void birth_date(){
        reg.birthDay().selectByValue("1");
        reg.birthMonth().selectByValue("3");
        reg.birthYear().selectByValue("1992");
    }
    @And("user enter email")
    public void enter_email(){
        reg.enterEmail().sendKeys("MohamedKamal@gmail.com");
    }
    @And("user enters company")
    public void enter_company(){
        reg.enterCompany().sendKeys("Vodafone");
    }

    @And("user fills Password fields")
    public void password_fields(){
        reg.enterPassword().sendKeys("Asd@12345");
        reg.confirmPassword().sendKeys("Asd@12345");
    }

    @And("user clicks on register button")
    public void register_button(){
        Hooks.driver.findElement(By.id("register-button")).click();
    }

    @Then("success message is displayed")
    public void success_message(){
        String expectedResult = "Your registration completed";
        Assert.assertEquals(Hooks.driver.findElement(By.className("result")).getText(),expectedResult);
    }



}

