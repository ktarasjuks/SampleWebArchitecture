package lv.javaguru.tutorials.tests;

import lv.javaguru.tutorials.pages.LoginPage;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class JanaRozeLoginTest {

    private LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest() {

        loginPage.login();
        assertThat("bblaba").isEqualTo("blababla2");
    }


}
