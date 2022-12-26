package com.Syntax.class05CheckBoxnDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multipleSelectDropDown {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // maximize
        driver.manage().window().maximize();

        // find the WebElement that contains the select class
        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));

//        //using select class
        Select sel=new Select(DD);

//       // 1. By index
        sel.selectByIndex(3);
//        //2. by visible text
        sel.selectByVisibleText("Texas");

        //++Then "New York" and "Texas" get selected. We can use diff method to select 2 choices becuz in the code
        //they already set the code to be multiple selected on their website.

    //deselect by index
        // sel.selectByIndex(3);   // then "New york" will be un-selected

        // Write down the code to select all the options in the drop-Down
        List<WebElement> options = sel.getOptions();  //"getOptions()" = To get all selected options in the list
        for (int i = 0; i < options.size(); i++) {
            sel.selectByIndex(i);
        }
Thread.sleep(2000);
        // De-select all of them
        sel.deselectAll();

        //how can you check if the drop-down is multi select or not by using selenium?
        boolean multiSelect = sel.isMultiple();
        System.out.println(multiSelect);   //If "true" mean it is "multi select"

    }
}



