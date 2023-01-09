@Task6_AccountActivity
Feature: Find Transactions in Account Activity

  @wip
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
      | fromDate   | toDate     | columnName |
      | "2012-09-01" | "2012-09-06" | date       |
