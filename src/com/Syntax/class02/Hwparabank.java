package com.Syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hwparabank {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
click on register
close the browser
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Sorrawan");
        driver.findElement(By.id("customer.lastName")).sendKeys("Suter");
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 North street");
        driver.findElement(By.name("customer.address.city")).sendKeys("Falls Church");
        driver.findElement(By.id("customer.address.state")).sendKeys("VA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("22041");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567890");
        driver.findElement(By.name("customer.ssn")).sendKeys("111223344");
        driver.findElement(By.id("customer.username")).sendKeys("sorrawan");
        driver.findElement(By.id("customer.password")).sendKeys("098765");
        driver.findElement(By.id("repeatedPassword")).sendKeys("098765");
        driver.findElement(By.className("button")).click();
        driver.quit();



    }
}
