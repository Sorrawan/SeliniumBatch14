package com.Syntax.class07WindowHandle;
//จดไม่เสร็จ

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hw2WaitsClass07 {
    /*
    **HomeWork 2**
*Implicit wait**

1. goto https://syntaxprojects.com/dynamic-data-loading-demo.php

2. click on get New User
3. get the firstname  of user and print it on console
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //20sec is max and perfect time
        //".implicitlyWait" => define only once before the start of our code
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://syntaxprojects.com/dynamic-elements-loading.php");

        //Click on the start button
        WebElement startBtn = driver.findElement(By.id("startButton"));
        startBtn.click();

        //        get the text out of the element
        WebElement textElement = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println( textElement.getText());

//               explicit wait unitl the webelement is displayed
//                ecplicit wait unitl the webeelemtn is clickable
//                explicit wsit until the webelement is selected


    }
}
