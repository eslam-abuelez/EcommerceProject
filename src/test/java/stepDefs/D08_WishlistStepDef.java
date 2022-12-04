package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static stepDefs.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage(driver);

    SoftAssert soft = new SoftAssert();

    @When("user add product to wishlist from home page")
    public void userAddProductToWishlistFromHomePage() {
        homePage.clickOnWishlistBtnProduct();
    }

    @Then("Success message is displayed")
    public void successMessageIsDisplayed() {


        System.out.println(homePage.getNotificationBarSuccessMessage().getText());

        soft.assertTrue(homePage.getNotificationBarSuccessMessage().getText().contains("The product has been added to your wishlist"));

        soft.assertEquals(homePage.getNotificationBackgroundColor(), "rgba(75, 176, 122, 1)");
        soft.assertAll();
    }

    @And("user open wishlist page")
    public void userOpenWishlistPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.invisibilityOf(homePage.getNotificationBarSuccessMessage()));
        homePage.clickOnWishlistLink();
    }

    @Then("product is displayed on wishlist")
    public void productIsDisplayedOnWishlist() {
        Assert.assertNotNull(homePage.getQtyValue(), "1");
    }
}
