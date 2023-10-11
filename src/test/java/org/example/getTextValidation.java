package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class getTextValidation {
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
    public void testSignInText() {
        String actualText =  driver.findElement(By.linkText("Sign In")).getText();
        System.out.println(actualText);

        //assertEquals("Text is not Equal. Test Failed",expectedText,actualText);
    }


    @After
    public void tearDown() {
        driver.close();

    }
}
