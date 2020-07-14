package lv.javaguru.tutorial.tests;

import lv.javaguru.tutorial.pages.DogPage;
import lv.javaguru.tutorial.pages.HomePage;
import org.junit.Test;

public class DogPom {

    private DogPage dogPage = new DogPage();
    private HomePage homePage = new HomePage();


    @Test
    public void findAPuppy() throws InterruptedException {
        homePage.startBrowser();
        homePage.selectCategory("dog");
        dogPage.setAge("1", "2");
        Thread.sleep(3000);
        homePage.stopBrowser();
    }
}