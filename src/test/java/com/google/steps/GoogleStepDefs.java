package com.google.steps;

import com.google.pages.GoogleHomePage;
import com.google.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class GoogleStepDefs {

    static String input;
    GoogleHomePage google;

    @Given("I entered {string} in the search input")
    public void i_entered_in_the_search_input(String searchInput) {

        google = new GoogleHomePage();
        input = searchInput;
        google.searchInput.sendKeys(input);
        google.searchButton.click();
    }

    @Then("entered data must match the title")
    public void entered_data_must_match_the_title() {
        String actual = Driver.getDriver().getTitle();
        String expected = input + " - Google Search";
        Assert.assertEquals(expected,actual);
    }

    @Then("assert page title contains entered words")
    public void assertPageTitleContainsEnteredWords() {
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(input));
    }
}
