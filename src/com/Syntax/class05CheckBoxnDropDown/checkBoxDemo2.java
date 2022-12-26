package com.Syntax.class05CheckBoxnDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkBoxDemo2 {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
        driver.get("http://syntaxprojects.com/basic-checkbox-demo.php");

        // maximize
        driver.manage().window().maximize();


        //find all the checkboxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));

        // traverse through list of checkboxes to find the desired one
        for(WebElement checkBox:checkBoxes){
// get the attribute value to check if this is the right option to select
            String optionName = checkBox.getAttribute("value");   //""value"" => All option 1-4 are in "Value attribute" then we use this attribute
//            if condition to make sure it is the right checkbox
            if(optionName.equalsIgnoreCase("Option-2")){     //Option-2  ตัวที่เลือกคลิก  //"equalsIgnoreCase" becuz
//                if passed click on it
                checkBox.click();
            }
        }
    }
}