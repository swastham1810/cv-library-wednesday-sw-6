package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchTestSteps {
    @Given("User is on Homepage")
    public void userIsOnHomepage() {
        System.out.println("I am on Homepage.");
        new HomePage().clickOnAcceptCookies();
    }

    @When("User enter job title {string}")
    public void userEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("User enter Location {string}")
    public void userEnterLocation(String location) {
        new HomePage().enterJobLocation(location);
    }

    @And("User select distance {string}")
    public void userSelectDistance(String distance) {
        new HomePage().selectDistanceFromDropDownList(distance);
    }

    @And("User click on more Search Options Link")
    public void userClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionInBottom();
    }

    @And("User enter salaryMin {string}")
    public void userEnterSalaryMin(String salaryMin) {
        new HomePage().enterMinimumSalary(salaryMin);
    }

    @And("User enter salaryMax {string}")
    public void userEnterSalaryMax(String salaryMax) {
        new HomePage().enterMaximumSalary(salaryMax);
    }

    @And("User select salaryType {string}")
    public void userSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryTypeFromDropDownList(salaryType);
    }

    @And("User select jobType {string}")
    public void userSelectJobType(String jobType) {
        new HomePage().selectJobTypeFromDropDownList(jobType);
    }

    @And("User click on Find Jobs button")
    public void userClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("User verify the result {string}")
    public void userVerifyTheResult(String result) {
        new ResultPage().verifyTheResulTextOnResultPage(result);
    }
}
