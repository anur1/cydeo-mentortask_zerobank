@AddNewPayee
  Feature: Add new payee under pay bills

    Background:
      Given user logs in his-her own account
      When user clicks on More Services button under Online Banking
      And user clicks on Pay Bills link
      And user sees Pay Bills page
      And user clicks on Add New Payee tab





  @AddNewPayee1
    Scenario Outline: Add a new payee
      And creates new payee using following information
        | Payee Name    | The Law Offices of Hyde, Price & Scharks |
        | Payee Address | 100 Same st, Anytown, USA, 10001         |
        | Account       | Checking                                 |
        | Payee details | XYZ account                              |
      Then message "<message>" should be displayed
    Examples:
      | message |
      | The new payee The Law Offices of Hyde, Price & Scharks was successfully created. |

