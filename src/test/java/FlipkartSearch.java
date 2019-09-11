import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchFlipkart{

    public SearchFlipkart()
    {

    }

    @BeforeClass
    public void launchBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

   }