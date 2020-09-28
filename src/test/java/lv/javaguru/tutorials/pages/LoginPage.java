package lv.javaguru.tutorials.pages;

import lv.javaguru.tutorials.common.Common;
import lv.javaguru.tutorials.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginPage extends Common {

    private By username = By.id("f_o_1276_min");
    private By password = By.id("f_o_1276_max");
    private By email = By.xpath("//input[contains(@href, '/account/login/')]");

    private User user = new User();

    public void login(){
        driver.findElement(username).sendKeys(user.getUsername());
        WebElement someRandomElement = driver.findElement(By.className("babalsblslba"));
        String errorMessage = someRandomElement.getText();
        assertThat(errorMessage).isEqualTo("nlsnslnlnal");
    }

}
