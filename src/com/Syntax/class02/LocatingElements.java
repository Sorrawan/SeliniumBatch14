package com.Syntax.class02;
//จดไม่เสด
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    //Got to Fb.com
    //Enter Username
    //Enter password
    //Click login
    public static void main(String[] args) {


        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to Fb.com
        driver.get("https://www.facebook.com/");

        //maximize the window
        driver.manage().window().maximize();

        //enter the Username in the TextBox
//1. Locate the element and send the keys
        driver.findElement(By.id("email")).sendKeys("abreacabdara");

// enter the password in the TextBox
        driver.findElement(By.name("pass")).sendKeys("12345fe");

//Click the login
  driver.findElement(By.name("login")).click();

//For the following task to work please make sure that you comment the login functionality

 //Task 2
        //Click on forgot password
  //              driver.findElement(By.linkText("Forgot password?")).click();

        //For the following task to work please make sure to comment the task2 and login  functionality

  // Task3   :
        //Click on forgot password using Partial linkText locator
   //     driver.findElement(By.partialLinkText("Forgot ")).click();        //Bcuz sometime texts can be too long



    }
}