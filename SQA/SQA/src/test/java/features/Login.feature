#Author: kalyan.pulijala@sqa.co.uk

Feature: Applicatin Login
  
  Scenario: Login to site with valid credentials
    Given the user have navigated to the estimates site
    When the user enters his credentials
    Then the user is navigated to the HomePage 
 