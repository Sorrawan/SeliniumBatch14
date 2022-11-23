package com.Syntax.class08Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HwWait {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        maximize
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
 //click on checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
//and click on remove
        WebElement clickOnRemove = driver.findElement(By.xpath("//button[text()='Remove']"));
        clickOnRemove.click();
 //verify the text
        WebElement text = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("Verify the text: "+text.getText());

        WebDriverWait wait=new WebDriverWait(driver,20);    //explicit wait
 //click on enable verify the textbox is enabled
        WebElement cEnable = driver.findElement(By.xpath("//button[text()='Enable']"));
        cEnable.click();

        WebElement textEnabled = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("Verify the textbox: "+textEnabled.getText());
 //enter text
        WebElement enterText = driver.findElement(By.xpath("//input[@type='text']"));
        enterText.sendKeys("text");
 //and click disable
        WebElement cDisable = driver.findElement(By.xpath("//button[text()='Disable']"));
        cDisable.click();
 //verify the textbox is disabled
        WebElement textBoxDisabled = driver.findElement(By.xpath("//p[@id='message']"));
        System.out.println("Verify the textbox: "+textBoxDisabled.getText());

    }
}
