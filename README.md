# Strangler Pattern

The Strangler Pattern is a software architectural pattern that is used when migrating an existing system from monolithic to a microservice architecture. It allows you to gradually replace functionality by a facade that delegates the incoming traffic to the microservice functionalityis hosted.

## Overview

The Strangler Pattern works by diverting requests or functionality from the existing system to the new system, piece by piece. It does not require a complete rewrite of the entire system, which can be risky and time-consuming. Instead, it allows for a phased approach where new functionality is implemented separately and integrated into the existing system.

## Example
In this example we have a monolithic application that manages loan of books with the architecture below:
 ![CHEESE!](assets/mono_architecture.PNG)
 
 we developed it using project structure : 
 
 ![CHEESE!](assets/monolithic_project_architecture.PNG)
 
 ## Implementation
 1. **Migrating functionalities related to the users**:we will develop microservice that will manage the users but before we create it we should show the user controller in monolithic architecture 
  ![CHEESE!](assets/user_controller.PNG)
  
  users microservice: 
  
  ![CHEESE!](assets/users_microservice.PNG)
  
  now we should replace the user service in user controller with a facade that will communicate with the users microservice :
  
  ![CHEESE!](assets/user_facade.PNG)
  
  ![CHEESE!](assets/remove_user_service.PNG)
  
  User facade interface 
  
  ![CHEESE!](assets/user_facade_interface.PNG)
  
  
  User controller after replacing user service by user facade
  ![CHEESE!](assets/replace_user_service.PNG)
  
   2. **Migrating functionalities related to th books**:we will develop microservice that will manage the books but before we create it we should show the book controller in monolithic architecture 
  ![CHEESE!](assets/book_controller.PNG)
  
  books microservice: 
  
  ![CHEESE!](assets/books_microservice.PNG)
  
  now we should replace the book service in book controller with a facade that will communicate with the books microservice :
  
  ![CHEESE!](assets/book_facade.PNG)
  
  ![CHEESE!](assets/remove_book_service.PNG)
  
  book facade interface 
  
  ![CHEESE!](assets/book_facade_interface.PNG)
  
  
  User controller after replacing book service by user facade
  ![CHEESE!](assets/replace_book_service.PNG)
 
 
 
