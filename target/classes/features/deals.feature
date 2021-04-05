#Author: your.email@your.domain.com
#Ke
@tag
Feature: Deals Page with freecrm.com
 
   Scenario: create new deals in deals page 
    Given user lanunch the browse url in ui.cogmento.com
    And user enter the username and password
    			|manobala451@gmail.com|Summer@2020|
    And click on login button
    When user click on Deal page 
    And create new deal on deal page and enter value on Title,Amount,Commission and Probability
    			|Deal1|1000|10|45|
    And click on save button
    Then logout the browser
    

  
