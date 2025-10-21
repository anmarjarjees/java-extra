# java-extra
Extra Java Contents Beyond The Essentials (Java miscellanea)

# Anonymous Inner Class
Anonymous/Inner Class has the following features:
- has NO name that can be used to instantiate only one object. The class are defined/declared and instantiated at the same time (same line).
- It can extends another class or implement an interface 
- only one single object can be created from this class, so this object can have some special/different features/behaviours
- It has the same syntax like using a constructor but with a block of code

# Interfaces:
For basic idea about **"Interface in Java"** check my repo ["Java Essentials"](https://github.com/anmarjarjees/java-essentials).

## Marker Interface: 
Is an interface that doesn't have any method declaration. 
**Check the package "p01_marker_interfaces" section#1 "s1_basics"**

In Java we have we have different types of Marker Interfaces, the most commonly used:
- [Cloneable](https://docs.oracle.com/javase/8/docs/api/java/lang/Cloneable.html) => from the package: java.lang
- [Serializable](https://docs.oracle.com/javase/8/docs/api/java/io/Serializable.html) => from the package java.io.
- Remote => needs to be imported from java.rmi.Remote;

### Cloneable Interface
This interface gives us the option for using the clone() method to make our object cloneable (can be duplicated. Duplicating an object cannot be done by copying a reference.

**Check the package "p01_marker_interfaces" section#3 "s3_cloneable"**

### Serializable Interface
The concept "Serialization" in Java is useful and can be used:
- to recreate an object with its original state (properties values) between different JVM in different machines/platforms/OS
- to convert object into a stream of bytes to be easily transferred between different JVM in different machines/platform/OS

JVM creates a stream of bytes of "object1" for example in "computer1" (converting it into a byte array) through the "Serialization" process, then this object can be:
- stored on a hard drive in the form of a file with .ser extension for example
- transferred/shipped over the network (TCP/IP Communications) to another machine "computer2", then the JVM in computer2 will read these bytes (the .ser file) to recreate the "object1" through the "Deserialization" process to recreate it.

When an object (its class) implements a "Serializable Interface", JVM will be in charge of Serializing/Deserializing that object.

**Check the package "p01_marker_interfaces" section#2 "s2_serialization"**

# Generics
Give us the ability to have one class to be flexible for executing many things. look at the section "s1_why_generics", you will see that we duplicated the same general code of the class three times just to handle different data types!
All these three classes:
- outputInt
- outputDouble
- outputString

Have the same exact code but with only different field. Yes we could combine them into one class and using the polymorphism, but I just want to show you a simple demo for understanding the main use of "Generics" which is our main topic.

Now you can check the use of "Generics" in "s2_using_generics". Notice that we have worked with generics when we used the "ArrayList<>" and "HashMap<>".

Generic forces the idea of "Type Safe"

**Check the package "p01_marker_interfaces" section#2 "s2_serialization"**

# Functional Programming
Java is not considered to be a functional programming language, it's an OOP language. But with Java 8, we have functional interfaces. In functional programming we focus on functions instead of focusing on objects.

A style of programming where we apply pure functions to an input set to produce an output. In Functional Programming:
- A functions that can take another function as an input (argument)
- A functions that can return/output other function
- The output of a function depends only on its input. It is always the same, as long as the input doesn't change.

Java 8 added two new packages to support the idea of "Functional Programming":
- [java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)
- [java.util.stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html)

So in Java 8 and later => Functional Interface (java.util.function)

Functional programming was introduced in Java since version 8 by using these two features that help us to implement functional programming:
- Lambdas => Refer to Package5 (P05), section1 to section3
- Streams => Refer to Package5 (P05), section4

## Functional Interface
An interface that contains **only one abstract method** that can be implemented by **"lambda expressions"** and **"method references"**. It represents abstract concept such as functions

## Lambda Expression
Lambda Expression is a block of code that you can pass around so it can be executed, once or multiple times. It is built on using interfaces, and it was introduced in Java 8.
Lambda Expression Syntax for:
- Implementing a functional interface (Single method Interface)
- Having functions to act as objects

Lambda Expression and streams uses these two packages.
Lambda Expression implements interfaces

Look the **Lambda Expression** example that we used to iterate through a list/set or any collection to print its elements:
```
 List<String> provinces = List.of("Alberta", "British Columbia", "Manitoba", "New Brunswick",
                "Newfoundland and Labrador", "NovaScotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan");

System.out.println(provinces.size() + " provinces: " + provinces);

provinces.forEach(province -> System.out.println(province));
```

## Streams API:
Stream API can be used with lambdas to create concise or powerful code


## Lambda Expression with the Java built-in Functional Interfaces

 **Lambda Expression** is an implementation of the "Consumer Functional Interface" from the java.util.function package.
 
 Below is the first part of original "Consumer" Interface:
 ```
 @FunctionalInterface
public interface Consumer<T> {

    /**
     * Performs this operation on the given argument.
     *
     * @param t the input argument
     */
    void accept(T t);
 ```

 The "Consumer" Interface has only one abstract method name  "accept":
 ```
 void accept(T t);
 ```
 This method accepts a singe input argument and returns no result.
 Our Lambda expression **"province -> System.out.println(province)"** is just an implementation of the functional interface's single abstract method "accept" => "void accept(T t)".

 Besides the most commonly used Function Interface "Consumer", below are other core functional interfaces provided by "java.util.function" package. By convention, "T" stands for the input data type, and "R" stands for the returned data type:

 - Consumer<T> => Represents an operation that accepts a single input argument and returns no result.
> void accept(T t) 
> Performs this operation on the given argument.
> Parameters: 
> t - the input argument

- Predicate<T> => Represents a predicate (boolean-valued function) of one argument (Accepts one argument and returns a boolean result).
> boolean test(T t)
> Evaluates this predicate on the given argument.
> Parameters:
> t - the input argument
> Returns:
> true if the input argument matches the predicate, otherwise false

- Supplier<T> => Represents a supplier of results (Accepts no arguments and returns a result).
> T get()
> Gets a result.
> Returns:
> a result

- Function<T,R>	=> Represents a function that accepts one argument and produces (returns) a result.
> R apply(T t)
> Applies this function to the given argument.
> Parameters:
> t - the function argument
> Returns:
> the function result

- UnaryOperator<T> => Represents an operation on a single operand that produces a result of the same type as its operand (Accepts one argument and returns a result of the same type).
> static <T> UnaryOperator<T> identity()
> Returns a unary operator that always returns its input argument.
> Specified by:
> identity in interface Function<T,T>
> Type Parameters:
> T - the type of the input and output of the operator
> Returns:
> a unary operator that always returns its input argument

NOTES:
1. Beside the single abstract method that available in every functional interface, interface can also provide a default and static method (function). The "Function" functional interface has a default method named andThen() that performs another task/operation on the result from the previous operation.
You can check the file **C02PredSuppFunc.java**

2. Besides the Java built-in functional interfaces, we can create our own functional interfaces as well. Check the file 

## Streams (StreamAPI) 
A sequence of elements of array or other input collection source. Stream supports sequential and parallel aggregate operations.  
The following example illustrates an aggregate operation using Stream and IntStream:
```
     int sum = widgets.stream()
                      .filter(w -> w.getColor() == RED)
                      .mapToInt(w -> w.getWeight())
                      .sum();
```
Through the package **"java.util.stream"** for Interface Stream<T> for our functional programming.

Stream API (java.util.stream) doesn't store elements like any type of collection. Stream allows us to perform operations on the data without modifying the original source. 
[Data Source] ==> [Stream Operations] ==> [Result]

This package **"java.util.stream"** contains different built-in interfaces and classes to perform these operations.

Stream API (Stream pipelines) may execute either sequentially or in parallel.
This execution mode is a property of the stream. Streams are created with an
initial choice of "sequential" or "parallel" execution":
- Collection.stream() => creates a sequential stream
- Collection.stream().parallel() => creates a parallel one.
- Collection.parallelStream() 

This choice of execution mode may be modified by and one of these methods:
- BaseStream.sequential()
- BaseStream.parallel()
And may be queried with the BaseStream.isParallel() method

In our repo example, we will use the static method "stream()" then applying different operations on it like **forEach()** in the first examples then adding **parallel()** operation.

To review, Multiple Threads is the ability to execute multiple different paths of code at the same time. By default Java use one thread. When JVM starts up there is a thread which calls the main method of our application, this thread is called "main".
You can simply test the idea when you start a new class file with main() method and inside the main method, write:
```
System.out.println(Thread.activeCount()); // 1 <=> only one thread is running
System.out.println(Thread.currentThread().getName()); // main <=> the name of our current running thread
```
### Stream Operations:
Stream API provides different operations that can be performed on streams.

# Java Concurrency (Working with Threads)
By default, Java has one thread to be run at time this default thread is the "main()" method. There are 4 different ways to create a new thread in Java:
1- Create a class that extends the "Thread" class, and override its method "run()"
    - Check the packages (folders) "demo1, 2, 3, and 4"
2- Create a class implements the "Runnable" interface, and passing an instance of this "Runnable" interface to the constructor of the "Thread". when the thread starts, it will execute the run method of that "Runnable" interface
    - Check the package (folder) "demo5"
3- Create an anonymous implementation of the "Runnable" interface using an inner anonymous class
    - Check the package (folder) "demo6"
4- Create a Java Lambda Expression that implements the "Runnable" interface
    - Check the package (folder) "demo7"

Both ways can do the same job and apply the same result, the advantage of using the second way, is we can have our class to extend other class if needed since it's implementing an interface. While in the first way, our class is extending the "Thread" class so that's, we cannot extends other class as it's not allowed in java. To recap we can create a class to implement multiple interfaces but can only extend one class as Java doesn't allow multiple inheritance.

# Working with [Java Concurrency Utilities](https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/index.html):
The concurrency utilities packages provide a powerful, extensible framework of high-performance threading utilities. 
This package frees the programmer from the need to craft these utilities by hand, in much the same manner the collections framework did for data structures. Additionally, these packages provide low-level primitives for advanced concurrent programming. You can check this quick introductory guid for beginners about ["Concurrent Programming"](https://www.toptal.com/software/introduction-to-concurrent-programming)

Java provides the package "java.util.concurrent" which contains Utility classes commonly useful in concurrent programming.

This package contains many interfaces and classes. Starting with the most commonly used interfaces:
- Executors Interface

NOTE: These 2 packages have been moved to another repo. To learn more about Swing/AWT GUI and Events, check my rep [Java-UI-Swing](https://github.com/anmarjarjees/java-ui-swing)   
user_interfaces (package)
user_interface_events (package)

# VS Code Project ReadMe Template Contents:
Below are the default content from VS Code

## Getting Started
Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
