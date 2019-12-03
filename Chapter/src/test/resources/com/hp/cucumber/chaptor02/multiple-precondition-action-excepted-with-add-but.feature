Feature: test multiple with condition&action&excepted
  simple test
  with add and but keywords
  Scenario: simple scenario for multiple conditions
    multiple pre-conditions
    mutiple user action
    mutiple excepted output
    Given alex open the URL of git
    And user open the URL of jenkins
    When alex click build job link
    Then alex the job will be started
    When alex click the job id link
    And alex choice the job console
    And alex click into the console page
    Then alex the job building log will be print
    And alex the last job can see successfully state
    But alex the job will not running at current

