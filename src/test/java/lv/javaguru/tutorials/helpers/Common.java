package lv.javaguru.tutorials.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static WebDriver driver;

    public void startBrowser(String url) {
        String driverpath = "C:\\Users\\tarkon\\IdeaProjects\\SampleWebArchitecture\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(url);
    }

    public void stopBrowser() {
        driver.quit();
    }
}
