Feature: WebOrders login functionality


  Scenario: WebOrders login positive testing 1
    Given the user navigate to the web orders page
      When the user provide valid username
        And the user provide valid password
           Then the user should see home page



  Scenario: WebOrders login negative testing
    Given the user navigate to the web orders page
    When the user provide username "Test"
    And the user provide password "admin"
   Then the user validate text "Invalid Login or Password."


  Scenario: WebOrders login negative testing with numbers
    Given the user navigate to the web orders page
    When the user provide username "Tester" and password "tt"
    Then the user validate text "Invalid Login or Password."



  Scenario: WebOrders login negative testing 2
    Given the user navigate to the web orders page
    When the user provide username 1234
    And the user provide password 45678
    Then the user validate text "Invalid Login or Password."

  Scenario: WebOrders menu positive testing 2
    Given the user navigate to the web orders page
    Then the user validate order menu list