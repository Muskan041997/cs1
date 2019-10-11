Feature: Registration
Scenario: Signup

Given Launch the browser
When user gives the "Muskanalmasc" 
And firstname "mu" 
And lastname "al" 
And password "Password29" 
And confirm "Password29" 
And user selects gender 
And email "hggvjvk@gmail.com" 
And mobileNo "9876543210"
And dob "04/04/2019" 
And address "hgjfvi,bguygiybungiuo" 
And question 
And answer "pink"
Then user must in home page and display success message