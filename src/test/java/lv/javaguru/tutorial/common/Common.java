package lv.javaguru.tutorial.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {

    public static WebDriver driver;

    public void startBrowser() {
        String driverpath = "C:\\Users\\Tarkon\\IdeaProjects\\ForTutorial\\src\\main\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverpath + "chromedriver.exe");
         driver = new ChromeDriver();
//        driver.get("https://www.ss.com/lv/");
    }

    public void stopBrowser() {
        driver.quit();
    }
}
