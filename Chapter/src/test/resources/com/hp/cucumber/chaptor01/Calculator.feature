@calculator
Feature: Basic add
  Scenario: addition
    Given x is 4 and y is 5
    When invoke add method
    Then the result is 9
