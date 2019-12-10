package com.course.allcase.baidupage;

import com.course.common.pagehandle.ItHomePage;
import org.testng.annotations.Test;

public class ItHomeCase_01 extends ItHomePage {

    @Test
    public void testWin10Home(){
        interIthomePage("https://www.ithome.com/");
        mouseMoveToItHome("//*[@id=\"nav\"]/div[1]/a");
        clickWin10Home("//*[@id=\"nav\"]/div[1]/div/div[1]/div[3]/ul/li[2]/span/a");

    }
}
