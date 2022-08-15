Feature: Login Tool Check Verifications

  #Repetitive steps for user journey beginning
  Background: User begins to check the login process
    Given User navigates to the browser to open the login URL

  #Correct E-mail Id and Password
  @Test1
  Scenario Outline: Successful verification of the Login Functionality with correct details
    When User enters the <username> and <password>
    Then User click on the Login button
    And User is able to see the successful message

    Examples: 
      | username               | password  |
      | test@qa-experience.com | Password1 |

  #InCorrect details scenario (One field being incorrect)
  @Test2
  Scenario Outline: Successful verification of the Login Functionality with one field error
    When User enters the <username> and <password>
    And User is able to see the error message

    Examples: 
      | username               | password  |
      | test@qa-experience     | Password1 |
      | test@qa-experience.com | Pass      |

  #InCorrect details scenario (Both fields being incorrect)
  @Test3
  Scenario Outline: Successful verification of the Login Functionality with one field error
    When User enters the <username> and <password>
    And User can see two error messages

    Examples: 
      | username           | password |
      | test@qa-experience | Pass     |

  #Password Length Check
  @Test4
  Scenario Outline: Successful verification of the Login Functionality with length of password between 8 and 16
    When User enters the <username> and <password>
    Then User click on the Login button
    And User is able to see the successful message

    Examples: 
      | username               | password      |
      | test@qa-experience.com | Password12345 |

  #Password Length Check with more than 16 characters and less than 8 characters
  @Test5
  Scenario Outline: Successful verification of the Login Functionality with length of password below 8 and more than 16
    When User enters the <username> and <password>
    And User is able to see the error message

    Examples: 
      | username               | password          |
      | test@qa-experience.com | Password123456789 |
      | test@qa-experience.com | Pass              |

  #Username Check with numerics after domain and no domain
  @Test6
  Scenario Outline: Successful verification of the Login Functionality with numerics after domain and no domain
    When User enters the <username> and <password>
    And User is able to see the error message

    Examples: 
      | username                   | password  |
      | test@qa-experience.com1234 | Password1 |
      | test@qa-experience         | Password1 |
