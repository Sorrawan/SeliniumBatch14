package com.Syntax.class03xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//Go to Fb
        driver.get("https://www.facebook.com/");
//Enter Password
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Abcdefg");
        driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

//Using xpath by text
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();

        //Using xpath by Contains method
        // driver.findElement(By.xpath("//a[contains(text(),'Forgot')]")).click();  // No need to copy the hole word"Forgot password?" => "Forgot"


    }
}
