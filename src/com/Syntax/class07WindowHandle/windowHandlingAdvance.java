package com.Syntax.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class windowHandlingAdvance {
    public static void main(String[] args) {
        // set the path to the driver to link it with our class    on mac u dont need .exe on windows u need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
//        open gmail.com sigup page
        driver.get("http://accounts.google.com/signup");
//        click on help button
                WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//        click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

// the title of my desired page is    Google Account Help

//       1. "get all the window handles" then using Enhanced loop to loop all Windows that we are opening right now
        //Using "get.Title()" for getting into "Help window" where "Google Account Help" is located

        Set<String> allHandles = driver.getWindowHandles();   //"get all the window handles"

        for(String handle:allHandles){   //
//            switching the focus to the current handle from list
            driver.switchTo().window(handle);
//            get the title of the window to which the driver has switched
            String title = driver.getTitle();
//            compare if the title is of the help
            if(title.equalsIgnoreCase("Google Account Help")){

                System.out.println("the current page under focus is :"+title);  //the current page under focus is :Google Account Help
                break;
            }

        }

        //        find the community button and click on it
        WebElement communityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        communityBtn.click();

//Go back to Sign up page
        driver.get("http://accounts.google.com/signup");
    }
}
