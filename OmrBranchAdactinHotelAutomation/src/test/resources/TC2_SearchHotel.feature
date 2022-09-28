@searchhotel
Feature: Adactin Hotel Search Credentials

  Scenario Outline: Verifying Adactin Hotel Login Credentials
  Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 29/09/2022    | 10/10/2022     | 3 - Three       | 2 - Two           |

  Scenario Outline: Verifying Adactin Hotel Login Credentials Select Only Mandatory Fields
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select only Mandatory Fields "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"

    Examples: 
      | Username   | password | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | Greens8767 | L4R739   | Brisbane | 4 - Four        | 29/09/2022    | 10/10/2022     | 3 - Three       |

  Scenario Outline: Verifying Adactin Hotel Login Credentials select Check in and Check out
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select only Mandatory Fields "<Location>","<Number of Rooms>","<Check In Date>","<Check Out Date>" and "<Adults per Room>"
    Then User Should verify after checkin and checkout error message "Check-In Date shall be before than Check-Out Date", "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | Username   | password | Location | Number of Rooms | Check In Date | Check Out Date | Adults per Room |
      | Greens8767 | L4R739   | Brisbane | 4 - Four        | 20/09/2023    | 27/09/2022     | 3 - Three       |

  Scenario Outline: Verifying Adactin Hotel Login Credentials Without Select Any Fields Credentials
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select search button without click any fields
    Then User Should verify after without select any fields error message "Please Select a Location"

    Examples: 
      | Username   | password |
      | Greens8767 | L4R739   |
