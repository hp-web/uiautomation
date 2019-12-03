package com.course.PageObject;

public class GitHubFisrtPage {
    public static String getPullrequest() {
        return pullrequest;
    }

    private static final String pullrequest = "/html/body/div[1]/header/div[2]/nav/a[1]";

    public static String getIssue() {
        return issue;
    }

    private static final String issue = "//*[@id=\"js-repo-pjax-container\"]/div[1]/nav/span[2]/a/span[1]";
}
