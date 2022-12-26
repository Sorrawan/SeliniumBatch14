package com.Syntax.class10Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class calendarPagination {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        // create a WebDriver instance
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //        maximize
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//Login
        WebElement userName = driver.findElement(By.name("txtUsername"));
        userName.sendKeys("admin");
        WebElement passWord = driver.findElement(By.id("txtPassword"));
        passWord.sendKeys("Hum@nhrm123");
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();

 //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

        boolean idFound=false;
        while(!idFound) {    //true
            //    get all the ids from the columns
            // using this code inside the loop so whenever the loop is keep looping then this page will keep refreshing
            //because we need this page to go along with our code according to there is always this page in every next table
            List<WebElement> columnID = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < columnID.size(); i++) {
//extract the id from the entry in list
                String id = columnID.get(i).getText();
//            check if it is the desired id
                if (id.equalsIgnoreCase("40907A")) {
//                check the checkbox associated with this particular  row
                    System.out.println("i have found the id on row number " + (i + 1));
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound=true;
                    break;
                }

            }
            if (!idFound){   //true
                WebElement clickNext = driver.findElement(By.xpath("//a[text()='Next']"));
                clickNext.click();
            }
        }

    }
}
