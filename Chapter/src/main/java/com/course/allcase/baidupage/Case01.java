package com.course.allcase.baidupage;

import com.course.common.case_01_page.BaiduPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Case01 extends BaiduPage {
    @BeforeTest
    public void open_Browser_Url(){
        openChromeAndBaidu();
    }
    @Test
    public void sesrchItHome(){
        inputMessageAndClickButton();
    }


}
