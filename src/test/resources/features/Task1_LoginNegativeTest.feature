@AccountActivityNavigation
Feature: Navigating to specific accounts in Accounts Activity

  @LoginFunction_NegativeTest
  Scenario Outline: Login with invalid credentials
    When user is on the login page
    And  user enters username "<username>"
    And  user types password "<password>"
    And user clicks on the sign in button
    Then verify that "<error message>" is displayed

    Examples:
      | username  | password  | error message                    |
      | username  |           | Login and/or password are wrong. |
      |           | password  | Login and/or password are wrong. |
      | Xusername | password  | Login and/or password are wrong. |
      | username  | Xpassword | Login and/or password are wrong. |
      |           |           | Login and/or password are wrong. |




  @AccountActivityNavigation2
  Scenario: Savings account redirect
    Given  the user is logged in
    When the user clicks on Online Baking More Services
    When the user clicks on "Account Activity" link
    Then the "Account Activity" page should be displayed
    And the user accesses the "Show Transactions" tab
    And Account drop down should have following parts

      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |





#  @AccountActivityNavigation3
#  Scenario Outline: Savings account redirect
#    Given  the user is logged in
#    When the user clicks on Online Baking More Services
#    When the user clicks on "Account Activity" link
#    Then the "Account Activity" page should be displayed
#    And the user accesses the "Show Transactions" tab
#    And Account drop down should have "<part>" selected
##    And the user logged out
#
#    Examples:
#      | part        |
#      | Savings     |
#      | Brokerage   |
#      | Checking    |
#      | Credit Card |
#      | Loan        |
