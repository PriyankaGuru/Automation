package src.test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LinkedInLogin {

    public LinkedInLogin()
    {

    }

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void login() {
        String actualUrl = "https://www.linkedin.com/feed/";
        driver.get("https://www.linkedin.com/login");
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Sign in']"));
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
        login.click();

        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        driver.quit();
    }
}