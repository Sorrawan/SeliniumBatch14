package com.Syntax.reviewClass;
//เฉลย Fb homework
//จดไม่เสร็จ
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        //setting up the WebDriver to connect with Chrome
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        //create an instance    = to open website
        WebDriver driver=new ChromeDriver();


        //driver.get  = will wait until finish loading of that window then process the next step
        //driver.navigate.to = won't wait to finish loading of that window and go processing the next step so sometime we get an error called"Nosuch Element Exception"

        //Open the Fb
        driver.get("https://www.facebook.com/");

        //Maximize the window
        driver.manage().window().maximize();

        //Before closing , Wait for some time
        Thread.sleep(2000);               //อย่าลืมว่าต้องกด Add exception to method signature ถึงจะใช้โคดนี้ได้

        //By using xpath by Text   => 'Create new account'
driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
//By using xpath by Contains Method
driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();

//



        //quit the browser  = close all the windows, all tabs
       // driver.quit();

        //close only one tab
        //driver.close();


    }
}
