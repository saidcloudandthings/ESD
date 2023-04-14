@smoke
Feature: Resume
  Background:
    * user enters valid login and password
    * user clicks desired business box
  Scenario: Resume
    Given user clicks resume dash
    When user clicks resume app sum
    And user clicks next
    And user clicks yes
    And user enters valid dos
    And user clicks next
    And user gives meeting minutes statement
    And user clicks next
    And user enters date and method est
    And user clicks next
    And user selects counties
    And user clicks next