package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenUrl {

    //Requirement- Let's Open 3 different websites
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();  //setup the driver
        WebDriver driver = new ChromeDriver();    //create a new driver

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.quit();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        driver.manage().window().maximize();
        driver.get("https://next.co.uk/");


        driver.manage().window().maximize();
        driver.get("https://diy.com/");


        driver.close();

    }

}
