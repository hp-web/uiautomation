package com.course.common.pagehandle;

import com.course.common.base.BasePage;

public class ItHomePage extends BasePage {

    protected void interIthomePage(String url){
        getDriver().get(url);
    }
    protected void mouseMoveToItHome(String locator){
        moveToElement(locator);
    }
    protected void clickWin10Home(String locator){
        click(locator);

    }
    protected void clickIpadHome(String locator){
        click(locator);
    }



}
