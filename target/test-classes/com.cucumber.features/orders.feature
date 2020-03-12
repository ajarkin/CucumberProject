Feature: WebOrders View All Orders Functionality
  Scenario:
    * the user navigate to the web orders page
    * the user provide valid username
    * the user provide valid password
  Scenario Outline: Check The Order Page
    When the user click order button
    And the user select product "<product>"
    Then the user  give the "<quantity>"
    Then the user enters customer name "<customerName>"
    Then the user choose the "<street>"
    Then the user change city "<city>"
    Then the user change state "<state>"
    Then the user change zip "<zip>"
    Then the user select card "<card>"
    Then the user change cardNumber "<cardNumber>"
    Then the user change expiration date "<expire>"
    Then the user click process button
    And the user click view all orders button
    And the user validate updated order info "<product>" "<quantity>" "<customerName>" "<street>" "<city>" "<state>" "<zip>" "<card>" "<cardNumber>" "<expire>"
    Examples:
      | product     | quantity | customerName | street             | city      | state | zip   | card             | cardNumber       | expire |
      | MyMoney     | 10       | Jenny        | 2089 W Oak st      | Chicago   | IL    | 60654 | Visa             | 1234567948267386 | 04/20  |
      | FamilyAlbum | 20       | Garry        | 5867 N Lincoln ave | Las Vegas | NV    | 89378 | American Express | 6589392047899029 | 05/23  |
      | ScreenSaver | 30       | David        | 7940 S Union st    | Orlando   | MI    | 48021 | MasterCard       | 6492719049600847 | 06/22  |
