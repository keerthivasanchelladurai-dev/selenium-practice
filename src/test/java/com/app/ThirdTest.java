package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keerthi");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("vasan");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("k@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='street']")).sendKeys("1st cross");
        driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("btm");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='inputState']")));
        select.selectByVisibleText("Utah");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("203");
        driver.findElement(By.xpath("//button[@id='register-btn']")).click();
        System.out.println("registration complete");
        driver.quit();
    }
}