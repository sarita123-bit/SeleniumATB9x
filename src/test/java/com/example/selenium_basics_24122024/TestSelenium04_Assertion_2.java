package com.example.selenium_basics_24122024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium04_Assertion_2 {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {

        //
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("CURA Healthcare Service is visible!");
            Assert.assertTrue(true);
        } else {
            throw new Exception("CURA Healthcare Service is Not visible.");
        }

    }
}
