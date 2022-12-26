package com.Syntax.class09DynamicTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HwDynamicTables {
    /*
    http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
got to the url
click on PIM
click on Employee List
from the table choose one id (it must be from the first page)
and check the checkBox for that id   (your logic should be dynamic  , should work for any ID number)
the user name is
admin
the password is
Hum@nhrm123
     */
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
//Click "PIM"
        WebElement pim = driver.findElement(By.xpath("//b[text()='PIM']"));
        pim.click();

        //        check the checkBox that contains "41065A" in ID column
        //Grt the column
        List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));
//        traverse through the list
        //must be i=0 so will be loop all info in that column
        for (int i = 0; i < secondColumn.size(); i++) {
            String id=secondColumn.get(i).getText();

            if (id.equalsIgnoreCase("41065A")){
                int rowNumber=i+1;
                System.out.println("ID number is found on row number "+rowNumber);

//   get the checbkbox on Row number37 and click it
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (rowNumber) + "]/td[1]"));
            checkBox.click();
            }
        }
    }
}
