#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Signin the AutomationPratice.com
  

  @tag1
  Scenario Outline: Login AutomationPratice.com website
    Given User enter the website on automationpratice.com
    And user should enters "<username>" and "<password>"
    When user should enter on Signin btn
    Then user validate the homepage
    Then close the browser
    
    Examples:
    |	username|	password|
    |		manobala451@gmail.com|    Summer@2020     |
    |		mano@gmail.com			|    winter@2020     |
   

 # @tag2
 #Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
 #   When I check for the <value> in step
 #   Then I verify the <status> in step

  #  Examples: 
  #    | name  | value | status  |
   #   | name1 |     5 | success |
    #  | name2 |     7 | Fail    |
