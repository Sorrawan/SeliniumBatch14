package com.Syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    public static void main(String[] args) {
        // Set the path to driver to lonk it with our class on window we need .exe
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //Create a WebDriver instance
        WebDriver driver = new ChromeDriver();

        //Go to ebay.com
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        // maximize
        driver.manage().window().maximize();

        //Find the WebElement  ที่เราจะใช้
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='select-demo']"));

        //Use Select class
        Select select = new Select(dropDown);     //พอได้WebElement ก็เอามาใส่ใน select  ภายใต้ชื่อที่เราตั้ง

        //1.Select an option by index
        //In under select class there are <option>.....</option> and "Thursday is on "index 5""
       // select.selectByIndex(5);   //Don't foget that in index start with 0,1,2,3   //Thursday are in "index5"

                //Or
        //2.select by visible Text   //textที่ เราเหนว่าเปน ช้อยให้เลือกที่เราเหนในหน้าเว็บได้
        //select.selectByVisibleText("Saturday");

                //Or

        //3.select by Value   ใน value="Saturday"
        select.selectByValue("Sunday");


        //**Get all the options that are available to us in the dropdown
        List<WebElement> options = select.getOptions();

        //Traverse through the options
        for (int i = 0; i < options.size(); i++) {
            WebElement option = options.get(i);
            // System.out.println(option.getText()); // to get all options that shows in console
            String text= option.getText();
            if(text.equalsIgnoreCase("Friday")){
                select.selectByIndex(i);   // Then "Friday" will be selected in dropdown on the webpage
            }
        }

    }


    }

