package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_homePage {
    WebDriver driver;

    // Constructor
    public P03_homePage(WebDriver driver) {
        this.driver = driver;
    }

    // Home page Locators
    By registerLink = By.cssSelector(".ico-register");
    By loginLink = By.linkText("Log in");
    By currencyDDL = By.id("customerCurrency");
    By searchTextField = By.cssSelector("input#small-searchterms");
    By searchBTN = By.cssSelector(".button-1.search-box-button");
    By iPhoneSlider = By.cssSelector("div#nivo-slider > a:nth-of-type(1)");
    By nokiaSlider = By.cssSelector("div#nivo-slider > a:nth-of-type(2)");
    By faceBookLink = By.cssSelector(".facebook>a[target='_blank']");
    By twitterLink = By.cssSelector(".twitter > a[target='_blank']");
    By rssLink = By.linkText("RSS");
    By youTubeLink = By.linkText("YouTube");
    By wishlistBtnProduct = By.xpath("//div[2]/div[@class='product-item']//button[@title='Add to wishlist']");
    By notificationBarSuccessMessage = By.cssSelector("p.content");
    By wishlistLink = By.cssSelector(".ico-wishlist > .wishlist-label");
    By computerHover = By.cssSelector(".notmobile.top-menu > li:nth-of-type(1) > a");
    By deskTop = By.cssSelector(".notmobile.top-menu > li:nth-of-type(1) > .first-level.sublist > li:nth-of-type(1) > a");
    //homepage/subcategory ex: notebooks
    By pageTitle = By.cssSelector("div[class='page-title']");

    By productTitle = By.cssSelector(".product-item  h2 > a");
    By skuTitle = By.cssSelector(".sku > .value");


    By qtyValue = By.cssSelector("input.qty-input");

    public List<WebElement> findResults() {
        List<WebElement> results = driver.findElements(productTitle);
        return results;
    }

    public void clickOnProduct() {
        driver.findElement(productTitle).click();
    }

    public String findSpecificResults() {
        String specific = driver.findElement(skuTitle).getText();
        return specific;
    }


    public WebElement PageTitle() {
        return driver.findElement(pageTitle);
    }

    public void hoverOnCategories() {
        Actions hover = new Actions(driver);
        hover.moveToElement(driver.findElement(computerHover));
        hover.moveToElement(driver.findElement(deskTop));
        hover.click().build().perform();
        System.out.println(driver.findElement(deskTop).getAttribute("href"));

    }



//    public void clickOnRegistrationLink() {
//        driver.findElement(registerLink).click();
//    }

    public void clickOnLoginLink() {
        driver.findElement(loginLink).click();
    }

    public String getHomePageURL() {
        return driver.getCurrentUrl();
    }

    public void changeCurrency() {
        WebElement currencyDDLWebEle = driver.findElement(currencyDDL);
        Select select1 = new Select(currencyDDLWebEle);
        select1.selectByVisibleText("Euro");
    }


    public List<WebElement> prices() {
        List<WebElement> prices = driver.findElements(By.cssSelector(".actual-price.price"));
        return prices;
    }

    public void clickOnSearchTextField() {
        driver.findElement(searchTextField).click();
    }

    public void doSearch(String text) {
        driver.findElement(searchTextField).sendKeys(text);
        driver.findElement(searchBTN).click();
    }

    public void clickOniPhoneSlider() {
        driver.findElement(iPhoneSlider).click();
    }

    public void clickOnNokiaSlider() {
        driver.findElement(nokiaSlider).click();
    }

    public void clickOnFaceBookLink() {
        driver.findElement(faceBookLink).click();
    }

    public void clickOnTwitterLink() {
        driver.findElement(twitterLink).click();
    }

    public void clickOnRssLink() {
        driver.findElement(rssLink).click();
    }

    public void clickOnYoutubeLink() {
        driver.findElement(youTubeLink).click();
    }

    public void clickOnWishlistBtnProduct() {
        driver.findElement(wishlistBtnProduct).click();
    }

    public WebElement getNotificationBarSuccessMessage() {
        return driver.findElement(notificationBarSuccessMessage);
    }

    public String getNotificationBackgroundColor() {
        String backgroundColor = driver.findElement(By.cssSelector("div#bar-notification > .bar-notification.success")).getCssValue("background-color");
        return backgroundColor;
    }

    public void clickOnWishlistLink() {
        driver.findElement(wishlistLink).click();
    }

    public String getQtyValue() {
        //System.out.println(driver.findElement(qtyValue).getAttribute("value"));
        return driver.findElement(qtyValue).getAttribute("value");
    }
}
