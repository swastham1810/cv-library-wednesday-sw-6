package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.utility.Utility;

/**
 * ResultPage
 * Locators - resultText
 * Method - verifyTheResults(String expected)
 */
public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    @CacheLookup
    @FindBy(className = "search-header__title")
    WebElement result1;

    // * 	verify the result 'result'

    public void verifyTheResulTextOnResultPage(String result) {
        verifyThatTextIsDisplayed(result1, result);
        System.out.println(result);
        log.info("verify The Resul Text On Result Page : " + result1.toString());
    }

}
