# Abstract Factory Design Pattern - Readme

## 1. Abstract Factory Design Pattern

### Bookish Definition:
The Abstract Factory Design Pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. It enables clients to create objects without knowing the exact classes they belong to.

### Explanation in Simple Terms:
Imagine you are a toy car manufacturer, and you produce different types of toy cars with varying features. One day, you decide to expand your product line and introduce toy airplanes and toy boats. However, these new toys have complex assembly processes, and you want to keep the manufacturing details hidden.

Here's where the Abstract Factory Design Pattern comes to the rescue! You create an abstract factory called "ToyFactory," which declares methods for creating different types of toys like "createCar," "createAirplane," and "createBoat." Each method returns an abstract "Toy" object.

Now, you implement specific factories for each type of toy, like "CarFactory," "AirplaneFactory," and "BoatFactory." Each factory is responsible for creating the corresponding toy objects, such as "ToyCar," "ToyAirplane," and "ToyBoat."

When a client wants to produce toys, they use the "ToyFactory" interface without knowing the specific implementations. The client can request toy cars, airplanes, or boats from the factory, and they will receive the appropriate toy objects without worrying about the underlying complexities of the manufacturing process.

## 2. High-Level Overview of the Code

The code provided demonstrates the usage of the Abstract Factory Design Pattern to create different types of computers and servers, along with a website hosting service. It consists of the following components:

- `Computer` and `Server` interfaces: Abstract contracts defining the behavior of computers and servers.
- `ComputerFactory` and `ServerFactory` interfaces: Abstract factories that create instances of computers and servers, respectively.
- Concrete implementations of computers: `Laptop` and `SmartPhone` classes.
- Concrete implementations of servers: `GoogleColab` and `AmazonECTwo` classes.
- `HerokuFactory` class: A concrete factory that creates a website hosting service using a specified server.
- `LaptopFactory` and `SmartPhoneFactory` classes: Concrete factories that create instances of laptops and smartphones, respectively.
- `main()` function: The entry point that demonstrates the creation and interaction of computers, servers, and website hosting service using the Abstract Factory Design Pattern.

## 3. Deep Dive into the Code

### Use of Abstract Factory Design Pattern:

The Abstract Factory Design Pattern is utilized in the code to create families of related objects without specifying their concrete classes. It is achieved through the following components:

1. `Computer` and `Server` Interfaces:
    - The `Computer` interface specifies the outline of a computer with methods like `getRam()`, `getCpu()`, `getStorage()`, and `runWebsite(website: String)`.
    - The `Server` interface specifies the outline of a server with methods like `hostLowRequirementWebsite(website: String)` and `hostHighRequirementWebsite(website: String)`.

2. `ComputerFactory` and `ServerFactory` Interfaces:
    - The `ComputerFactory` interface provides an abstraction for creating computers using the `getComputer()` method.
    - The `ServerFactory` interface provides an abstraction for creating servers using the `getServer()` method.

3. Concrete Implementations:
    - `Laptop` and `SmartPhone` classes implement the `Computer` interface and represent specific types of computers with unique specifications.
    - `GoogleColab` and `AmazonECTwo` classes implement the `Server` interface and represent different types of servers with varying capabilities.

4. Concrete Factories:
    - `LaptopFactory` and `SmartPhoneFactory` classes implement the `ComputerFactory` interface to create instances of laptops and smartphones, respectively.
    - `AmazonECTwoFactory` class implements the `ServerFactory` interface to create instances of the Amazon EC2 server.

The Abstract Factory Design Pattern allows the code to create families of related objects, such as computers and servers, in a flexible and decoupled manner. The client code can request specific types of computers and servers through their corresponding factories without being tightly coupled to their concrete implementations.

### Other Design Principles:

The code also adheres to other design principles:

- **Abstraction and Interface Segregation Principle:** Interfaces like `Computer`, `Server`, `ComputerFactory`, and `ServerFactory` provide clear contracts, segregating the responsibilities and promoting abstraction.
- **Encapsulation Principle:** Data is encapsulated within classes, and only necessary functionality is exposed through interfaces.
- **Open/Closed Principle:** The code is open for extension through new implementations of computers, servers, and hosting services without modifying existing code.
- **Dependency Inversion Principle:** The code depends on abstractions (interfaces) rather than concrete implementations, promoting loose coupling.

Overall, the code demonstrates good design practices by leveraging the Abstract Factory Design Pattern and adhering to various design principles to achieve flexibility, maintainability, and modularity.
