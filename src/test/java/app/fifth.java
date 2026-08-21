package app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class fifth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                        .pollingEvery(Duration.ofSeconds(2))
                                .ignoring(NoSuchElementException.class);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("keerthi");

        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='register-btn']")));
        button.click();
    }
}
