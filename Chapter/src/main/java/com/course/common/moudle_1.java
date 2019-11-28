package com.course.common;

import com.course.util.StartChrome;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class moudle_1 {

    @Test
    public void openChrome(){
        StartChrome s = new StartChrome();
        WebDriver driver = s.Chrome();
        driver.get("https://www.baidu.com");
        driver.quit();
    }





}
