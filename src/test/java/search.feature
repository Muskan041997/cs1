Feature: Searching the product
Scenario: successful search
Given Luanch the browser for product found
When user login 
And search for product found
Then Payment successfull

Scenario: unsuccessful search
Given Luanch the browser for product not found
When user login and product not found
And search for product not found
Then Payment unsuccessfull not found

Scenario: unsuccessful search for blank
Given Luanch the browser for product is blank
When user login and product is blank
And search for product is blank
Then Payment unsuccessfull when blank