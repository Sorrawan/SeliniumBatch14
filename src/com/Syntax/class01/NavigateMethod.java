package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class NavigateMethod {
    //Go to google.com
    //Go to fb.com
    //Go back to google.com

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
  //Create the Webdriver instance
        WebDriver driver=new ChromeDriver();
   //Go to Google.com
        driver.get("https://www.google.com/");
//Go to Fb.com
        driver.navigate().to("https://www.facebook.com/");

  //Introduce some sleep which is wait
 // wait or pause for 2000 milli seconds(2 sec)
     Thread.sleep(2000);
//Go back to google.com
        driver.navigate().back();
 //Wait for 2Sec
        Thread.sleep(2000);
//Go back to fb.com
        driver.navigate().forward();
// Wait for 2Sec
        Thread.sleep(2000);
 //Refresh the page
 driver.navigate().refresh();
 //quit
        driver.quit();


    }
}
