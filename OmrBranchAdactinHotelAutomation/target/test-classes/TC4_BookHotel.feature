@Bookhotel
Feature: Adactin Hotel Book Hotel Credentials

  Scenario Outline: Verifying Adactin Hotel Login with valid credentials, Enter selected hotel credentials,Book hotel valid credentials
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"
    And User Should select Hotel Name
    Then User Should verify success message after selecting Hotel "Book A Hotel"
    And User Should Book hotel "<FirstName>","<LastName>" and "<BillingAddress>"
      | creditcardno    | creditcardtype   | expirymonth | expiryyear | cvv |
      |  34567898978675 | Visa             |          11 |         23 | 235 |
      |   0987654345675 | Master           |          12 |         27 | 835 |
      | 456786544656756 | American express |           7 |         28 | 935 |
    Then User Should select Book now After verifying the success message "Booking Confirmation"

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | FirstName | LastName | BillingAddress |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 23/09/2022    | 24/09/2022     | 3 - Three       | 2 - Two           | karthi    | keyan    | chennai        |

  Scenario Outline: Verifying Adactin Hotel Login with valid credentials, Enter selected hotel credentials,Book hotel without select any credentials
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"
    And User Should select Hotel Name
    Then User Should verify success message after selecting Hotel "Book A Hotel"
    And User Should select Book now without select any fields
    Then User Should verify After the error message "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 23/09/2022    | 24/09/2022     | 3 - Three       | 2 - Two           |
