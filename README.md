# crud-spring-mvc-mysql

CRUD Rest API application with springboot and MySQL

# Proposal to transform it to a clean Architecture

    src/
    └── main/
        ├── java/com.jorgedom.crud.friendsjd/
        │   ├── domain/
        │   │   ├── model/
        │   │   │   ├── Friend.java
        │   │   │   ├── Address.java
        │   │   ├── repository/
        │   │   │   ├── FriendRepository.java
        │   │   ├── usecase/
        │   │       ├── AddFriendUseCase.java
        │   │       ├── GetFriendDetailsUseCase.java
        │   ├── adapter/
        │   │   ├── controller/
        │   │   │   ├── FriendController.java
        │   │   │   ├── ControllerExceptionHandler.java
        │   │   ├── repository/
        │   │       ├── FriendJpaRepository.java
        │   ├── configuration/
        │       ├── ApplicationConfig.java
        │   └── util/
        │       ├── ErrorMessage.java
        └── resources/
            ├── application.properties
