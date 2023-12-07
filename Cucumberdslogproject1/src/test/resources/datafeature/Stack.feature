
@tag
Feature: stack page feature
 
 Background:
 Given user is already logged in application
 |username|password|
 |kanchana06|Kanchu#123|

 
  @tag1 
 Scenario: open stack page
    Given Browser is open 
    When user clicks on get started
    And when user enters signin button
    And user click login button
    Then it should go to home page by showing username on top
     When user clicks onstack getstarted
     Then it should go to stack home page 
     
    @tag2
    Scenario: open stack page
    Given Browser is open 
    When user clicks on get started
    And when user enters signin button
    And user click login button
    Then it should go to home page by showing username on top
     When user clicks datastructuredropdown button
     And user select stack and click
     Then it should go to stack home page 
     

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
