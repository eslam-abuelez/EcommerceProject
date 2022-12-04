package stepDefs;

import Data.data.JsonDataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import static stepDefs.Hooks.driver;

public class D02_loginStepDef {
    P02_login p02login = new P02_login(driver);
    P03_homePage homePage = new P03_homePage(driver);
    P01_register p01register = new P01_register();
    //D01_registerStepDef d01registerStepDef = new D01_registerStepDef();
    JsonDataReader jsonReader = new JsonDataReader();
    SoftAssert soft = new SoftAssert();


    @Given("user on home page")
    public void userGoToLoginPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.nopcommerce.com/");

    }

    @When("user go to login page")
    public void loginPage() {

        homePage.clickOnLoginLink();

    }

    @Then("user login with valid email and password")
    public void ValidEmailandPass() throws IOException, ParseException {
        //jsonReader.JsonReader();
        p02login.enterLoginCredentials("Islam@example.com", "P@ssw0rd");
    }

   // @Then("user on login page")


    @And("user press on login button")
    public void LoginBTN() throws IOException, ParseException  {
        p02login.clickOnLoginBtn();
    }

    @And("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        // Assert on Current page after login
        soft.assertEquals("https://demo.nopcommerce.com/", homePage.getHomePageURL());
        // Assert on my Account tab
        soft.assertTrue(p02login.getMyAccountWebEle().isDisplayed());
        soft.assertAll();

    }

    @When("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String wrongEmail, String password) {
        p02login.enterLoginCredentials(wrongEmail, password);
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        // Assert on failed message
        soft.assertTrue(p02login.getFailedLoginMessageText().contains("Login was unsuccessful."));
        // Assert on message color

        soft.assertEquals(p02login.getLoginMessageColor(), "rgba(228, 67, 75, 1)");
        soft.assertAll();
    }
}
