@smoke
Feature: Apply
  Background:
    * user enters valid login and password
  Scenario: Apply
    Given user clicks desired business box
    When user clicks apply
    And user clicks start
    And user confirm checkbox
    And user clicks next
    And user completes assessment
    And user clicks next