@smoke
Feature: Login feature
  Background:
    @smoke
    Scenario: Login
      Given user is navigated to login page
      When user enters valid login and password
      Then user is successfully logged in and land on dashboard