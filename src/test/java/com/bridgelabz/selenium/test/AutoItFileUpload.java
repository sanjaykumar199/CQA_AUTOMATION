package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItFileUpload extends BaseClass {
    @BeforeTest
    public void settUp() throws InterruptedException {
        initializationTest();
        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);
    }

    @Test
    public void fileUploadAutoIt() throws InterruptedException, IOException {
        WebElement chooseBtn = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[1]/label[1]/div[1]/div[1]/a[1]"));
        chooseBtn.click();
        Thread.sleep(1000);
        Runtime.getRuntime().exec("C:\\Users\\IT PARK\\Documents\\CQAfileupload.exe");
        Thread.sleep(500);
        System.out.println("File Successfully");
        Thread.sleep(1500);
    }

    @Test
    public void fileUploadSendKeys() throws InterruptedException {
        WebElement chooseBtn = driver.findElement(By.xpath("//body/main[1]/div[1]/div[1]/div[1]/div[2]/section[1]/label[1]/div[1]/div[1]/a[1]"));
        Thread.sleep(1000);
        chooseBtn.sendKeys("C:\\Users\\IT PARK\\Downloads\\pdfDownload.pdf");
        Thread.sleep(1500);

    }

    @AfterTest
    public void browserClose() {
        driver.close();
    }
}
