package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FacebookTest extends BaseClass {

    @Test
    public void facebookWebsite_RedirectedOnToValidScreen() {
        driver.get("https://www.facebook.com/");
        String fbLoginTitle = driver.getTitle();
        Assert.assertEquals("Facebook – log in or sign up",fbLoginTitle);
    }

    @Test
    public void facebookWebsite_CreateNewAccount() throws InterruptedException {
        Thread.sleep(3000);
        WebElement createPopUp = driver.findElement(By.linkText("Create new account"));
        boolean flag = createPopUp.isDisplayed();
        Assert.assertEquals(true, flag);
        createPopUp.click();
        Thread.sleep(3000);


        driver.findElement(By.name("firstname")).sendKeys("Testing");
        driver.findElement(By.name("lastname")).sendKeys("Test");
        driver.findElement(By.name("reg_email__")).sendKeys("7530998373");
        driver.findElement(By.name("reg_passwd__")).sendKeys("absc6655");

        WebElement day = driver.findElement(By.id("day"));
        Select select = new Select(day);
        select.selectByValue("1");
//        select.deselectByIndex();
//        select.deselectByVisibleText();

        WebElement month = driver.findElement(By.id("month"));
        Select select1 = new Select(month);
        select1.selectByIndex(6);

        WebElement year = driver.findElement(By.id("year"));
        Select select2 = new Select(year);
        select2.selectByVisibleText("2022");
        Thread.sleep(300);

      boolean flag1 = select.isMultiple();
        if (flag1) {
            System.out.println("multiple selection not allowed");
        }
    }
    @Test
    public void facebookWebsite_RadioButtonTest() throws InterruptedException {
        Thread.sleep(3000);
        WebElement createPopUp = driver.findElement(By.linkText("Create new account"));
        boolean flag = createPopUp.isDisplayed();
        Assert.assertEquals(true, flag);
        createPopUp.click();
        Thread.sleep(3000);

       Boolean flag1 = driver.findElements(By.name("sex")).get(1).isSelected();
        if (flag1==false){
            driver.findElements(By.name("sex"));
        }

       List<WebElement> radio = driver.findElements(By.name("sex"));
        for (int i =0; i<radio.size(); i++){
            System.out.println(radio.get(i).getText());
            Thread.sleep(100);
                radio.get(i).click();
            }
        Thread.sleep(1000);
        }
    }

