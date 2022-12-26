package com.Syntax.class07WindowHandle;
//จดไม่เสร็จ

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();


//        task : goto gmail signup and get the window handle

//        goto gmail signup page
        driver.get("http://accounts.google.com/signup");

//        get the window handle for the current page
                String gmailHandle = driver.getWindowHandle();

//        print
        System.out.println("the handle of the current page is :"+gmailHandle);

//We will get the unique code in the console
        //CDwindow-7BD77F1927A6DA8DB93F563008B8A22B
//The code will be unique, it's going to change for every session
    }
}









