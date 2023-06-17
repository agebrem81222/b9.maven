Feature: BlazeDemo Purchase page Functionality

  Scenario Outline: Verify User able to Purchase flight ticket
    Given User navigates to BlazaDemo Purchase "https://blazedemo.com/purchase.php"
    When User enters firstLastName "<firstLastName>"
    And User enters Address "<Address>"
    And User enters City "<City>"
    And User enters State "<State>"
    And User enters Zip Code "<Zip Code>"
    And User selects Card Type "<Card Type>"
    And user enters Credit Card Number "<Credit Card Number>"
    And User enters Month "<Month>"
    And User enters Year "<Year>"
    And User enters Name on Card "<Name on Card>"
    And User check Remember me check
    And user clicks purchase Flight butoon
    Then User verifies success message "<message>"

    Examples: 
      | firstLastName | Address       | City       | State | Zip Code | Card Type | Credit Card Number | Month | Year | Name on Card | message                            |
      | Ahsley Lee    | 689 drive st  | Alexandria | VA    |    22206 | Visa      |          567890439 |     7 | 2023 | Ashley Lee   | Thank you for your purchase today  |
      | Dahlia k      | 876  drive st | Alexandria | VA    |    11254 | Visa      |          876543216 |     4 | 2023 | Dahlia k     | Thank you for your purchase today  |
      | Eden  Z       | 432  drive st | Alexandria | VA    |    98074 | Visa      |          345789021 |     6 | 2023 | Eden  Z      | Thank you for your purchase today  |
      | Laurel A      | 789  drive st | Alexandria | VA    |    65432 | Visa      |          678954323 |     2 | 2023 | Laurel A     | Thank you for your purchase today  |
      | Flora J       | 774  drive st | Alexandria | VA    |    87642 | Visa      |         6677984355 |     8 | 2023 | Flora J      | Thank you for your purchase today  |
