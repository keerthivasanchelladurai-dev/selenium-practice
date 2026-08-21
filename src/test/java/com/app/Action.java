package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Action {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //first elemnt
        WebElement firstelement = driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
        WebElement secondelement = driver.findElement(By.xpath("//ol[@id ='amt8']//li[@class='placeholder']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(firstelement,secondelement).perform();


    }
}
