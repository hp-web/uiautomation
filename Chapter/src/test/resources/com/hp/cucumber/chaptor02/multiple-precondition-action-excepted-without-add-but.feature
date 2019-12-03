@MultipleTest
Feature: test multiple condition&action&excepted
  simple test
  without add and but keywords
  Scenario: simple scenario
    multiple pre-conditions
    mutiple user action
    mutiple excepted output
    Given user open the URL of git
#    Given user open the URL of jenkins
    When click build job link
    Then the job will be started
    When click the job id link
    When choice the job console
    When click into the console page
    Then the job building log will be print
    Then the last job can see successfully state
