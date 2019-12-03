package com.course.cucumberrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "D:\\java_auotmate\\java_01\\Chapter\\src\\test\\resources\\com\\hp\\cucumber\\chaptor02\\multiple-precondition-action-excepted-without-add-but.feature",
        glue = {"com.course.cucumberrunner"},
        plugin = {"pretty","json:target/cucumber-report.json"})
public class Runner extends AbstractTestNGCucumberTests {

}
