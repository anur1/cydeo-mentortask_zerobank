@AccountActivityNavigation
Feature: Go to Pay Bill details


  @PayBillTest
  Scenario: Go to Pay Bill page
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on "Pay Bills" link_three
    And user enters "100" to amount and "2023-01-01" to date inputbox
    And user clicks on Pay button
    Then user sees "The payment was successfully submitted." as success message
    And user do not enter anything to amount and date inputbox
    And user clicks on Pay button

    Then user sees "Lütfen bu alanı doldurun." as empty input box message


