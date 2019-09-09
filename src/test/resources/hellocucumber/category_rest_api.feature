Feature: Test Assurity API
  In this feature file, Assurity REST api for the category  will be tested.Acceptance Criteria is.
  1. Name = "Carbon credits"
  2. CanRelist = true
  3. The Promotions element with Name = "Gallery" has a Description that contains the text "2x larger image"
  
  Scenario: retrieve category details
  	When retrieve category details by id "6327" and catalogue "false"
  	Then the response status code is 200
  	And category name is "Carbon credits"
  	And can relist is "true"
  	And promotion name is "Gallery" and descrption should contains "2x larger image"