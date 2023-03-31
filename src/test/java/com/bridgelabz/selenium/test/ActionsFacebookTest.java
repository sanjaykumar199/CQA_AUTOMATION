package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsFacebookTest extends BaseClass {

    @Test
    public void actionClass_FacebookLoginScreen() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement email = driver.findElement(By.id("email"));
        Action seriesAction = actions.moveToElement(email)
                .click().keyDown(email, Keys.SHIFT)
                .sendKeys(email, "testing")
                .keyUp(email, Keys.SHIFT)
                .doubleClick(email)
                .build();
        seriesAction.perform();

       WebElement loginBtn = driver.findElement(By.name("login"));
       actions.moveToElement(loginBtn).click().perform();
       Thread.sleep(2000);
    }


}
