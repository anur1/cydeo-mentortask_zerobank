@PurchaseForeignCurrency
  Feature: Purchase Foreign Currency

    Background:
      Given the user is logged in
      When the user clicks on Online Baking More Services
      And the user clicks on "Pay Bills" link
      And the "Pay Bills" page should be displayed
      And the user accesses the "Purchase Foreign Currency" tab


  @PurchaseForeignCurrency1
  Scenario: Available currencies
    Then following currencies should be available
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

    @PurchaseForeignCurrency2
    Scenario Outline: Error message for not selecting currency
      When user tries to calculate cost without selecting a currency
      Then "<error message>" should be displayed
      Examples:
        | error message |
        | Please, ensure that you have filled all the required fields with valid values. |

    @PurchaseForeignCurrency3
    Scenario Outline: Error message for not entering value
      When user tries to calculate cost without entering a value
      Then "<error message>" should be displayed
      Examples:
        | error message |
        | Please, ensure that you have filled all the required fields with valid values. |