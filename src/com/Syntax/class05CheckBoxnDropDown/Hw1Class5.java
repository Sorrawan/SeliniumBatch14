package com.Syntax.class05CheckBoxnDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1Class5 {
    /*
    1.Go to facebook
2.click on create New Account
3.Fill out the whole form
4.Take screen shot of filled out form manually and share in HW channel along with code

     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.Go to facebook
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //2.click on create New Account, by using "contain text"
        driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
        Thread.sleep(2000);
        //3.Fill out the whole form
        driver.findElement(By.name("firstname")).sendKeys("Sorrawan");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Suter");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("sorrawan12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sorrawan12@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("9876543ab");
        Thread.sleep(2000);
        driver.findElement(By.name("birthday_month")).sendKeys("Mar");
        driver.findElement(By.id("day")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("1990");
        Thread.sleep(2000);
////get the radio button Female
        WebElement FemaleRadioBtn=driver.findElement(By.xpath("//label[text()='Female']"));
        //check if the radio btn is displayed
        boolean displayStatus = FemaleRadioBtn.isDisplayed();
        System.out.println("The radio button is Displayed :"+displayStatus);

        boolean selectStatus = FemaleRadioBtn.isSelected();
        System.out.println(selectStatus);

        if(!selectStatus){
            FemaleRadioBtn.click();
        }
        selectStatus=FemaleRadioBtn.isSelected();
        System.out.println("The radio button is selected :"+selectStatus);
    }
}

