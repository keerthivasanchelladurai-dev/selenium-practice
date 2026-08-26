package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class eighth {
    WebDriver driver;
    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
    }

    @Test
    public void firsttest(){
        driver.findElement(By.xpath("//input[@id = 'user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getTitle());
    }

    @AfterTest
    public void aftersetup(){
        driver.quit();
        System.out.println("the browsr closed");
    }
}
