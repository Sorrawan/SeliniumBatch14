package com.Syntax.class04RadioButtons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-first-form-demo.php");

 //Get the element text box
        // driver.findElement(By.cssSelector("input[placeholder*='Please enter']")).sendKeys("Sdfjkds");

 //another method of doing the above operation  => More readable, presentable
        //textbox = variable name
        WebElement textbox = driver.findElement(By.cssSelector("input[placeholder*='Please enter']"));
        textbox.sendKeys("Sdfjkds");

//Press the button "shoe message"
        WebElement button = driver.findElement(By.cssSelector("button[onclick ^='showIn']"));
        button.click();


    }
}
