package com.edea;

/**
 * Created by Tanya on 23.02.2017.
 */
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.edea.pages.SiteEdeaHomepage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


      public class SiteEdeaTest {
        public   WebDriver driver;
        public SiteEdeaHomepage siteEdeaHomepage;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.edea.co.il/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            siteEdeaHomepage = PageFactory.initElements(driver, SiteEdeaHomepage.class);

        }

          @Test(groups = {"smoke"})
          public void FamiliarityWithTheHomePageSite() {
              try {

                  //siteEdeaHomepage.openMainPage();
                  siteEdeaHomepage.search_button();
                  siteEdeaHomepage.home_button();
                  siteEdeaHomepage.AboutIDEA_button();
                  siteEdeaHomepage.Products_button();
                  siteEdeaHomepage.Solutions_button();
                  siteEdeaHomepage.support_button();
                  siteEdeaHomepage.button_Customers();
                  siteEdeaHomepage.button_Partners();
                  siteEdeaHomepage.button_ContactUs();

              } catch (Exception e) {
                  e.printStackTrace();
              }

          }


          @AfterTest(alwaysRun = true)
          public void tearDown() {
              this.driver.quit();
          }


          }
