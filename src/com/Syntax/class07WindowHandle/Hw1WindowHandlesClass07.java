package com.Syntax.class07WindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Hw1WindowHandlesClass07 {
    /*
    **HomeWork 1**
**WindowHandles**
1.goto
http://accounts.google.com/signup
2.click on help and privacy btn
3.click on community Button
4.goto gmail.com page and enter your user name in form
*
* Hint1:
u can save the window handle in variables for later use

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://accounts.google.com/signup");

 //2.click on help and privacy btn
        //click on help button
        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();
//        click on privacy button
        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();
        String mainPageHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle:allHandles){
            driver.switchTo().window(handle);

//making sure that we have switched to the right page
            if(driver.getTitle().equalsIgnoreCase("Google Account Help")){

                break;
            }

        }
        System.out.println("the title of current page is"+driver.getTitle());
        System.out.println("i am here");
        Thread.sleep(2000);
//        find the element comunity and click on it
        WebElement comunityBtn = driver.findElement(By.xpath("//a[text()='Community']"));
        comunityBtn.click();

        driver.switchTo().window(mainPageHandle);
        System.out.println(driver.getTitle());


    }
}
