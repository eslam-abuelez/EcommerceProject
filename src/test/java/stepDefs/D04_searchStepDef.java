package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static stepDefs.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage homePage = new P03_homePage(driver);

    SoftAssert soft = new SoftAssert();

    @When("user clicks on search field")
    public void userClicksOnSearchField() {
        homePage.clickOnSearchTextField();
    }

    @And("user search by {string}")
    public void userSearchBy(String productName) {
        homePage.doSearch(productName);
    }


    @Then("user will find {string} relative results")
    public void userWillFindRelativeResults(String productName) {
        for (int x = 0; x < homePage.findResults().size(); x++) {
            String result = homePage.findResults().get(x).getText().toLowerCase();
            // Verify displaying product name
            System.out.println(result);
            // Assert on displaying products
            soft.assertTrue(result.contains(productName));
        }
        // Verify url
        System.out.println(driver.getCurrentUrl());
        // Assert on url
        soft.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        soft.assertAll();
    }

    @Then("user will find {string} specific results")
    public void userWillFindSpecificResults(String sku) {
        homePage.clickOnProduct();
        // Verify
        System.out.println(homePage.findSpecificResults());
        // Assert on displaying products
        Assert.assertTrue(homePage.findSpecificResults().contains(sku), "failed to assert products");
    }
}
