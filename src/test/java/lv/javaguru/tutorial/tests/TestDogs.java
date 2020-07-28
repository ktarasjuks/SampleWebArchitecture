package lv.javaguru.tutorial.tests;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDogs {

    @Test
    public void findAPuppy() throws InterruptedException {
        String driverPath = ("C:\\Users\\tarkon\\IdeaProjects\\SampleWebArchitecture\\src\\test\\resources\\");
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com/");

        driver.findElementById("mtd_300").click();
        driver.findElementByXPath("//input[@class='some random name']");
        driver.findElementByCssSelector("input[class='some random name']");
        Thread.sleep(3000);
        driver.quit();
    }
}