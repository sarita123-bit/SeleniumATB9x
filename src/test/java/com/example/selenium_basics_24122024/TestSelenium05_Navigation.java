package com.example.selenium_basics_24122024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium05_Navigation {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() throws Exception {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // 95%


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
