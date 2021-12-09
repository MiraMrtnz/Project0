# Project0

A Scala CLI (Command Line Interface) application. Hikinf data is parsed from two JSON file and persisted to MongoDB. 
The files include: National Parks in CA and NY, length of trails, difficulty level of trails, and activities recommended. 

Application Requirements: - Application must perform basic CRUD (Create, Read, Update, Delete) functionality with data stored in a database. 
- Application must be able to read JSON or CSV files, and store the data contained within those files in a database. 
- Application should have a CLI where users can interact with the application while it is running. 
- Other than those requirements, the kind of application you have is up to you. 

Tech Stack: - Scala 2.13 - File I/O - Collections - MongoDB - sbt - git SCM (+ GitHub)

Features
    Over 400 hiking trails from various national parks in CA & NY along with trail specific information
    The ability to create your own trail and add it to the application
    The ability to update or delete existing trails and corresponding information
 
    Future Improvements:
        Create more queries that implement aggregations of the data
        Searching trails based on specific criteria
 
Project Setup
    Clone this repository to the desired location on your machine
    To use and run this application, the user must have Mongo installed and should be connected to a Mongo Database Server.
    Then the user must have or create the following database and collection:
    Database = ‘projectZeroDB’
    Collection = ‘hikingCollection’
 
Usage
    Open the project in Visual Studio Code 
    Run the program and you will be presented with a menu of options
    Select options in the application and enjoy!
 
 Contributors
    Mira Martinez
