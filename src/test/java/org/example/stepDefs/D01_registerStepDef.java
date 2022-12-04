package org.example.stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D01_registerStepDef  {

    P01_register register = new P01_register();

    @Given("user go to register page")
    public void goRegisterPage() {
        register.registerlink().click();

    }

    @Then("user select gender type")
    public void selectGender(){
        register.selectgender().click();
    }

    @Then("user enter first name automation")
    public void firstName(){
       register.firstName().sendKeys("automation");
    }
    @Then("user enter last name tester")
    public void lastName(){
        register.lastName().sendKeys("tester");
    }

    @When("user enter day of birth")
    public void birthDay (){
        register.birthDay().sendKeys("6");
    }

    @When("user enter Month of birth")
    public void birthMonth (){
        register.birthMonth().sendKeys("6");
    }
    @When("user enter Year of birth")
    public void birthYear (){
        register.birthYear().sendKeys("2006");
    }




    @Then("user enter email \"Islam@example.com\" field")
    public void email(){
        register.email().sendKeys("Islam@example.com");
    }

    @Then("user fills Password field P@ssw0rd")
    public void passwords(){
        register.passwords().sendKeys("P@ssw0rd");
    }
    @Then("user confirm \"P@ssw0rd\"")
    public void confirmPasswords(){
        register.confirmPasswords().sendKeys("P@ssw0rd");
    }

    @Then("user clicks on register button")
    public void clickRegister(){
        register.clickRegister().click();
    }




    @Then("success message is displayed")
    public void successMSG(){


        String successMSG = driver.findElement(By.className("result")).getText();
        String successMSGColor = driver.findElement(By.className("result")).getCssValue("color");
        // First Assertion
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(successMSG.contains("Your registration completed"));
        // second Assertion

        soft.assertEquals(successMSGColor, "rgba(76, 177, 124, 1)");
        // Assert All
        soft.assertAll();
    }

    }





