@Task5_AccountActivityNavigation
Feature: Navigating to specific accounts in Accounts Activity



  #Task5-a
  Scenario: Savings account
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Summary link
    And user clicks on Savings link
    Then verify that user sees Account Activity tab
    And verify that user sees Savings selected on Account Dropdown


      #Task5-b
  Scenario: Savings account
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Summary link
    And user clicks on Brokerage link
    Then verify that user sees Account Activity tab
    And verify that user sees Brokerage selected on Account Dropdown

   #Task5-c

  Scenario: Savings account
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Summary link
    And user clicks on Checking link
    Then verify that user sees Account Activity tab
    And verify that user sees Checking selected on Account Dropdown

     #Task5-d
  Scenario: Savings account
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Summary link
    And user clicks on Credit Card link
    Then verify that user sees Account Activity tab
    And verify that user sees Credit Card selected on Account Dropdown

     #Task5-e
  Scenario: Savings account
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Summary link
    And user clicks on Loan link
    Then verify that user sees Account Activity tab
    And verify that user sees Loan selected on Account Dropdown