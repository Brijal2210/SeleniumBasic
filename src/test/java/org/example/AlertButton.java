package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertButton {
    public WebDriver driver;
    public String url = "https://www.letskodeit.com/practice";

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        String expectedText = "Sign In";
    }
    @Test
    public void testAlertButton(){
        driver.findElement(By.id("name")).sendKeys("Brijal Chothani");


    }
    @Test
    public void clickConfirmBtn(){
        driver.findElement(By.id("name")).sendKeys("Brijal Chothani");

    }



        @After
    public void tearDown() {
        driver.close();}
}
