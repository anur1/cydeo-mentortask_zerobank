@FindTransactions
  Feature: Find Transactions in Account Activity

    Background:
      Given the user is logged in
      When the user clicks on Online Baking More Services
      And the user clicks on "Account Activity" link
      And the "Account Activity" page should be displayed
      And the user accesses the "Find Transactions" tab


  @FindTransactions1
  Scenario Outline: Search date range
    And the user enters date range from "<fromDate>"  to "<toDate>"
    And clicks find
    Then verify the results should be sorted by most recent date between "<fromDate>"  to "<toDate>" in the "<columnName>" column

    Examples:
      | fromDate   | toDate     | columnName |
      | 2012-09-01 | 2012-09-06 | date1       |


    @FindTransactions2
    Scenario Outline: Search date range
      When the user enters date range from "<fromDate>"  to "<toDate>"
      And clicks find
      Then verify the results should not contain "<notContainDate>"  between "<fromDate>"  to "<toDate>" in the "<columnName>" column

      Examples:
        | fromDate   | toDate     | columnName | notContainDate |
        | 2012-09-02 | 2012-09-06 | Date       | 2012-09-01     |


    @FindTransactions3
    Scenario Outline: Search description
      When the user enters description "<KeyWord1>"
      And clicks find
      Then results table should contain "<KeyWord1>" and should not contain "<KeyWord2>"
      Examples:
        | KeyWord1 | KeyWord2 |
        | ONLINE   | OFFICE   |
        | OFFICE   | ONLINE   |

    @FindTransactions4
      Scenario: Type
      And clicks find
      Then results table should show at least 2 result under "Deposit"
      Then results table should show at least 1 result under "Withdrawal"
      When user selects type "Deposit"
      And clicks find
      Then results table should show at least 2 result under "Deposit"
      But results table should show no result under "Withdrawal"
      When user selects type "Withdrawal"
      And clicks find
      Then results table should show at least 1 result under "Withdrawal"
      But results table should show no result under "Deposit"
