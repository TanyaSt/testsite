package com.edea;

/**
 * Created by Tanya on 23.02.2017.
 */
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


      public class TestSite_Edea {
        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();

        @BeforeClass(alwaysRun = true)
        public void setUp() throws Exception {
            driver = new FirefoxDriver();
            baseUrl = "http://www.edea.co.il/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @Test
        public void testEdea() throws Exception {
            driver.get(baseUrl + "/");
            driver.findElement(By.cssSelector("span.ubermenu-target-title.ubermenu-target-text")).click();
            driver.findElement(By.xpath("//li[@id='menu-item-4046']/a/span")).click();
            driver.findElement(By.linkText("אודות אידאה")).click();
            driver.findElement(By.xpath("//li[@id='menu-item-105']/a/span")).click();
            driver.findElement(By.xpath("//li[@id='menu-item-4053']/a/span")).click();
            driver.findElement(By.xpath("//div[@id='accordion-242-1']/div[3]/div/h4/a/div/i")).click();
            driver.findElement(By.xpath("//div[@id='accordion-242-1']/div[4]/div/h4/a/div/i")).click();
            driver.findElement(By.cssSelector("a.active > div.fusion-toggle-icon-wrapper > i.fa-fusion-box")).click();
        }

        @AfterClass(alwaysRun = true)
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }


