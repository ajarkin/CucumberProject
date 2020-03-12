
Feature: Example table Practice
  Background: this step will navigate to the website before every test scenario

    Given navigate to the etsy website
    @TC-4
    Scenario Outline: validate etsy after search
    When user search with "<SearchValue>"
    Then user validate the "<ExpectedTitle>"
    Examples:
      | SearchValue       | ExpectedTitle             |
      | wooden spoon      | Wooden spoon \| Etsy      |
      | make up organizer | Make up organizer \| Etsy |
      | sweater           | Sweater \| Etsy           |
      | rose              | Rose \| Etsy              |
      | birthday cake     | Birthday cake \| Etsy     |
      | microphone        | Microphone \| Etsy        |
      | cable             | Cable \| Etsy             |
      | water bottle      | Water bottle \| Etsy      |
      | mouse             | Mouse \| Etsy             |

