import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchFlipkart {

    public SearchFlipkart() {

    }

    @BeforeClass
    public void launchBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\browser\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchOnFlipkartAndValidateResults() {
        String expectedLapotopString = "Lenovo Ideapad 130 Core i3 7th Gen - (4 GB/1 TB HDD/Windows 10 Home) 130-15IKB Laptop";
        driver.get("http://www.flipkart.com/");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@title="Search for products, brands
        and more "]")));

        Actions act = new Actions(driver);
        WebElement mainmenu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]"));
        act.moveToElement(mainmenu).build().perform();//taking mouse
        WebElement mobiles = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[1]/a"));
        mobiles.click();//clicking on mobiles

        driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys("laptops");
        driver.findElement(By.xpath("//div[@class='O8ZS_U']/input")).sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@title='HP']//div[@class='_1p7h2j']");
        WebElement laptopElement = driver.findElemet(By.xpath("//div[@class='_3wU53n']"));
        boolean isElementDisplayed = laptopElement.isDisplayed();
        Assert.assertEquals(isElementDisplayed, true);
        Assert.assertEquals(laptopElement.getText()), expectedLapotopString);
    }
}