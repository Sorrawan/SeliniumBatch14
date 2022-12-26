package com.Syntax.class12;
//งง
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class jsExecutorScroll {
    public static void main(String[] args) throws InterruptedException {
        //        set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        maximize
        driver.manage().window().maximize();
        //  go to the website
        driver.get("https://www.amazon.com/");

    //     scroll down
        JavascriptExecutor js= (JavascriptExecutor) driver;  //Initialize the js executor
        js.executeScript("window.scrollBy(0,500)");   // 500 = range of scroll down we want Selenium to go
        Thread.sleep(3000);
    // Scroll down
        js.executeScript("window.scrollBy(0,-500)");





    }
}
