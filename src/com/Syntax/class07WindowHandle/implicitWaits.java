package com.Syntax.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWaits {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //20sec is max and perfect time
        //".implicitlyWait" => define only once before the start of our code
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        //click on create new account
        WebElement createNewAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccountBtn.click();

//        Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("abracadabra");



    }
}
