@smoke
  Feature: CreateBusiness
    Background:
      * user enters valid login and password
      Scenario: Create
        Given user clicks create business button
        When user enters unregistered valid tax id or ssn
        And user clicks next
        And user selects type from dropdown
        And user enters business name
        And user enters dba
        And user clicks next
        And user enters valid address
        And user clicks next
        And user enters valid phone and website
        And user clicks next
        And user enters social account
        And user clicks next
        And user enters contact person
        And user clicks submit