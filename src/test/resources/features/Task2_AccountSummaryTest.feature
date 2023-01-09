@AccountActivityNavigation
Feature: Go to account details

  @AccountSummaryTest
  Scenario: Go to Personal Account Summary Page
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on "Account Summary" link
    Then page displays "Cash Accounts",  "Investment Accounts", "Credit Accounts", "Loan Accounts"
    Then table displays columns "Account", "Credit Card", "Balance"

  # When the user clicks on "Account Activity" link
  #    Then the "Account Activity" page should be displayed
  #    And the user accesses the "Show Transactions" tab
  #    And Account drop down should have following parts
  #
  #      | Savings     |
  #      | Brokerage   |
  #      | Checking    |
  #      | Credit Card |
  #      | Loan        |


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
