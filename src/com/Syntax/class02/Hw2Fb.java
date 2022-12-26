package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw2Fb {
    /*
    navigate to fb.com
click on create new account
fill up all the textboxes

close the pop up
close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Sorrawan");
        driver.findElement(By.name("lastname")).sendKeys("Suter");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("sorrawan12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sorrawan12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("9876543ab");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.id("day")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("1990");
        Thread.sleep(2000);
        //กดGenderไม่ได้
        // driver.findElement(By.linkText("Female")).click();
        //Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(2000);
        //close the pop up
        //By using xpath by Contains Method
        driver.findElement(By.xpath("//img[contains(@src,'https://static.xx.fbcdn.net/rsrc.php/v3/yO/r/zgulV2zGm8t.png')]")).click();


        //close the browser
        driver.quit();

    }
}


