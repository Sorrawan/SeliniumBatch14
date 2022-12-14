package com.Syntax.utlis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
    //the WebDriver instance is accessible in all the methods now

    //Declare as a " public static" so another class can inheritance
    public static WebDriver driver;
    public static void openWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public static void closeBrowser() {
        driver.quit();
    }
}
