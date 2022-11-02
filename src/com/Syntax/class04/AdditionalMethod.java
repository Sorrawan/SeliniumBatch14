package com.Syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionalMethod {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

 //Find the WebElement button
        WebElement btn= driver.findElement(By.cssSelector("button#buttoncheck"));

        // Get the text from the btnWebElement
        String text=btn.getText();

  //        print it on console
        System.out.println(text);

//Get the value of the attribute "id" from this WebElement
        String idvalue = btn.getAttribute("id");

//Print it on the console
        System.out.println("the value of the attribute id is "+idvalue);


    }
}
