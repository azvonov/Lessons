package com.example.test;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.fail;

public class CreditCalc {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    private void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://finance.liga.net";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testCreditCalc() throws Exception {
        driver.get(baseUrl + "/finmarket/calculators.htm");
        driver.findElement(By.id("txtSumOfCredit")).clear();
        driver.findElement(By.id("txtSumOfCredit")).sendKeys("100000");
        driver.findElement(By.id("credit_count_months")).clear();
        driver.findElement(By.id("credit_count_months")).sendKeys("36");
        driver.findElement(By.id("percent_credit")).clear();
        driver.findElement(By.id("percent_credit")).sendKeys("12");
        new Select(driver.findElement(By.id("type"))).selectByVisibleText("Классический (% на остаток задолженности)");
        driver.findElement(By.cssSelector("#credit_form > input.btn")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='credit_result2']/div[2]")).getText(), "2805.56");
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

