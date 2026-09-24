# Java 06 - Object-Oriented Design Exercises

This project contains ten small Java exercises focused on object-oriented programming, SOLID principles, inheritance, composition, abstraction, and polymorphism.

Each exercise is self-contained in its own package and includes a test class with a `main` method.

## Project Structure

```text
ex00/  Single Responsibility Principle
ex01/  Open/Closed Principle
ex02/  Extending Behavior
ex03/  Inheritance Hierarchy
ex04/  Field Shadowing
ex05/  Payment Abstraction
ex06/  Composition vs. Subclassing
ex07/  Shape Abstraction and Interface Segregation
ex08/  Banking Account Specialization
ex09/  Turn-Based RPG
```

## Exercises

### ex00 - Single Responsibility Principle

**Main classes:** `Calculator`, `Logger`, `SingleResponsibilityTest`

This exercise separates calculation logic from logging logic. The `Calculator` performs arithmetic operations, while the `Logger` is responsible for displaying messages and errors.

It also demonstrates how division by zero can be handled without mixing unrelated responsibilities.

**What it teaches:**

- The Single Responsibility Principle (SRP)
- Separation of concerns
- Constructor dependency injection
- Basic exception and error handling

### ex01 - Open/Closed Principle

**Main classes:** `Shape`, `Circle`, `Rectangle`, `OpenClosedTest`

`Shape` defines a common abstraction for calculating area. `Circle` and `Rectangle` provide their own implementations.

A new shape can be added by creating another subclass instead of modifying existing shape code.

**What it teaches:**

- The Open/Closed Principle (OCP)
- Abstract classes
- Method overriding
- Runtime polymorphism

### ex02 - Extending Behavior

**Main classes:** `Notifier`, `NotifierDecorator`, `VerboseNotifier`, `ExtendingResponsibilityTest`

This exercise compares two ways of extending a notifier: inheritance and composition. `VerboseNotifier` extends the original notifier, while `NotifierDecorator` wraps a notifier and adds extra behavior.

**What it teaches:**

- Inheritance versus composition
- The Decorator design pattern
- Extending behavior without modifying the original class
- Why composition can be more flexible than subclassing

### ex03 - Inheritance Hierarchy

**Main classes:** `Person`, `Employee`, `Manager`, `HierarchyTest`

The exercise builds a hierarchy in which an `Employee` is a specialized `Person`, and a `Manager` is a specialized `Employee`. It also demonstrates employee identifiers and manager-specific information such as departments.

**What it teaches:**

- Class inheritance
- Constructor chaining with `super`
- Reusing common state and behavior
- Specializing subclasses
- Protected members

### ex04 - Field Shadowing

**Main classes:** `Vehicle`, `Car`, `ShadowingTest`

`Car` declares a field with the same name as a field in `Vehicle`. The example shows the difference between accessing the subclass field with `this` and the superclass field with `super`.

**What it teaches:**

- Field shadowing in Java
- The difference between `this` and `super`
- How shadowing can make code harder to understand
- Why clear and deliberate field design matters

### ex05 - Payment Abstraction

**Main classes:** `PaymentMethod`, `CreditCardPayment`, `PayPalPayment`, `PaymentProcessor`, `Wallet`, `Logger`, `SROCTest`

Different payment methods implement a common `PaymentMethod` interface. `PaymentProcessor` works with the interface instead of depending on a specific payment implementation.

The exercise also checks invalid payment amounts, insufficient funds, wallet state, and logging.

**What it teaches:**

- Programming to an interface
- Polymorphism and interchangeable implementations
- Separation of payment processing, wallet state, and logging
- Strategy-style design
- Basic validation and state management

### ex06 - Composition versus Subclassing

**Main classes:** `MusicPlayer`, `BassBoostMusicPlayer`, `AudioEffect`, `EchoEffect`, `BassBoostEffect`, `CompositionSubclassingTest`

The configurable music player receives an audio effect through composition. A separate subclass hardcodes a bass boost effect.

The example shows that composition allows an effect to be replaced at runtime, while subclassing creates a more rigid implementation.

**What it teaches:**

- Composition over inheritance
- Runtime behavior configuration
- Dependency injection
- The limitations of hardcoded subclass behavior
- Extensible design

### ex07 - Shape Abstraction and Interface Segregation

**Main classes:** `Shape`, `SolidShape`, `Cube`, `Cylinder`, `Shapes3DTest`

The project separates general shape behavior from solid-shape behavior. Two-dimensional shapes only need area calculation, while three-dimensional shapes also provide volume calculation.

**What it teaches:**

- Choosing appropriate abstraction boundaries
- Abstract classes and specialization
- The Interface Segregation Principle (ISP)
- Avoiding methods that do not belong to every type
- Reusing common geometric behavior

### ex08 - Banking Account Specialization

**Main classes:** `BankAccount`, `CheckingAccount`, `SavingsAccount`, `TransactionLogger`, `BankingSystemTest`

The base account provides common banking operations. `CheckingAccount` adds overdraft behavior, while `SavingsAccount` adds interest-related behavior. Transactions are recorded by a separate logger.

**What it teaches:**

- Inheritance for domain specialization
- Method overriding
- Shared base behavior
- Composition through a transaction logger
- Modeling business rules in separate classes

### ex09 - Turn-Based RPG

**Main classes:** `Character`, `Warrior`, `Mage`, `Skill`, `SkillSet`, and the concrete skill classes

This exercise models a small turn-based RPG. Characters have health, stamina, mana, attack damage, learned skills, and an alive/dead state.

`Warrior` and `Mage` specialize the abstract `Character` class. Skills implement the `Skill` interface and decide which character types can learn or use them. Characters can perform basic attacks, use skills, take damage, rest, and display their status.

**What it teaches:**

- Abstract classes and interfaces
- Inheritance and polymorphism
- Encapsulation of character state
- Composition: a character owns a `SkillSet`
- Validation of skill eligibility
- Resource costs for actions
- Reusable behavior through concrete skill implementations
- Modeling a small domain with interacting objects

## How to Run an Exercise

Open a terminal in the project root:

```bash
cd /home/vturlas/Desktop/Java/java06
```

Compile all Java files in the desired package and run its test class. For example:

```bash
javac ex00/*.java
java ex00.SingleResponsibilityTest
```

The test classes for all exercises are:

```bash
java ex00.SingleResponsibilityTest
java ex01.OpenClosedTest
java ex02.ExtendingResponsibilityTest
java ex03.HierarchyTest
java ex04.ShadowingTest
java ex05.SROCTest
java ex06.CompositionSubclassingTest
java ex07.Shapes3DTest
java ex08.BankingSystemTest
java ex09.TurnBasedRpgTest
```

To compile and run another exercise, replace `ex00` and the test class name in the commands with the desired package and test class.

## Requirements

- Java Development Kit (JDK)
- A terminal or Java-compatible IDE

The exercises use standard Java language features and do not require external libraries.
