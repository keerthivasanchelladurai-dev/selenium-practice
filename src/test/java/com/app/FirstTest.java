package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void loginTest() {

        System.out.println("Login test started");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");

        driver.findElement(By.name("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button"))
                .click();

        System.out.println(driver.getTitle());

        if (driver.getCurrentUrl().contains("inventory.html")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        driver.quit();

        System.out.println("Login test completed");
    }
}