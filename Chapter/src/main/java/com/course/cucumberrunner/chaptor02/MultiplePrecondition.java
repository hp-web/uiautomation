package com.course.cucumberrunner.chaptor02;

import com.course.PageObject.GitHubFisrtPage;
import com.course.util.StartChrome;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiplePrecondition {
    private WebDriver driver;
    @Given("^user open the URL of git$")

    public void user_open_the_URL_of_git() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.printf("user open the URL of git");
        StartChrome startChrome = new StartChrome();
        this.driver = startChrome.Chrome();
        this.driver.get("https://github.com/hp-web/uiautomation");

    }

//    @Given("^user open the URL of jenkins$")
//    public void user_open_the_URL_of_jenkins() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }

    @When("^click build job link$")
    public void click_build_job_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        this.driver.findElement(By.xpath(GitHubFisrtPage.getIssue())).click();
        Thread.sleep(2);
//        this.driver.quit();
    }

    @Then("^the job will be started$")
    public void the_job_will_be_started() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }
    @When("^click the job id link$")
    public void click_the_job_id_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^choice the job console$")
    public void choice_the_job_console() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^click into the console page$")
    public void click_into_the_console_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the job building log will be print$")
    public void the_job_building_log_will_be_print() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the last job can see successfully state$")
    public void the_last_job_can_see_successfully_state() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
