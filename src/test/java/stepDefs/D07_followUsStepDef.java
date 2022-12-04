package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

import static stepDefs.Hooks.driver;

public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage(driver);

    @When("user click on facebook link")
    public void userClickOnFacebookLink() {
        homePage.clickOnFaceBookLink();
    }


    @Then("{string} facebook link is opened on a new tab")
    public void facebookPageIsOpenedOnANewTab(String faceBookLink) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));

        Assert.assertEquals(driver.getCurrentUrl(),faceBookLink);
    }

    @When("user click on twitter link")
    public void userClickOnTwitterLink() {
        homePage.clickOnTwitterLink();
    }

    @Then("{string} twitter link is opened on a new tab")
    public void twitterPageIsOpenedOnANewTab(String twitterLink) throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), twitterLink);
    }

    @When("user click on RSS link")
    public void userClickOnRSSLink() {
        homePage.clickOnRssLink();
    }

    @Then("{string} rss link is opened on a new tab")
    public void rssPageIsOpenedOnANewTab(String rssLink) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), rssLink);
    }

    @When("user click on youTube link")
    public void userClickOnYouTubeLink() {
        homePage.clickOnYoutubeLink();
    }

    @Then("{string} youtube link is opened on a new tab")
    public void youtubePageIsOpenedOnANewTab(String youtubeLink) {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        Assert.assertEquals(driver.getCurrentUrl(), youtubeLink);
    }
}
