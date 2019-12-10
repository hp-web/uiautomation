package com.course.allcase.baidupage;

import com.course.common.pagehandle.BaiduPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case01 extends BaiduPage {
    @BeforeTest
    public void open_Browser_Url(String url){
        openChromeAndInputUrl("http://www.baidu.com");
    }
    @Test
    public void sesrchItHome(String message) throws InterruptedException {
        inputMessageAndClickButton("ithome");
        closeBrowser();
    }


}
