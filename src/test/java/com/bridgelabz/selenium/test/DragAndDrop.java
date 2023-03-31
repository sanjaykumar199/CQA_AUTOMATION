package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseClass {
    @BeforeTest
    public void SetUp() throws InterruptedException {
        initializationTest();
        driver.get("https://jqueryui.com/droppable/");
        Thread.sleep(2000);
    }

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
        WebElement dragElement = driver.findElement(By.id("draggable"));
        Actions action = new Actions(driver);
        action.clickAndHold(dragElement).perform();
        Thread.sleep(2000);

        WebElement dropElement = driver.findElement(By.id("droppable"));
        action.dragAndDrop(dragElement, dropElement).perform();
        Thread.sleep(2000);

        driver.switchTo().parentFrame();
        action.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
        action.keyUp(Keys.CONTROL).sendKeys(Keys.END).perform();
        Thread.sleep(2000);

//        action.keyDown(Keys.CONTROL).sendKeys(Keys.HOME);
//        action.keyUp(Keys.CONTROL).sendKeys(Keys.HOME);
      //  Thread.sleep(2000);

    }

    @AfterTest
    public void driverTearDown() {
        tearDown();
    }
}
