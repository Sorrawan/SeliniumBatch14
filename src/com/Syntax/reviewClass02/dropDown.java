package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDown {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Open the website
        driver.get("https://www.facebook.com/");

        //click on create New Account, by using "contain text"
        WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
        createAccount.click();

        //Sleep for 2 seconds to wait for the window to open up
        Thread.sleep(2000);

        //Select the date from dropdown
        // Select the date from the down
//        approach to use the select
//        1.Find the webElement that contains the select Tag
//        2.use Select class Select sel =new Select(Webelement)

//        1.Find the webElement that contains the select Tag
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//        2.use Select class Select sel =new Select(Webelement)
        Select sel=new Select(day);

//        We have now three methods
//        1.Select by index
        sel.selectByIndex(4);
        Thread.sleep(2000);
//        2.Select by visible Text
        sel.selectByVisibleText("31");
        Thread.sleep(2000);
//        3.Select by Value
        sel.selectByValue("16");
//        .....................

        //        1.find the WebElement
//        2. use the select class to intiate an instance
        //        1.find the WebElement
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        //        2. use the select class to intiate an instance
        Select selectMonth= new Select(month);
//
        selectMonth.selectByVisibleText("Aug");

//Print all Element months in the console
        //        print all the available months in the console
//        gets u all the available options in the dropDown
        List<WebElement> Options = selectMonth.getOptions();
//        traverse through the loop and print each WebElement
        for(int i=0;i<Options.size();i++){

            String months = Options.get(i).getText();
            System.out.println(months);
        }




    }
}

