package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class ten {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.calculator.net/");
    }

    @Test
    public void test(){
        driver.findElement(By.xpath("//span[text()= '2']")).click();
        driver.findElement(By.xpath("//span[text()= '+']")).click();
        driver.findElement(By.xpath("//span[text()= '4']")).click();
        driver.findElement(By.xpath("//span[text()= '=']")).click();
        String output = driver.findElement(By.id("sciOutPut")).getText();
        System.out.println("Calculator Output: "+ output);
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}

