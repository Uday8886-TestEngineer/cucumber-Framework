
Feature: Verifying Loginfunctionality.
  
  Scenario: Verify Loginfunctionality with valid creditionals.
  
  Given Open browser and enter valid url
  When Enter valid username
  Then Enter valid password
  And Click on login button
  Then User should navigate to dashboard page
  
  
  
  Scenario: Verify Loginfunctionality with invalid creditionals 
  
  Given Open browser and enter valid url
  When Enter invalid username
  When Enter invalid password
  And  Click on login  button
  Then User got error as enter valid user name and valid password
  
  Scenario: Verify Loginfuncationality with valid user name and invalid passowrd
  
  Given Open browser and enter valid url
  When Enter valid username 
  When Enter invalid password
  When Click on login button
  Then User got error as enter valid password
  
  Scenario: Verify Loginfuncationality with invalid user name and valid passowrd
  
  Given Open browser and enter valid url
  When Enter invalid username 
  When Enter valid password
  And  Click on login button
  Then User got error as enter valid username
  
  
   #Scenario: Verify Loginfuncationality with username and passowrd both are empty
   #
  #Given Open browser and enter valid url
  #When Username field is empty
  #When Password field is emppty
  #And  Click on login button
  #Then User got error as enter valid username and valid password
   #
   #
  
  
  
  
  
  