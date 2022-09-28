@login
Feature: Adactin Hotel Login Credentials

  Scenario Outline: Verifying Adactin Hotel Login Credentials
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"

    Examples: 
      | Username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adactin Hotel Login User Enter
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>" with Enter key
    Then User Should verify login message "Hello Greens8767!"

    Examples: 
      | Username   | password |
      | Greens8767 | L4R739   |

  Scenario Outline: Verifying Adactin Hotel Invalid Login Credentials
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login with invalid credentials error message "Invalid Login details or Your Password might have expired"

    Examples: 
      | Username            | password |
      | Greenssfhjgdbjs8767 | dskljn   |
