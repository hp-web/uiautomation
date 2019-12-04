package com.course.common.case_01_page;

import com.course.PageObject.BaiduPageElementAddress;
import com.course.common.base.Base;

public class BaiduPage extends Base {
    public void openChromeAndBaidu(){
        getDriver().get("https://www.baidu.com");
    }
    public void inputMessageAndClickButton(){
        searchElement(BaiduPageElementAddress.INPUTXPATH).sendKeys("ithome");
        //serchElement("xpath",BaiduPageElementAddress.INPUTXPATH).sendKeys("ithome");
        searchElement("xpath",BaiduPageElementAddress.BAIDUBUTTON).click();

    }



}
