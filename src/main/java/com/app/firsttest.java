package com.app;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firsttest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        System.out.println(driver.getTitle());
        if(driver.getCurrentUrl().contains("inventory.html")){
            System.out.println("login successfull");
        }
        else{
            System.out.println("login faild");
        }
        driver.quit();
    }
}
