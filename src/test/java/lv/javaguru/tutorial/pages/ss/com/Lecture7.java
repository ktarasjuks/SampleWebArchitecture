package lv.javaguru.tutorial.pages.ss.com;

import org.junit.Test;

public class Lecture7 {

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