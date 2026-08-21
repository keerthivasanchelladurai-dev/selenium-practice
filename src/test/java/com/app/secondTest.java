package com.app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class secondTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
        // 1. Initialize the wait object with a maximum timeout of 10 seconds
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

// Pause until the specific element is visible on the page
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keerthi");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("vasan");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("keerthi@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//input[@name='street']")).sendKeys("1st main street cross");
        driver.findElement(By.xpath("//input[@name = 'city']")).sendKeys("thottiyam");
        Select select = new Select(driver.findElement(By.xpath("//select[@id='inputState']")));
        select.selectByVisibleText("Utah");
        driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("621203");
//        driver.findElement(By.xpath("//button[@id='register-btn']")).click();
//        driver.findElement(By.xpath("//a[text()='go-to-flights-search']")).click();
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='register-btn']")));
        element.click();
    }
}
