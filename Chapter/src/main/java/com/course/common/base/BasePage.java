package com.course.common.base;

import com.course.util.StartChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    /*
    * 初始化driver
    * */
    private WebDriver driver;
    protected BasePage(){
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
    * input url
    * */
    protected void inputUrl(String url){
        this.driver.get(url);
    }


    /*
    * 封装By by
    * */
    private By byStr(String by, String locator){
        if (by.equals("id")){
            return By.id(locator);
        }
        else if (by.equals("name")){
            return By.name(locator);
        }
        else if (by.equals("classname")){
            return By.className(locator);
        }
        else if (by.equals("linktext")){

            return By.linkText(locator);
        }
        else {
            return By.xpath(locator);
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
    /*
    * 封装退出driver
    * */
    protected void quitDriver(){
        driver.quit();
    }

    /*
    * 显示等待
    * */

    /*
    * 切换页面
    * */


    /*
    * 鼠标移动到某个元素
    * */
    protected void moveToElement(String locator) {
        Actions action = new Actions(this.driver);
        action.moveToElement(searchElement(locator)).perform();
    }

    /*
    * 点击操作
    * */
    protected void click(String locator){
       searchElement(locator).click();

    }
}

