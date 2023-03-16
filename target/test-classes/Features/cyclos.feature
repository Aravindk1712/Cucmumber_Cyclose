
Feature: Validating the cyclos page

@smoke
Scenario Outline: verify the cyclos  Edit profile  and add mobile number

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click the edit profile   button
And User should change the name and add mobile number and click save button
Examples:
|User|pass| 
|arav|1994|





@regression1
Scenario Outline: verify the cyclos  contacts and add contact

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click the add new  button
And User should enter the value and click submit button
Examples:
|User|pass| 
|arav|1994|














@tag1
Scenario Outline: verify the cyclos in payment user

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click the submit button
And User should enter the value and click confirm button
Examples:
|User|pass| 
|arav|1994|



@regression2
Scenario Outline: verify the cyclos switch theme

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click the switch theme button new  button

Examples:
|User|pass| 
|arav|1994|




@test
Scenario Outline: verify the cyclos  directory

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click the directory button
And User should click My vouchers and click Buy vouchers and send button
Examples:
|User|pass| 
|arav|1994|










@tag2
Scenario Outline: verify the scheduled payments

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment
Examples:
|User|pass|
|arav|1994|

@tag3~
Scenario Outline: verify the scheduled payments

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payments
Examples:
|User|pass|
|arav|1994|

@tag4
Scenario Outline: verify the scheduled payments

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment mode
Examples:
|User|pass|
|arav|1994|

@tag5
Scenario Outline: verify the scheduled payments

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click scheduled payment modes
Examples:
|User|pass|
|arav|1994|

@tag6
Scenario Outline: verify the scheduled payments

Given User should open the url
When User should enter the "<User>" and "<pass>"
And User should click Member account
Examples:
|User|pass|
|arav|1234|


@tag7
Scenario Outline: verify the scheduled payments

Given User should o the url
When User should enter the "<User>" and "<pass>"
And User should click voucher
Examples:
|User|pass|
|arav|19944|






