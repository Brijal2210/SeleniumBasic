package org.example;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open3urlWithJunit{
    public WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
     public  void OpennopCommerce() throws InterruptedException {
         driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("Email")).sendKeys("brijchothani22@gmail.com");
        driver.findElement(By.name("Password")).sendKeys("123456789");
        Thread.sleep(3000);
        driver.findElement(By.className("login-button")).click();}
       @Test
        public  void openRegistration() throws InterruptedException {
           driver.get("https://demo.nopcommerce.com/");
           driver.findElement(By.className("ico-register")).click();
           Thread.sleep(3000);
           driver.findElement(By.xpath("//label[text()='Male']"));
           driver.findElement(By.id("gender-male")).click();
           driver.findElement(By.id("FirstName")).sendKeys("Brijal");
           driver.findElement(By.xpath("//input[@data-val-required='Last name is required.']")).sendKeys("chothani");
           driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("brijchothani22@gmail.com");
           Thread.sleep(3000);

       }
    @Test
    public  void openNext() throws InterruptedException {
        driver.get("https://www.next.co.uk/");
        Thread.sleep(8000);

    }
    @Test
    public  void OpenBandQ() throws InterruptedException {
        driver.get("https://www.diy.com/");
        Thread.sleep(8000);
    }
    @After
     public void tearDown(){
        driver.close();
    }
}
