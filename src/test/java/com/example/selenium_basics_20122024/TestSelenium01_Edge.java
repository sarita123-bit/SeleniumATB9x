package com.example.selenium_basics_20122024;

import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium01_Edge {

    @Description("Open the App.vwo.com and Get the title")
    @Test
    public void test_Selenium01() {

        // Open a URL
        // Print the title
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}