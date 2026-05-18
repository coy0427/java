## Project Overview

The project is a collection of Java classes and test cases designed to demonstrate various programming concepts, including object-oriented design, testing frameworks, and data structures. The project includes several classes that model different entities such as insects, pets, printers, and more, along with their corresponding test classes to ensure functionality.

## Core Purpose

The primary purpose of the project is to provide a comprehensive set of examples and exercises for students or developers to understand and practice Java programming concepts. The project covers topics such as:

- Object-oriented programming principles
- Testing using JUnit
- Implementation of data structures like linked lists, stacks, and queues
- Use of abstract classes and interfaces

## Key Features

- **Butterfly Class**: Models a butterfly with species and color attributes. Includes tests to verify constructor and method functionality.
  
- **DeliveryType Enum**: Represents different types of mail delivery methods.

- **DemoHeap Class**: Demonstrates the concept of heapsort through a simple example.

- **Friend Class**: Models a friend with name, age, and hobby attributes. Includes tests to verify constructor and method functionality.

- **InkjetPrinter and LaserPrinter Classes**: Abstract classes representing different types of printers. Includes specific implementations for inkjet and laser printers.

- **LinkedStructure Class**: A simple linked list implementation that stores integer values. Includes methods to check if the last element is a multiple of the first, count small numbers, and more.

- **Mail Class**: Represents a mail item with delivery type and code attributes. Implements `Comparable` for sorting based on delivery type and code.

- **Mosquito and PeskyMosquito Classes**: Models mosquitoes with different behaviors. Includes tests to verify method functionality.

- **NumberList Class**: A singly-linked list of double values. Includes methods to add elements, calculate product, insert at specific index, rotate the list, and more.

- **Pet Class**: Represents a pet with name, age, and species attributes.

- **PrinterTest Class**: Tests for the `Printer` abstract class and its implementations (`InkjetPrinter` and `LaserPrinter`).

- **StackQueue and StackQueueChallenge Classes**: Exercises to practice the use of stacks and queues. Includes transformations on character sequences and processing integer queues.

- **Telemarketer Class**: Models a telemarketer with name and age attributes. Includes tests to verify method functionality.

## Technologies Used

The project utilizes the following technologies and tools:

- **Java**: The primary programming language used for development.
- **JUnit 5**: A testing framework for writing repeatable tests in Java.
- **Algorithms 4th Edition (algs4.jar)**: A library by Robert Sedgewick and Kevin Wayne that provides data structures and algorithms.

## Prerequisites and Installation/Run Commands

### Prerequisites

1. **Java Development Kit (JDK)**: Ensure you have JDK installed on your system. You can download it from the [official Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use an open-source version like [AdoptOpenJDK](https://adoptopenjdk.net/).

2. **JUnit 5**: This is included in the project, but ensure your IDE supports JUnit 5.

3. **Algorithms 4th Edition Library (algs4.jar)**: Download the library from the [Princeton University website](http://algs4.cs.princeton.edu/code/) and place it in a `lib` directory within your project folder.

### Installation

1. **Clone the Repository**: Clone the repository to your local machine using Git Bash or any other terminal.

   ```powershell
   git clone https://github.com/coy0427/Java.git
   cd Java
   ```

2. **Set Up Project Structure**: Ensure you have a `lib` directory in the root of your project and place the `algs4.jar` file inside it.

### Run Commands

1. **Compile the Project**: Use the following command to compile all Java files in the project. Make sure to replace `src/**/*.java` with the actual path to your source files if they are located differently.

   ```powershell
   javac -cp ".;lib/algs4.jar" src/**/*.java
   ```

2. **Run Tests**: To run JUnit tests, you can use a testing framework like Maven or Gradle that supports JUnit 5. Alternatively, you can run individual test classes using the `java` command.

   ```powershell
   java -cp ".;lib/algs4.jar;out/test" org.junit.platform.console.ConsoleLauncher --select-class nuisance.ButterflyTest
   ```

   Replace `nuisance.ButterflyTest` with the fully qualified name of the test class you want to run.

3. **Run Main Classes**: To run a main class, use the following command. For example, to run `DemoHeap`:

   ```powershell
   java -cp ".;lib/algs4.jar" ceHeapSort.DemoHeap
   ```

### Notes

- Ensure that your environment variables are set correctly, especially for Java and JUnit.
- If you encounter any issues with classpath settings, double-check the paths and separators used in the commands.
- The project assumes a specific directory structure. Adjust the compilation and execution commands accordingly if your project structure differs.

By following these steps, you should be able to set up and run the project on a Windows system using PowerShell.

## System Architecture

The School project is structured to demonstrate various programming concepts and practices through a collection of classes and test cases. The system architecture can be broken down into several key components:

1. **Model Classes**: These classes represent the core entities in the system, such as insects, pets, printers, and mail items. They encapsulate data and provide methods for interacting with that data.

2. **Test Classes**: Each model class has a corresponding test class that uses JUnit 5 to verify the functionality of the model class. These tests ensure that constructors, getters, setters, and other public methods work as expected.

3. **Utility Classes**: These classes provide additional functionality or support for the main components of the system. For example, `LinkedStructure` is a simple linked list implementation used to demonstrate data structures.

4. **Main Classes**: Some classes serve as entry points for running specific examples or demonstrations. For instance, `DemoHeap` showcases the concept of heapsort.

5. **Libraries and Dependencies**: The project relies on external libraries such as `algs4.jar`, which provides additional data structures and algorithms.

### Project Files

Below is a detailed explanation of each file in the project:

- **ButterflyTest.java**: Contains JUnit tests for the `Butterfly` class, verifying its constructor and public methods. This ensures that the butterfly's species and colors are correctly initialized and retrieved.

- **DeliveryType.java**: An enumeration representing different types of mail delivery methods (e.g., GROUND, AIR). It is used in conjunction with the `Mail` class to demonstrate enumerated types.

- **DemoHeap.java**: A demonstration class showcasing the concept of heapsort. It includes steps for converting an array into a binary heap and extracting elements in sorted order. This class helps illustrate the fundamental concepts of heapsort without implementing the full algorithm.

- **FriendTest.java**: Contains JUnit tests for the `Friend` class, verifying its constructor and public methods. This ensures that friends' names, ages, hobbies, and interactions are correctly handled.

- **InkjetPrinterTest.java**: Contains JUnit tests for the `InkjetPrinter` class, which is an abstract class representing inkjet printers. The tests verify the functionality of printing and refilling cartridges.

- **InsectTest.java**: Contains JUnit tests for the `Insect` class, verifying its constructor and public methods. This ensures that insects' species are correctly initialized and retrieved.

- **LaserPrinterTest.java**: Contains JUnit tests for the `LaserPrinter` class, which is an abstract class representing laser printers. The tests verify the functionality of printing and refilling toners.

- **LinkedStructure.java**: A simple linked list implementation that stores integer values. It includes methods to add elements, check if the last element is a multiple of the first, count small numbers, and more. This class demonstrates basic data structure operations in Java.

- **Mail.java**: Represents a mail item with a specific delivery type and mail code. It implements the `Comparable` interface to allow comparison based on the delivery type and mail code. This class showcases object-oriented design principles and the use of enumerations.

- **MosquitoTest.java**: Contains JUnit tests for the `Mosquito` class, verifying its public methods. This ensures that mosquitoes' behaviors (e.g., buzzing) are correctly implemented.

- **NumberList.java**: A singly-linked list implementation of double values. It includes methods to add elements, calculate the product, insert at a specific index, rotate the list, and more. This class provides practice in manipulating linked structures.

- **NumberList_StudentTests.java**: Contains JUnit tests for the `NumberList` class, verifying its public methods. These tests ensure that the linked list operations work as expected.

- **PeskyMosquitoTest.java**: Contains JUnit tests for the `PeskyMosquito` class, verifying its constructor and public methods. This ensures that pesky mosquitoes' behaviors (e.g., biting) are correctly implemented.

- **Pet-1.java**: Represents a pet object with a name, age, and species. This class is part of a larger application to practice symbol table methods from the `BinarySearchST` class. Note that standard Java conventions prefer no hyphens in filenames, but this file adheres to its original naming convention.

- **PetApp-1.java**: An application to practice the use of symbol table methods from the `BinarySearchST` class. It initializes an array of `Pet` objects and demonstrates how to work with them.

- **PrinterTest.java**: Contains JUnit tests for the `Printer` abstract class, which is extended by `InkjetPrinter` and `LaserPrinter`. The tests verify the functionality of getting the model and serial number, as well as the `toString` method.

- **StackQueue.java**: Demonstrates exercises to practice the use of stacks and queues. It includes transformations on character sequences, such as replacing characters and duplicating slashes/backslashes.

- **StackQueueChallenge2.java**: A stack/queue challenge that processes an input queue by reversing its order, filtering out odd numbers, and returning an iterable with only the even numbers in reversed order. This class provides practice in using stacks and queues to solve problems.

- **StackQueueChallenges.java**: Exercises to practice the use of stacks and queues. It includes methods for checking if brackets are balanced and reversing the order of words in a queue.

- **StackQueueChallenges_StudentTests.java**: Contains JUnit tests for the `StackQueueChallenges` class, verifying its public methods. These tests ensure that the stack/queue operations work as expected.

- **TelemarketerTest.java**: Contains JUnit tests for the `Telemarketer` class, verifying its public methods. This ensures that telemarketers' behaviors (e.g., giving sales pitches) are correctly implemented.

By understanding the roles and interactions of these files, developers can effectively use the project to learn and practice various Java programming concepts.