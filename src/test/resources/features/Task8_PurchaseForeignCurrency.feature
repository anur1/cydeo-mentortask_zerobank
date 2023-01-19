@Task8_PurchaseForeignCurrency
Feature: Purchase Foreign Currency

    #initial steps before purchase
  Background:
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Pay Bills link
    And user sees Pay Bills page
    And user clicks on Purchase Foreign Currency tab

  @wip
  Scenario: Available currencies
    Then user sees following currencies listed in dropdown box
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Singapore (dollar)    |

  Scenario: Error message for not selecting currency
    When user tries to calculate cost without selecting a currency
    Then user sees error message displayed on popup

  Scenario: Error message for not entering value
    When user tries to calculate cost without entering a value
    Then user sees error message displayed on popup

