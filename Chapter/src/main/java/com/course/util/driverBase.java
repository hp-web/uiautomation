package com.course.util;

import org.openqa.selenium.WebDriver;

public class driverBase {
    private WebDriver driver;
    public driverBase(){
        StartChrome startChrome = new StartChrome();
        this.driver = startChrome.Chrome();
    }

//    public void quitDriver(){
//        driver.quit();
//    }

}
