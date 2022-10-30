package com.Syntax.reviewClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2class2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        his is The HomeWork
you must use Relative Xpath to do this
Note: you are free to choose the type of relative Xpath, but try to use the one that seems more appropriate

1.Navigate to http://syntaxprojects.com/
2.Click on start practicing
3.click on simple form demo
4.enter any text on first text box
5.click on show message
6.quit the browser
         */
        //1.Navigate to http://syntaxprojects.com/
        //setting up the WebDriver to connect with Chrome
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        //create an instance    = to open website
        WebDriver driver=new ChromeDriver();


        //driver.get  = will wait until finish loading of that window then process the next step
        //driver.navigate.to = won't wait to finish loading of that window and go processing the next step so sometime we get an error called"Nosuch Element Exception"

        //Open the http://syntaxprojects.com/
        driver.get("http://syntaxprojects.com/");
        driver.manage().window().maximize();

        //2.Click on start practicing
        driver.findElement(By.xpath("//a[text()=' Start Practising ']")).click();

        Thread.sleep(2000);

        //***3.click on simple form demo
        //3.1. click on simple form demo using indexing
        //(//a[text()='Simple Form Demo'])[2] : Won't use this in case no choice because they can add on some item above this link in the future

        //driver.findElement(By.xpath("(//a[@class='list-group-item'])[1]")).click();

        //We can "add" more attribute to make it unique in case the attribute we wanna use has the same value like other attributes
        //3.2. click on simple form demo , using and operator in the xpath
        driver.findElement(By.xpath("//a[@class='list-group-item' and @href='basic-first-form-demo.php']")).click();

       // 4. enter any text on first text box
        //5.click on show message
        //6.quit the browser

    }
}
