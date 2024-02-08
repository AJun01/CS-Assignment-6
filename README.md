
| CS-665       | Software Design & Patterns   |
|--------------|------------------------------|
| Name         | Yujun Liu                    |
| Date         | 04/21/2024                   |
| Course       | Fall / **_Spring_** / Summer |
| Assignment # | 6                            |

# Assignment Overview
This assignment require a revise on one of the previous assignment and the assignment that I have choose is the first assignment(coffee machine), which simulates a coffee machine in a way that offering users
options of beverages to choose and condiments to add, then eventually checkout the calculated price

# GitHub Repository Link:
https://github.com/AJun01/CS-665-Assignment-6

# Implementation Description 

Previous Design:
- The program had five classes and main (AddOnOptions, Beverages, Condiment, Drink, OrderProcessor)
- For my previous implementation, I created Drink.class and Condiment.class as the main body(behavior) of two types of item in the machine(drink and condiment)
- Therefore, I used Drink.class and Condiment.class to create new objects stored as private final in the coffee machine under Beverages.class and AddOnOptions.class. 
- The structure of the program is very simple to understand, basically Beverages derived from Drink, and AddOnOptions derived from Condiment, OrderProcessor handles input data
- You can find similar structure with Drink and Condiment class but I still have seperated them because they serve different behavior such as when counting total price and how you build your drink from options

Problem Found(3 out of 3): 

This assignment did not require any software design pattern, therefore I was kinda freestyling, after learned many patterns I noticed that some of the designs from my own were actually close to some listed designs.
Therefore, mission is to find the structure that most similar to my previous design, and perfect my old design into more stander/normal forms, or use another pattern completely if inefficient.
- First problem, the logic of the old design of beverages needs to be fixed because that I simply created a bunch of incidence of drinks under beverages instead of extent, implement, or decorate. So the relationship between drink and beverages was never Drink ---> Beverages. To fix this, I need to apply some patterns like strategy or factory to make Drink an actual parent to beverages.
- Second problem, the relationship between drink and beverages is literally the same with Condiment and AddOnOptions, therefore, I figured that maybe template pattern might be a good choice to apply to this one since the logic is the same so instead of copying the process, I wrote the process and reuse it for condiments
- Third problem, OrderProcessor is definitely needed to be fixed, too messy, who handles orders like that? SO! instead of writing cases for every each possible choices, which is not efficient and extremely hard to maintain and addon. Command Pattern is perfect implementation for this problem, it can encapsulate an order request as an object, thereby allowing for parameterization of clients with different requests, and support for undoable operations.

New Design: 

- New design has 3 different sub-packages indicating 3 different sections of design patterns that handling different things
- CommandPattern(Command, AddProductCommand, FinalizeOrderCommand, OrderHandler)
- FactoryPattern(Product, Drink, Condiment, ProductFactory, Order)
- TemplatePattern（BeverageOrderProcess, CondimentOrderProcess, OrderProcessTemplate）
- For the first implementation, I utilized factory pattern to create drinks and condiment based on abstract class product, also created ProductFactory for drink and condiment generation
- For the second implementation, I utilized template pattern to handles both drink orders and condiment orders so that reused same logic for both situations
- For the third implementation, I utilized command pattern to handles orders, now if you user want to add stuff, executing commands everytime and finalizing order if no more command needed
# Maven Commands

We'll use Apache Maven to compile and run this project. You'll need to install Apache Maven (https://maven.apache.org/) on your system. 

Apache Maven is a build automation tool and a project management tool for Java-based projects. Maven provides a standardized way to build, package, and deploy Java applications.

Maven uses a Project Object Model (POM) file to manage the build process and its dependencies. The POM file contains information about the project, such as its dependencies, the build configuration, and the plugins used for building and packaging the project.

Maven provides a centralized repository for storing and accessing dependencies, which makes it easier to manage the dependencies of a project. It also provides a standardized way to build and deploy projects, which helps to ensure that builds are consistent and repeatable.

Maven also integrates with other development tools, such as IDEs and continuous integration systems, making it easier to use as part of a development workflow.

Maven provides a large number of plugins for various tasks, such as compiling code, running tests, generating reports, and creating JAR files. This makes it a versatile tool that can be used for many different types of Java projects.

## Compile
Type on the command line: 

```bash
mvn clean compile
```



## JUnit Tests
JUnit is a popular testing framework for Java. JUnit tests are automated tests that are written to verify that the behavior of a piece of code is as expected.

In JUnit, tests are written as methods within a test class. Each test method tests a specific aspect of the code and is annotated with the @Test annotation. JUnit provides a range of assertions that can be used to verify the behavior of the code being tested.

JUnit tests are executed automatically and the results of the tests are reported. This allows developers to quickly and easily check if their code is working as expected, and make any necessary changes to fix any issues that are found.

The use of JUnit tests is an important part of Test-Driven Development (TDD), where tests are written before the code they are testing is written. This helps to ensure that the code is written in a way that is easily testable and that all required functionality is covered by tests.

JUnit tests can be run as part of a continuous integration pipeline, where tests are automatically run every time changes are made to the code. This helps to catch any issues as soon as they are introduced, reducing the need for manual testing and making it easier to ensure that the code is always in a releasable state.

To run, use the following command:
```bash
mvn clean test
```


## Spotbugs 

SpotBugs is a static code analysis tool for Java that detects potential bugs in your code. It is an open-source tool that can be used as a standalone application or integrated into development tools such as Eclipse, IntelliJ, and Gradle.

SpotBugs performs an analysis of the bytecode generated from your Java source code and reports on any potential problems or issues that it finds. This includes things like null pointer exceptions, resource leaks, misused collections, and other common bugs.

The tool uses data flow analysis to examine the behavior of the code and detect issues that might not be immediately obvious from just reading the source code. SpotBugs is able to identify a wide range of issues and can be customized to meet the needs of your specific project.

Using SpotBugs can help to improve the quality and reliability of your code by catching potential bugs early in the development process. This can save time and effort in the long run by reducing the need for debugging and fixing issues later in the development cycle. SpotBugs can also help to ensure that your code is secure by identifying potential security vulnerabilities.

Use the following command:

```bash
mvn spotbugs:gui 
```

For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html

SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


## Checkstyle 

Checkstyle is a development tool for checking Java source code against a set of coding standards. It is an open-source tool that can be integrated into various integrated development environments (IDEs), such as Eclipse and IntelliJ, as well as build tools like Maven and Gradle.

Checkstyle performs static code analysis, which means it examines the source code without executing it, and reports on any issues or violations of the coding standards defined in its configuration. This includes issues like code style, code indentation, naming conventions, code structure, and many others.

By using Checkstyle, developers can ensure that their code adheres to a consistent style and follows best practices, making it easier for other developers to read and maintain. It can also help to identify potential issues before the code is actually run, reducing the risk of runtime errors or unexpected behavior.

Checkstyle is highly configurable and can be customized to fit the needs of your team or organization. It supports a wide range of coding standards and can be integrated with other tools, such as code coverage and automated testing tools, to create a comprehensive and automated software development process.

The following command will generate a report in HTML format that you can open in a web browser. 

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`




