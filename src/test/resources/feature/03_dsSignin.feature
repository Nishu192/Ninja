Feature: to automate Signin page of DS_Algo

  Background: background
    Given The user is on the DS Algo Introduction Page

  @Signin_page(link)
  Scenario: DS Algo Introduction Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
    And The user is able to see "Register!" link  below the text boxes

  @Signin_page(allBlank)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after leaving the "<username>" textbox and "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Username textbox

    Examples: 
      | username | password |
      |          |          |

  @Signin_page(enteronlyusername)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering the "<username>" and leaves "<password>" textbox blank
    Then The error message "Please fill out this field." appears below Pwd textbox

    Examples: 
      | username            | password |
      | Trioteamchallengers |          |

  @Signin_page(enteronlypwd)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering the "<password>" only.
    Then The error message "Please fill out this field." appears below Username textbox

    Examples: 
      | password      |
      | ds@qateam334h |

  @Signin_page(invalidusernamePwd)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering invalid "<username>" and invalid "<password>"
    Then The user should able to see an error message "Invalid Username and Password".

    Examples: 
      | username        | password      |
      | teamchallengers | ds@qateam334h |

  @Signin_page(validUsernameinvalidPassword)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering valid "<username>" and invalid "<password>"
    Then The user should able to see an error message "Invalid Username and Password".

    Examples: 
      | username            | password |
      | Trioteamchallengers |          |

  @Signin_page(validUsernameInvPwd)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering valid "<username>" and invalid "<password>"
    Then The error message "Please fill out this field." appears below Username textbox

    Examples: 
      | username            | password      |
      | Trioteamchallengers | ds@qateam334h |

  @Signin_page(valid)
  Scenario Outline: DS Algo Introduction Page
    When The user clicks login button after entering valid "<username>" and valid "<password>"
    Then The user should land in Data Structure Home Page with "You are logged in" message

    Examples: 
      | username            | password        |
      | Trioteamchallengers | triothebest@123 |
