package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Hw2Class5 {
    /*
    1.Go to ebay.com
2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
3.select Computers/Tables & Networking
4.click on search
5.verify the title
     */
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
        driver.get("https://www.ebay.com/");

        //2.get all the categories and print them in the console (in search bar you will see catogeries mentioned as dropdown)
        //We found that all Links in Tagname "option"
        WebElement categeries = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select=new Select(categeries);

        List<WebElement> Alloptions = select.getOptions();
        for (int i = 0; i < Alloptions.size(); i++) {
            WebElement all=Alloptions.get(i);
            String text=all.getText();
            System.out.println(text);
        }
//3.select Computers/Tables & Networking
        // select.selectByIndex(11);
        //OR
        select.selectByValue("58058");
//4.click on search
        WebElement clickSearch = driver.findElement(By.xpath("//input[@value='Search']"));
        clickSearch.click();

        System.out.println("*****************************");
//5.verify the title   => "driver.getTitle();" => we get the title of the particular/current page
        //Actual "Title" will always be in DOM. so search for Title in DOM by "//title"
        String title= driver.getTitle();
        System.out.println("Title of the current page is "+title);
    }
}
