package com.Syntax.reviewClass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxes {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Open the website
        driver.get("https://www.ironspider.ca/forms/checkradio.htm");

//Find the checkboxes
       //This way will return the list of all WebElements
        List<WebElement> checkbxes = driver.findElements(By.xpath("//input[@name='color']"));

       //Now it contains 6 WebElements

        for(WebElement checkBx:checkbxes){

            String color = checkBx.getAttribute("value");

            if(color.equalsIgnoreCase("orange")){
                checkBx.click();
                break;      //So after it found "orange", it will stop running the code. Help to not wasting time.
            }


        }



    }
}