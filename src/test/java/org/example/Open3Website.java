package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open3Website {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();

         driver1.manage().window().maximize();
         driver1.get("https://www.diy.com/");


         driver1.manage().window().maximize();
         driver1.get("https://www2.hm.com/en_gb/index.html");


         driver1.manage().window().maximize();
         driver1.get("https://www.tkmaxx.com/uk/en/");
         driver1.close();
    }
}
