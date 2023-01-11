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
      | fromDate   | toDate     | columnName |
      | "2012-09-01" | "2012-09-06" | date       |


    #task6-b
  @wip
  Scenario: Search description
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Account Activity link
    And user clicks on Find Transactions tab
    When user enters "ONLINE" string to description input box
    And clicks on find
    Then user sees descriptions containing "ONLINE" string on the table
    When user enters description “OFFICE”
    And clicks on find
    Then user sees descriptions containing “OFFICE” string on the table
