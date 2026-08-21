package app;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class fourth {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='alertButton']")).click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Alert Message: " + alert.getText());
        alert.accept();
        driver.quit();

    }

}
