package com.course.common;

import com.course.util.StartChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class moudle_1 {

    private WebDriver driver;

    private volatile  static moudle_1 moudle1;


    private moudle_1(){
        StartChrome startChrome = new StartChrome();
        this.driver = startChrome.Chrome();
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public void inputUrl(String url){
        this.driver.get(url);
    }


    public static  moudle_1 getMoudle1(){
         if(moudle1 == null){
             synchronized (moudle_1.class){
                 if(moudle1 == null){
                     moudle1 = new moudle_1();
                 }
             }
         }
         return moudle1;
    }

    public WebElement serchElement(String xPath){
        return  this.driver.findElement(By.xpath(xPath));
    }


}
