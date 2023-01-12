@Task6_AccountActivity
Feature: Find Transactions in Account Activity


  Scenario Outline: Search date range
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Activity link
    And user clicks on Find Transactions tab
    And the user enters date range from “<fromDate>” to “<toDate>”
    And clicks on find
    Then verify that user sees the date in range “<fromDate>” to “<toDate>”
    And verify that dates are sorted by most recent date

    Examples:
      | fromDate     | toDate       | columnName |
      | "2012-09-01" | "2012-09-06" | date       |


    #task6-b
  Scenario: Search description
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Activity link
    And user clicks on Find Transactions tab
    When user enters "ONLINE" string to description input box
    And clicks on find
    Then user sees descriptions containing "ONLINE" string on the table
    When user enters "OFFICE" string to description input box
    And clicks on find
    Then user sees descriptions containing "OFFICE" string on the table

  @wip

    #task6-c
  Scenario: Search description case insensitive
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Activity link
    And user clicks on Find Transactions tab
    When user enters "ONLINE" string to description input box
    And clicks on find
    Then user sees descriptions containing "ONLINE" string on the table
    When user enters "onlIne" string to description input box
    And clicks on find
    Then user sees descriptions containing "ONLINE" string on the table


  @wip

    #task6-d
  Scenario: Type
    Given the user accesses the Find Transactions tab
    And clicks search
    Then results table should show at least one result under Deposit
    Then results table should show at least one result under Withdrawal
    When user selects type “Deposit”
    Then results table should show at least one result under Deposit
    But results table should show no result under Withdrawal
    When user selects type “Withdrawal”
    Then results table should show at least one result under Withdrawal
    But results table should show no result under Deposit
