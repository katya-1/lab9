import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://swisstime.by/catalog/";
        String expectedNameWatch = "T-My Lady Automatic 18k Gold";

        driver.get(baseUrl);
        driver.findElement(By.cssSelector(".search")).click();
        driver.findElement(By.id("title-search-input")).sendKeys(expectedNameWatch);
        Thread.sleep(2000);
        String realNameWatch = driver.findElement(By.cssSelector(".header-search-result .st-card__model")).getText();
        driver.quit();
        assertEquals(realNameWatch, expectedNameWatch);
    }
}
