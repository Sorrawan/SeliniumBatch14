package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Oprn the website
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

        // Find the radio button
        // better to get all of them[options] then using Enhanced for-loop to pick the one we want
        // "driver.findElements()"  => using this to get all lists

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

//        traverse through the list of webElements
        for (WebElement radioBtn : radioBtns) {

//            find the desired radio button
            String option = radioBtn.getAttribute("value");

            if (option.equalsIgnoreCase("5 - 15")) {
//                click on the radio Btn
                radioBtn.click();

            }
        }
    }
}