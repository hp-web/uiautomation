package com.course.common.base;

import com.course.util.StartChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
    /*
    * 初始化driver
    * */
    private WebDriver driver;
    protected Base(){
        StartChrome startChrome = new StartChrome();
        this.driver = startChrome.Chrome();
    }
    /*
    * 获取driver的方式
    * */
    protected WebDriver getDriver(){
        return this.driver;
    }
    /*
    * 封装By by
    * */
    private By byStr(String by, String lcator){
        if (by.equals("id")){
            return By.id(lcator);
        }
        else if (by.equals("name")){
            return By.name(lcator);
        }
        else if (by.equals("classname")){
            return By.className(lcator);
        }
        else {
            return By.xpath(lcator);
        }
    }

    /*
    * 封装WebElement
    * */
    protected WebElement searchElement(String locator){

        return  this.driver.findElement(By.xpath(locator));
    }
    protected WebElement searchElement(String by,String locator){

        return  this.driver.findElement(byStr(by,locator));
    }


}

