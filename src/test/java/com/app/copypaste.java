package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class copypaste {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
        Actions actions = new Actions(driver);
        WebElement firstelement = driver.findElement(By.xpath("//input[@id = 'userName']"));
        WebElement secondelement = driver.findElement(By.xpath("//input[@id='password']"));
        firstelement.sendKeys("keerthi");
        actions.keyDown(firstelement , Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        System.out.println("selected all completed ");
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        System.out.println("text copied ");
        actions.keyDown(secondelement , Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        System.out.println("pasted successfully");
    }
}
