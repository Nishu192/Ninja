@NotrunReg
Feature: To Automate Registration page of DS_Algo

  @RegistrationLink
  Scenario: DS Introduction page
    Given The user is on the DS Introduction page
    When The user clicks "Register" link on the DS Introduction page
    Then The user should be redirected to Register form
    And The user should able see a "Login" link at the botom of the page

  @Registration_page(allBlank)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button with all fields empty
      | Username | Password | Password confirmation |
      |          |          |                       |
    Then The error "Please fill out this field." appears below Username textbox

  @Registration_page(enterUsername)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering Username with other fields empty
      | Username            | Password | Password confirmation |
      | teams2233@gmail.com |          |                       |
    Then The error message "Please fill out this field." appears below Password textbox

  @Registration_page(enterUnamePwd)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering Username and password with Password Confirmation field empty
      | Username            | Password   | Password confirmation |
      | teams2233@gmail.com | teams123^& |                       |
    Then The error message "Please fill out this field." appears below  Password Confirmation textbox

  @Registration_page(invalidUsername)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering a username with spacebar characters other than digits and special char
      | Username | Password | Password confirmation |
      | teamser  |          |                       |
    Then The user is not able to see error msg after entering invalid data
    And The user redirected to empty password textbox

  @Registration_page(numericPwd)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering a password with numeric data
      | Username            | Password | Password confirmation |
      | teams2233@gmail.com | 12345678 |                       |
    Then The user is not able to see error msg after entering invalid data
    And The user redirected to empty password confirmation textbox

  @Registration_page(lessthan8chrPwd)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering a Password with characters less than eight
      | Username            | Password | Password confirmation |
      | teams2233@gmail.com | team     |                       |
    Then The user is not able to see error msg after entering invalid data

  @Registration_page(diffpwd&conpwd)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering different passwords in Password and Password Confirmation fields
      | Username            | Password   | Password confirmation |
      | teams2233@gmail.com | teams123^& | team12345             |
    Then The user should able to see an pwd warning message "password_mismatch:The two password fields didn’t match."

  @Registration_page(validUnamePwdCpwd)
  Scenario: New user registration page
    Given The user is on the new user registration page
    When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes
      | Username         | Password   | Password confirmation |
      | fgrhdffg4590096y | teams123^& | teams123^&            |
    Then The user should be redirected to Home Page of DS Algo
    And The user should able to see  successful message "New Account Created. You are logged in as nkfepjvofok"  on  the DS Algo Home Page

  @Signout
  Scenario: The User is signed out successfully
    Given The user is on the DS Algo Home Page
    When The user clicks the Sign out link
    Then The user able to see  "Logged out successfully" message
