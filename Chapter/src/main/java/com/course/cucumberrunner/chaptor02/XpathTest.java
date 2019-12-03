package com.course.cucumberrunner.chaptor02;

import com.course.common.moudle_1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class XpathTest {
    private moudle_1 moudle1 = moudle_1.getMoudle1();;

    @Test
    public void baiDuXpathTest(){
        moudle1.inputUrl("https://www.ithome.com/");
    }

    @AfterTest
    public void cilckITCirCle() throws InterruptedException {
        moudle1.serchElement("//*[@id=\"nav\"]/ul/li[2]/a").click();

    }

/*    @AfterTest
    public void close() throws InterruptedException {
//        moudle1.serchElement("//*[@id=\"nav\"]/ul/li[2]/a").click();
        moudle1.getDriver().quit();

    }*/


}
