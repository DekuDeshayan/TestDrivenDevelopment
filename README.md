# TestDrivenDevelopment
#This is a  raw java EE automated tests projects
#Here I play with Unit and Integration tests
#the tool used is the Junit

This is a sample project to showcase Test-Driven Development(TDD) using Java, JUnit and Mockito. The project simulates a simple bank account process.
Account Class

The Account class is defined under the Entities package. It has the following properties:

    accountNumber: a String variable that stores the account number of the account.
    balance: a double variable that stores the balance of the account.

The Account class has the following methods:

    deposit(double amount): This method adds the specified amount to the balance of the account.
    withdraw(double amount): This method deducts the specified amount from the balance of the account.
    getBalance(): This method returns the balance of the account.



Getting Started
Prerequisites

    Java JDK 1.8 or higher.
    Apache Maven 3.6.3 or higher.

Installation

    Clone the repository to your local machine.

    bash

git clone https://github.com/DekuDeshayan/TestDrivenDevelopment.git

Navigate to the project directory.

bash

cd TestDrivenDevelopment

Build the project using maven.

mvn clean install

Run the tests.

bash

    mvn test

Contributing

Contributions to this project are welcome. To contribute, follow these steps:

    Fork the repository.
    Create a new branch.
    Make your changes and commit them.
    Push your changes to your fork.
    Submit a pull request.

Authors

    Deku Deshayan - Initial work - DekuDeshayan

License

This project is licensed under the MIT License - see the LICENSE.md file for details.
