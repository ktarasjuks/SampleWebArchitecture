package lv.javaguru.tutorials.stepDefinitions;

import lv.javaguru.tutorials.helpers.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("^I open web (.*)$")
    public void iOpenWeb(String url) {
        Common common = new Common();
        common.startBrowser(url);

    }

    @When("^I open (dogs|cars) tab$")
    public void iOpenDogsTab(String type) {
    }

    @Then("I change dog age min to {int}")
    public void iChangeDogAgeMinTo(int arg0) {
    }

    @And("I change dog age max to {int}")
    public void iChangeDogAgeMaxTo(int arg0) {
    }
}
