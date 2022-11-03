package com.Syntax.class05;
//To get all Links on EbayL
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
driver.get("https://www.ebay.com/");

//
        //We found that all Links in Tagname "a"
        List<WebElement> ebayLinks = driver.findElements(By.tagName("a"));   //"findElements" = to get all Links
//
        System.out.println("the size of the list is :"+ebayLinks.size()); //Optional   //"the size of the list is :402"
//
        for(WebElement ebayLink : ebayLinks){
            //
            String Link= ebayLink.getAttribute("href");
            //
            System.out.println(Link);    //Get all Links under "href" in Ebay.com
        }
    }
}
