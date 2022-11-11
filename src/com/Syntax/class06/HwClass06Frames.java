package com.Syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HwClass06Frames {
    public static void main(String[] args) {
        /*
        HW:
goto https://chercher.tech/practice/frames

1.check the checkBox
2.Select BabyCat from drop dwon
3. Send text in text box "DONE"
         */
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames");

//        switch the focus of the driver to the parent iframe whose id is iframe1
        driver.switchTo().frame("frame1");
//        switch the focus to the child frame
        driver.switchTo().frame(0);

//1.check the checkBox
        WebElement checkBox = driver.findElement(By.id("a"));
        checkBox.click();

 //2.Select BabyCat from drop dwon
        //2.1. switch the focus back to home content
        driver.switchTo().defaultContent();

// 2.2 Switching to the frame which has drop down
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

        //then make the switch
        // 2.3       find the select tag
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel= new Select(dropDown);
        sel.selectByIndex(1);   //Babtcat in index1

 //3. Send text in text box "DONE"
       //3.1 switch the focus back to home content
        driver.switchTo().defaultContent();

        //3.2
        driver.switchTo().frame("frame1");
        //3.3 Enter the text we want
        driver.findElement(By.xpath("//input")).sendKeys("abracdabra");
    }
}
