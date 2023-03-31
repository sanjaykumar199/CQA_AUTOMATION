package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookFileUpload extends BaseClass {

    @BeforeTest
    public void settUp() throws InterruptedException {
        initializationTest();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
    }

    @Test
    public void fileUploadAutoIt() throws InterruptedException, IOException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("sanjaymrp777@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("sanju@12345");
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();
       // js.executeScript("arguments[0].click()", loginBtn);
        Thread.sleep(3000);


        WebElement clickOnPhoto = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]"));
        clickOnPhoto.click();
        Thread.sleep(500);

        WebElement selectPhoto = driver.findElement(By.xpath("//body/div[@id='mount_0_0_ID']/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]"));
        selectPhoto.click();
        Thread.sleep(500);

        Runtime.getRuntime().exec("C:\\Users\\IT PARK\\Documents\\CQAfileupload.exe");
        Thread.sleep(500);
        System.out.println("File Successfully");
    }

    @AfterTest
    public void browserClose() {
        driver.close();
    }
}
