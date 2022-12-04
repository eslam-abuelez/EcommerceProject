package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static stepDefs.Hooks.driver;

public class P01_register {

//create WebElement method to register button
    public WebElement registerlink()
    {
        return driver.findElement(By.linkText("Register"));
    }
    public WebElement selectgender()
    {
        return driver.findElement(By.id("gender-male"));
    }

    public WebElement firstName()
    {
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {
        Select birthDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
        return driver.findElement(By.xpath("//div [@class=\"inputs date-of-birth\"]//select [@name=\"DateOfBirthDay\"]"));
    }

    public WebElement birthMonth()
    {
        Select birthDay = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        return driver.findElement(By.xpath("//div [@class=\"inputs date-of-birth\"]//select [@name=\"DateOfBirthMonth\"]"));
    }
    public WebElement birthYear()
    {
        Select birthDay = new Select(driver.findElement(By.name("DateOfBirthYear")));
        return driver.findElement(By.xpath("//div [@class=\"inputs date-of-birth\"]//select [@name=\"DateOfBirthYear\"]"));
    }

    public WebElement email() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwords() {
        return (driver.findElement(By.id("Password")));

    }
    public WebElement confirmPasswords() {
        return (driver.findElement(By.id("ConfirmPassword")));

    }



    public WebElement clickRegister() {
        return (driver.findElement(By.id("register-button")));

    }


    public WebElement successMSG() {
        return (driver.findElement(By.className("result")));

    }

    public void doLogout() {
    }
}
