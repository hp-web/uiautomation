package com.course.allcase.baidupage;

import com.course.common.pagehandle.ItHomePage;
import org.testng.annotations.Test;

public class ItHomeCase_02 extends ItHomePage {


    @Test
    public void testIpadHome(){
        interIthomePage("https://www.ithome.com/");
        mouseMoveToItHome("//*[@id=\"nav\"]/div[1]/a");
        clickIpadHome("//*[@id=\"nav\"]/div[1]/div/div[1]/div[4]/ul/li[2]/span/a");

}


}
