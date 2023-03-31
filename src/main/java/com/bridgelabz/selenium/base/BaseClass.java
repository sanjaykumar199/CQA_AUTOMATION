package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    public WebDriver driver;

  // @BeforeTest
    public void initializationTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        driver = new ChromeDriver(option);
        driver.manage().window().maximize();
       // driver.get("https://www.facebook.com/");
       // driver.get("https://www.guru99.com/selenium-tutorial.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

//  @AfterTest
    public void tearDown() {

        driver.close();
    }
}
