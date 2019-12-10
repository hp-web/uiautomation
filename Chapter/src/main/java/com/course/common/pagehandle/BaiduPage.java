package com.course.common.pagehandle;

import com.course.PageObject.BaiduPageElementAddress;
import com.course.common.base.BasePage;

public class BaiduPage extends BasePage {



    protected void openChromeAndInputUrl(String url){
        getDriver().get(url);
    }


    protected void inputMessageAndClickButton(String message) throws InterruptedException {
        searchElement(BaiduPageElementAddress.INPUTXPATH).sendKeys(message);
        //serchElement("xpath",BaiduPageElementAddress.INPUTXPATH).sendKeys("ithome");
        searchElement("xpath",BaiduPageElementAddress.BAIDUBUTTON).click();
    }


    protected void closeBrowser(){
        quitDriver();
    }



}
