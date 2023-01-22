@Task8_PurchaseForeignCurrency
Feature: Purchase Foreign Currency

    #initial steps before purchase
  Background:
    Given user logs in his-her own account
    When user clicks on More Services button under Online Banking
    And user clicks on Pay Bills link
    And user sees Pay Bills page
    And user clicks on Purchase Foreign Currency tab


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

  @wip
  Scenario: Error message for not selecting currency
    When user pushes purchase button currency and value
    Then user sees error message displayed on popup



