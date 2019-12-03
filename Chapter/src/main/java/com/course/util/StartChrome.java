package com.course.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {

//    WebDriver driver;
//    public StartChrome( WebDriver driver) {
//        this.driver=driver;
//    }

    public WebDriver Chrome(){
        System.setProperty("webdriver.chrome.driver","D:\\java_auotmate\\java_01\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        return driver;

    }



}
