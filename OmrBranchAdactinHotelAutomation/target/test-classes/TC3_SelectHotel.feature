@selecthotel
Feature: Adactin Hotel select Hotel Credentials

  Scenario Outline: Verifying Adactin Hotel Login with valid credentials, Entering Details by Select Hotel
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"
    And User Should select Hotel Name
    Then User Should verify success message after selecting Hotel "Book A Hotel"

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 29/09/2022    | 12/10/2022     | 3 - Three       | 2 - Two           |

  Scenario Outline: Verifying Adactin login with valid credentials, Entering Details and without selecting Hotel
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"
    And User Should continue without selecting any Hotel Name
    Then User Should verify without selecting any hotel name error message "Please Select a Hotel"

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 29/09/2022    | 12/10/2022     | 3 - Three       | 2 - Two           |
