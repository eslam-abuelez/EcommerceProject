package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.Locale;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage(driver);

    @When("user hover and select random value")
    public void userHoverOnRandomValue() {
        homePage.hoverOnCategories();

    }

    @Then("title of random value is displayed")
    public void titleOfRandomValueIsDisplayed() {
    System.out.println(homePage.PageTitle().getText());
        Assert.assertTrue(homePage.PageTitle().getText().contains("Desktops"));

    }


}
