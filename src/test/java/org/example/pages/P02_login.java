package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {

    WebDriver driver;

    // Constructor
    public P02_login(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Locators
     */
    By loginEmailTxtField = By.id("Email");
    By loginPasswordTxtField = By.id("Password");
    By loginBtn = By.cssSelector(".button-1.login-button");

    /**
     * locators for assertions
     */
    By myAccountLink = By.linkText("My account");
    By failedLoginMessage = By.cssSelector(".validation-summary-errors");


    /**
     * Actions
     */
    public void enterLoginCredentials(String loginEmail, String loginPassword) {
        driver.findElement(loginEmailTxtField).sendKeys(loginEmail);
        driver.findElement(loginPasswordTxtField).sendKeys(loginPassword);
    }

    public void clickOnLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public WebElement getMyAccountWebEle() {
        WebElement myAccountWebEle = driver.findElement(myAccountLink);
        System.out.println(myAccountWebEle.isDisplayed());
        return myAccountWebEle;
    }

    public String getFailedLoginMessageText() {
        String failedMessage = driver.findElement(failedLoginMessage).getText();
        System.out.println(failedMessage);
        return failedMessage;
    }

    public String getLoginMessageColor() {
        String messageColor = driver.findElement(failedLoginMessage).getCssValue("color");
        // Verify
        System.out.println(messageColor);
        return messageColor;
    }
}
