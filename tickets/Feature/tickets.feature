Feature: Making a booking

Scenario: Booking with valid data
Given User opens booking screen
When Enters names "Petar Georgiev"
When Enters seat number 9
When Enters movie "Titanic"
And Clicks on booking button
Then Gets message "OK"

Scenario: Booking without names
Given User opens booking screen
When Enters seat number 9
When Enters movie "Titanic"
And Clicks on booking button
Then Gets message "Enter your name"

Scenario: Booking without seat number
Given User opens booking screen
When Enters names "Petar Georgiev"
When Enters movie "Titanic"
And Clicks on booking button
Then Gets message "Enter seat number"

Scenario: Booking without movie
Given User opens booking screen
When Enters names "Petar Georgiev"
When Enters seat number 9
And Clicks on booking button
Then Gets message "Enter movie"

Scenario: Booking without any data
Given User opens booking screen
And Clicks on booking button
Then Gets message "Enter your name, seat number and movie"
