package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximizeWindow {
    public static void main(String[] args) {
  //Go to google.com
  //Maximize your window


        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
 //create instance of WebDriver
        WebDriver driver=new ChromeDriver();
//Go to Google.com
        driver.get("https://www.google.com/");
//Maximize
        driver.manage().window().maximize();
//Full screen
        driver.manage().window().fullscreen();
 //Quit
        driver.quit();
    }
}
