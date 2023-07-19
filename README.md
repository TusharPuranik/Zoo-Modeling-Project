# Zoo Modeling Project

This project is a Java program that models a zoo consisting of different types of animals, such as mammals, birds, and reptiles. It demonstrates key object-oriented programming concepts such as polymorphism, abstraction, and inheritance.

## Features

- The program defines an abstract class called `Animal` that serves as a common blueprint for all animals in the zoo.
- The `Animal` class has attributes like name and age, along with getter and setter methods for accessing and modifying these attributes.
- The `Animal` class also declares an abstract method called `makeSound()` that is meant to be implemented by each subclass.
- Subclasses of `Animal` are implemented for different types of animals: `Mammal`, `Bird`, and `Reptile`. Each subclass has its own specific attributes and behaviors.
- Additional subclasses are implemented for each animal type with unique attributes and behaviors. For example, for mammals, there are `Dog` and `Elephant` subclasses, for birds, there are `Eagle` and `Penguin` subclasses, and for reptiles, there are `Snake` and `Turtle` subclasses.
- Each subclass overrides the `makeSound()` method to produce its own specific sound.
- The program demonstrates polymorphism by using a common method (`makeSound()`) to invoke the specific sound of each animal subclass.
- Inheritance is utilized to inherit attributes and methods from the abstract class `Animal`, reducing code duplication and promoting code reusability.
- Encapsulation is achieved through private attributes in the `Animal` class, which are accessed and modified using getter and setter methods.

## Getting Started

To run the project locally, follow these steps:

1. Ensure that Java Development Kit (JDK) is installed on your system.
2. Clone this GitHub repository to your local machine.
3. Open the project in your preferred Java IDE.
4. Build and run the `Zoo.java` file, which contains the main method.

## Usage

Upon running the program, it creates objects of different animal subclasses and demonstrates various functionalities, including:

- Polymorphism: Invoking the `makeSound()` method on different animal objects, which results in different sounds based on the actual subclass type.
- Inheritance: Accessing and modifying the attributes of animal subclasses using inherited getter and setter methods.
- Encapsulation: Ensuring that the attributes of animal subclasses are encapsulated and accessed through appropriate getter and setter methods.

