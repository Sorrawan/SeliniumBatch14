package com.Syntax.class02;
//จดไม่เสด
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) {
        // Set the path to driver to link it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        // go to smart bear.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //  //maximize the window
                driver.manage().window().maximize();

// Enter the userName
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

 //Enter the password
 driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");

 //Click login
        driver.findElement(By.className("button")).click();

     //Make surethat the title is correct   i.e Web Orders

        //  get the title of the page
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("The Title is correct :"+ title);
        }
        else{
            System.out.println("The title is incorrect :"+title);
        }



    }
}
