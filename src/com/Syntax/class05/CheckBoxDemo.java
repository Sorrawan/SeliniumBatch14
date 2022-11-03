package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        // maximize
        driver.manage().window().maximize();

//find the checkbox
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
//        click on it
        checkBox.click();
    }
}
