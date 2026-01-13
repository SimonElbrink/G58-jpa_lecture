````mermaid

classDiagram
    direction BT
    
    class Student{
        - String id
        - String firstName
        - String lastName
        - String email
        - boolean status
        - LocalDateTime createDate
        - Address address
    }
    class Address {
        - Long id
        - String postalCode
        - String street
        - String city
    }
    
    %% Relationships
    Student --> Address : One-To-One
    
````