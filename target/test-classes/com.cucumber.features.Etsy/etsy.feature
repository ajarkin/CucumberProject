Feature: Etsy.com testing



    @search
  Scenario: searching for "Wooden spoon"
      * navigate to the etsy website
    * search for "wooden spoon"
    * validate title is "Wooden spoon | Etsy"


  @search
  Scenario: searching for make up organizer
    * navigate to the etsy website
    * search for "make up organizer"
    * validate title is "Make up organizer | Etsy"