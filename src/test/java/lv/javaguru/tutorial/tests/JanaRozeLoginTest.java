package lv.javaguru.tutorial.tests;

import lv.javaguru.tutorial.common.Common;
import lv.javaguru.tutorial.models.User;
import lv.javaguru.tutorial.pages.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;


public class JanaRozeLoginTest {

    private LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest() {

        loginPage.login();
        assertThat("bblaba").isEqualTo("blababla2");
    }


}
