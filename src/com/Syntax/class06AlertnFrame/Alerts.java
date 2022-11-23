package com.Syntax.class06AlertnFrame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

    //Alert = พวกชอบ pop-up โผล่มาจากด้านบนหน้า Webpage
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");

//Find the button click me for the alert and click on it
        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        simpleAlert.click();

        Thread.sleep(2000);
        //Handling the alert
        Alert simpleAlert1 = driver.switchTo().alert();
        simpleAlert1.accept();    // "accept()" mean "click" on OK button

 //Find the button for confirmation alert and click on it
        WebElement confirmationAlert = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        confirmationAlert.click();

        Thread.sleep(2000);
 // // "accept()" mean "click" on OK button
 //dissmiss()  mean cancel
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.dismiss();

 //Find the prompt alert and send some text then accept it
        WebElement prompAlert = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        prompAlert.click();

        Thread.sleep(3000);
//Switch the focus to the alert
        Alert promp1 = driver.switchTo().alert();
        promp1.sendKeys("Sorrawan");
        promp1.accept();







    }
}
