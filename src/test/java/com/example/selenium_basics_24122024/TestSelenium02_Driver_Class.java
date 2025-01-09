package com.example.selenium_basics_24122024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium02_Driver_Class {

    @Description("Open the URL")
    @Test
    public void test_Selenium01() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.manage().window().maximize();
        driver.manage().window().minimize();
    }
}
