@LoginFeature
Feature: Techfios functionality validation 
 

  @Scenario1
  Scenario: Sky Blue Background
    Given "Set SkyBlue Background" button exists
    When I click on the button
    Then the background color will change to Sky blue
   
  @Scenario2
  Scenario: White Background Change
    Given "Set SkyWhite Background" button exists
    When I click on the button
    Then the background color will change to white

   
   
   
   