package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Hooks {


    public static WebDriver driver;


    @Before
    public static void OpenBrowser() {
        // 1- Bridge

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Islam-Abdelrahman\\jdk-19.0.1\\chromedriver_win32 (1)\\chromedriver.exe");
        //2- create object from chrome browser
        driver = new ChromeDriver();


        //3- Configurations:    why implicitlyWait  is remarked

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // 4- navigate to url

         driver.get("https://demo.nopcommerce.com/");
        // 5- Navigate to reg Link


    }


    @After
        public static void quitDriver () throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();
        }
    }




