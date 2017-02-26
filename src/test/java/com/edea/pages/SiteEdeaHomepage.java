package com.edea.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Sample page
 */
 public class SiteEdeaHomepage extends Page {


    @FindBy(xpath = "//*[@id='menu-item-4853']//i[@class='ubermenu-icon fa fa-search']")
    WebElement search_button;

    @FindBy(xpath = "//*[id='menu-item-menu-item-4293']//a[@class='ubermenu-icon fa fa-home']")
    WebElement home_button;

    @FindBy(xpath = "//*[@id='home']//i[@class='fusion-header-wrapper']")
    WebElement afterPressedPageDoesNotSwitch;

    @FindBy(xpath = "//*[@id='menu-item-4046']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement AboutIDEA_button;

    @FindBy(xpath = "//*[@id='menu-item-229']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement Products_button;

    @FindBy(xpath = "//*[@id='menu-item-1129']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement Solutions_button;

    @FindBy(xpath = "//*[@id='menu-item-1128']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement support_button;

    @FindBy(xpath = "//*[@id='menu-item-1613']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement button_Customers;

    @FindBy(xpath = "//*[@id='menu-item-168']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement button_Partners;

    @FindBy(xpath = "//*[@id='menu-item-1001']//a[@class='ubermenu-target-title ubermenu-target-text']")
    WebElement button_ContactUs;

    @FindBy(xpath = "//*[@id='butsend']//i[@class='ajax-loader']")
    WebElement isOnContactUsPage;



    public SiteEdeaHomepage(WebDriver driver) {
        super(driver);
        this.PAGE_URL = "http://www.edea.co.il";
        PageFactory.initElements(driver, this);

    }

    public SiteEdeaHomepage openMainPage(WebDriver driver) {
        driver.get(PAGE_URL);
        return this;
    }

    public SiteEdeaHomepage search_button() {
        clickElement(search_button);
        return this;
    }

    public SiteEdeaHomepage home_button() {
        clickElement(home_button);
        return this;
    }
    public SiteEdeaHomepage AboutIDEA_button() {
        clickElement(AboutIDEA_button);
        return this;
    }
    public SiteEdeaHomepage Products_button() {
        clickElement(Products_button);
        return this;
    }
    public SiteEdeaHomepage Solutions_button() {
        clickElement(Solutions_button);
        return this;
    }
    public SiteEdeaHomepage support_button() {
        clickElement(support_button);
        return this;
    }
    public SiteEdeaHomepage button_Customers() {
        clickElement(button_Customers);
        return this;
    }
    public SiteEdeaHomepage button_Partners() {
        clickElement(button_Partners);
        return this;
    }
    public SiteEdeaHomepage button_ContactUs() {
        clickElement(button_ContactUs);
        return this;
    }

    public boolean isOnContactUsPage() {
       // waitUntilElementIsLoaded();
        return exists(isOnContactUsPage);
    }
    public boolean afterPressedPageDoesNotSwitch() {
        // waitUntilElementIsLoaded();
        return exists(afterPressedPageDoesNotSwitch);
    }

}
