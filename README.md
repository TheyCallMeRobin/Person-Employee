# Employee class
Create a class called `Employee` whose objects are records for an employee. This class will be a derived class of the class `Person` which you will have to create. An employee record has an employee's name (inherited from the class `Person`), an annual salary represented as a single value of type `double`, a year the employee started work as a single value of type `int` and a social security number, which is a value of type `String`.

**Write a class containing a `main()` method to fully test your class definition.**

`Person` class requirements:
1. One `private` attribute of type `String` that stores the name of the person object, *with getter and setter*.
1. Default constructor that creates a person object with an empty string (`""`) as the name attribute.
1. A constructor that accepts a string to be assigned as the name of the object.
1. Override the `toString` method so it returns a string representation of the `Person` object, which should be the name attribute.
1. Implement the `public boolean equals(Object otherPerson)` method so it returns if the name of `this` object is the same as the name of the `otherPerson` object or not.

```java
public class Person {}
```

`Employee` class requirements:
1. One `private double` attribute to hold the value for the annual salary of the employee, with a getter method `getSalary()`.
1. A `private int` attribute to store the year which the employee started working with a getter method `getYear()`.
1. A `private String` attribute  to stode the social security number of the employee.
1. A constructor that accepts four parameters in this order: a `String` for the name, a `double` for the annual salary, an `int` for the starting year, and another `String` for the social security number.
1. Override the `equals()` method so that it compares the social security number of the objects, instead of the name attribute.

```java
public class Employee {}
```

Hints:
1. To compare two `String` objects (`s1` and `s2`), you can use the `equals` method from the `String` class: `s1.equals(s2)`.
1. Use the `equals()` method that you implement for this assignment the same way you would use it to compare `String` objects.
1. You can downcast from a parent type to a child type to have access to the child's methods (usefull for the equals method).

## Assignment workflow

1. Accept the assignment when posted on Moodle
1. ***Clone*** the assignment repository
1. Solve the assignment
1. Submit (`commit` and `push`) the assignment
    1. Resubmit if necessary or contact the instructor for questions.
