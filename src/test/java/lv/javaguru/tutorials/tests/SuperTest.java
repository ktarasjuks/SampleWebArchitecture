package lv.javaguru.tutorials.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuperTest {


    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void Test1() {
        driver.get("https://www.janisroze.lv/");

//        Actions hover = new Actions(driver);
//
//        WebElement Elem_to_hover = driver.findElement(By.xpath("//a[contains(@href, '/account/login/')]\""));
//
//        hover.moveToElement(Elem_to_hover);
//
//        hover.build();
//
//        hover.perform();
        driver.findElement(By.xpath("//*[@id=\"header-account\"]/ul/li")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.findElement(By.id("mtd_300")).click();
//        driver.findElement(By.id("mtd_300")).sendKeys(Keys.ENTER);
//        driver.findElement(By.className("34dfs")).click();
//        driver.findElement(By.cssSelector("input[class='b s12']")).click();
//        driver.findElement(By.xpath("//input[@class='b s12']")).click();
    }
}


