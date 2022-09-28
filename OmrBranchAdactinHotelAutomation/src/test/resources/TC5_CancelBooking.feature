@cancelbooking
Feature: Adactin Hotel Booking Cancellation

  Scenario Outline: Verifying Adactin Hotel Login with valid credentials, Enter selected hotel credentials,Book hotel valid credentials,Cancel Booking
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should select all Fields "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>" and "<Children per Room>"
    Then User Should verfiy After Search hotel success message "Select Hotel"
    And User Should select Hotel Name
    Then User Should verify success message after selecting Hotel "Book A Hotel"
    And User Should Book hotel "<FirstName>","<LastName>" and "<BillingAddress>"
      | CreditCardNo    | Credit Card Type | Expiry month | Expiry year | CVVNumber |
      |  34567898978675 | Visa             |           11 |          23 |       235 |
      |   0987654345675 | Master           |           12 |          27 |       835 |
      | 456786544656756 | American express |            7 |          28 |       935 |
    Then User Should select Book now After verifying the success message "Booking Confirmation"
    And User Should cancel Order id
    Then Should verify after Order id cancel success message "The booking has been cancelled."

    Examples: 
      | Username   | password | Location | Hotels       | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | FirstName | LastName | BillingAddress |
      | Greens8767 | L4R739   | Brisbane | Hotel Hervey | Deluxe    | 4 - Four        | 12/09/2022    | 12/09/2022     | 3 - Three       | 2 - Two           | karthi    | keyan    | chennai        |

  Scenario Outline: Verifying Adactin Hotel Login Credentials Cancel existing Booking
    Given User is on Adactin page
    When User Should perform login "<Username>","<password>"
    Then User Should verify login message "Hello Greens8767!"
    And User Should cancel existing Order id
      | Q6Y0U09H31 |
      | EE7745MT34 |
      | MC4YXO02XT |
      | 822S3OV2L6 |
    Then Should verify after Order id cancel success message "The booking has been cancelled."

    Examples: 
      | Username   | password |
      | Greens8767 | L4R739   |
