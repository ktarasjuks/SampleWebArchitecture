package lv.javaguru.tutorial.pages;

import lv.javaguru.tutorial.common.Common;
import org.openqa.selenium.By;

public class DogPage extends Common {

    private By minAge = By.id("f_o_1276_min");
    private By maxAge = By.id("f_o_1276_max");
    private By searchButton = By.xpath("//input[@type='submit']");

    public void setAge(String min, String max) {
        driver.findElement(minAge).sendKeys(min);
        driver.findElement(maxAge).sendKeys(max);
        driver.findElement(searchButton).click();
    }
}