package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

/**
 * HomePage -
 * Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin, salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn
 * Methods - enterJobTitle(String jobTitle), enterLocation(String location), selectDistance(String distance), clickOnMoreSearchOptionLink(),
 * enterMinSalary(String minSalary),  enterMaxSalary(String maxSalary), selectSalaryType(String sType), selectJobType(String jobType),
 * clickOnFindJobsButton().
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[@class='mat-button-wrapper']//span[text()='Accept All']")
    WebElement cookies;

    @CacheLookup
    @FindBy(xpath = "//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;
    @CacheLookup
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitle1;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='location'])[1]")
    WebElement location1;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance1;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOption;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement minSalary;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement maxSalary;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryType1;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobType1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement searchButton;



    // * Accept cookies
    public void clickOnAcceptCookies() {
        // Switch to frame
       driver.switchTo().frame(acceptIFrame);
       //Click on element
        mouseHoverToElementAndClick(cookies);
        //Switch to default content
        driver.switchTo().defaultContent();
        log.info("click On Accept Cookies : " + cookies.toString());

    }

    // *      enter job title 'jobTitle'
    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobTitle1, jobTitle);
        log.info("enter JobTitle : " + jobTitle1.toString());
    }

    // *     enter Location 'location'
    public void enterJobLocation(String location) {
        sendTextToElement(location1, location);
        log.info("enter Job Location : " + location1.toString());
    }

    // *     select distance 'distance'
    public void selectDistanceFromDropDownList(String distance) {
        selectByVisibleTextFromDropDown(distance1, distance);
        log.info("select Distance From Drop Down List : " + distance1.toString());
        // sendTextToElement(distance1, distance);
    }

    // * 	click on moreSearchOptionsLink
    public void clickOnMoreSearchOptionInBottom() {
        clickOnElement(moreSearchOption);
        log.info("click On More Search Option In Bottom : " + moreSearchOption.toString());
    }

    // *     enter salaryMin 'salaryMin'
    public void enterMinimumSalary(String salaryMin) {
        sendTextToElement(minSalary, salaryMin);
        log.info("enter Minimum Salary : " + minSalary.toString());
    }

    // *     enter salaryMax 'salaryMax'
    public void enterMaximumSalary(String salaryMax) {
        sendTextToElement(maxSalary, salaryMax);
        log.info("enter Maximum Salary : " + maxSalary.toString());
    }

    // * 	select salaryType 'salaryType'
    public void selectSalaryTypeFromDropDownList(String salaryType) {
        selectByVisibleTextFromDropDown(salaryType1, salaryType);
        log.info("select Salary Type From Drop Down List : " + salaryType1.toString());
    }

    // * 	select jobType 'jobType'
    public void selectJobTypeFromDropDownList(String jobType) {
        selectByVisibleTextFromDropDown(jobType1, jobType);
        log.info("select Job Type From Drop Down List : " + jobType1.toString());
    }

    // * 	click on 'Find Jobs' button
    public void clickOnFindJobsButton() {
        clickOnElement(searchButton);
        log.info("click On Find Jobs Button : " + searchButton.toString());
    }
}


