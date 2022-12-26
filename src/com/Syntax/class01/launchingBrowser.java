package com.Syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowser {

    //To Open Google website

    // 1. Set the path to the driver to link it with our class
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

//2.Create a Webdriver instance
        WebDriver driver=new ChromeDriver();

//3. Use the get() function to open up the required website
        driver.get("https://www.google.com/");

//4. get the url of the website
        String URL=driver.getCurrentUrl();

//5. Print the url
        System.out.println(URL);

//6. get the title
        String title = driver.getTitle();

//7. print title
        System.out.println(title);

//8. close the Chrome
        driver.quit();     //mean it will close the whole browser
        driver.close();   // it will close the current tab only
    }
}

//driver.get() ============ driver.navigate().to()
//

//Navigate allow you to move forward, backward and refresh the page
  //driver.navigate().back()
  //driver.navigate().forward()
  //driver.navigate().()