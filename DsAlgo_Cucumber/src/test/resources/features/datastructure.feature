@tag
Feature: DS Algo Portal DataStructures

@tag1 
 Scenario: open data structure page
    Given Browser is open 
    When user clicks on get started
    And when user enters signin button
    And user enter correct username as "kanchana06"
    And user enter correct password as "Kanchu#123"
    And user click login button
    Then it should go to home page by showing username on top
  @tag2  
  Scenario: datastructure -introduction page
  Given Browser is open
   When user clicks on get started
  And when user enters signin button
  And user enter correct username as "kanchana06"
  And user enter correct password as "Kanchu#123"
  And user click login button
  Then The user open the home page
  When user clicks on datatructure  get started
  Then it should go to data structure home page 
 
 @tag3
  Scenario: datastructure -introduction time-complexit page
  Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter correct username as "kanchana06"
    And user enter correct password as "Kanchu#123"
    And user click login button
  Then The user open the home page
  When user clicks on datatructure  get started
  Then it should go to data structure home page 
  When user click Time Complexity button 
  Then it should go to data structure time-complexity page
  
  
  
  @tag4
  Scenario: datastructure -introduction practice page
  Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter correct username as "kanchana06"
    And user enter correct password as "Kanchu#123"
    And user click login button 
  Then The user open the home page
  When user clicks on datatructure  get started
  Then it should go to data structure home page 
  When user click Time Complexity button 
  Then it should go to data structure time-complexity page
  And user click on practice button
  Then it should go to practice question page
  
  
  @tag5
    Scenario: datastructure -introduction tryedit page
   Given Browser is open
    When user clicks on get started
    And when user enters signin button
    And user enter correct username as "kanchana06"
    And user enter correct password as "Kanchu#123"
    And user click login button
  Then The user open the home page
  When user clicks on datatructure  get started
  Then it should go to data structure home page 
  When user click Time Complexity button 
  Then it should go to data structure time-complexity page
  And user click on Try here button
  And user enter correct code as " print(hello)"
  And user click run button 
  Then user seeing output of code