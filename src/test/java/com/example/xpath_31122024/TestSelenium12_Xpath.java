package com.example.xpath_31122024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium12_Xpath {

    @Description("Verify that with valid email, pass, error message is shown on the test_katalon_login")
    @Test
    public void test_katalon_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn.click();

        Thread.sleep(3000);


        // WITH THE ID
        //        WebElement username_input_box = driver.findElement(By.xpath("//input[@id='txt-username']"));
        //        username_input_box.sendKeys("John Doe");


        List<WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null

    }
}
