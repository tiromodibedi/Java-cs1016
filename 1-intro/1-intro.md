## Absolute Java 
* OOP language
* We create classes whcih consists of objects
* an object is an entity (each object has properies - attributes)
* If we create a system for the universiyt on of the objects we will create is the student object. (we store the information of each in student with variables inside a class)
* An object will have aactions associated with it (e.g enroll in a class, sit for an exam) and these actions that a particular classes can do are specfied by functions (methods)

## Terminology Comparisons
* Other high level languages have constructs called: methods/fncs/

## Java Applications
* Two common types
	* Applications: run on the desktop 
    * Applets: run it on the web 
* A java application program is a class with a method named **main**
	* When a java program runs the run-time sysytem automaticaly invokes the main method.
    * All java application programs start with the main method
 
## Applets
* A java application that runs on the browser
	* It does not have a main method but has methods that ennable it to run on the browser

## Sample Java Program
```java
public class firstProgram
{
	public static void main(string[] args)
    {
    	System.out.println("Hello reader.");
    }
}
```
* firstProgram => name of first class(progam name i.e firstProgram.java
* public static void main() ==> this is the main method
* `System.out.printIn("Hello reader.");` To output something to the screen..it uses the System object.

## Variables Declaration
* Variables declaration in java are similar to those in other programming languages
	* simply give the variable type followed by its name `int sum;`
    
## Program terminology
* Code: A program
* Source code: A program written in high level language such as java
* Object code: The translated low-level program
	* The output from the compiler program e.g java byte code
* Each class definition must be in a file whose name is the same as the class name followed by .java
	* The FirstProgram must be in a file named FirstPgram.java
    
## Semantic ERRORS vs Synatx ERRORS
* syntax errors: Invalid Java code that the compiler does not understand e.g using a variable without declaring it first
* Semantic errors: This is valid code that the compiler understands but does not do what the programmer intended. It could be the result of using wrong variables, the ring operation or operations in the wrong order.

## Identifiers
* The names of variables, methods, classes, packages, and interfaces. Unlike literals they are not the actual values themselves but just ways to refer to them.
