package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class GoogleHomePage {
    public GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "q")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@value=\"Google Search\"]")
    public WebElement searchButton;

}