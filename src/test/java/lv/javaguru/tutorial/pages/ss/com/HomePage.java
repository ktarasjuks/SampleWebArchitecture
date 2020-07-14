package lv.javaguru.tutorial.pages.ss.com;

import org.openqa.selenium.By;

public class HomePage extends Common{

    private By selectDog = By.id("mtd_300");

    public void selectCategory(String category){
        if ("dog".equals(category)){
            driver.findElement(selectDog).click();
        }
        else {}
    }


}
