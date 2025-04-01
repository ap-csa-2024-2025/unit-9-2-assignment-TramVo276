[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18962610)
# unit-9-2-assignment

## Git Config
```
git config user.name "user"
git config user.email "email"
```

## Compiling and Running Java Programs
Note that since our classes are separate classes, you will need to compile ALL the files (at least one time).  You can do this by running
```
javac *.java
```
The star means to compile every file that is a Java file type.

Run your code by running
```
java Main
```

After you compile the shape classes, you only need to compile and run `Main.java` as usual.

# Instructions  

## Problem 1
Not all dogs like to bark, but some like to make a lot of noise! In this exercise we have a `Dog` superclass and a `LoudDog` subclass. You do not need to modify the Dog class.

Your task is to write two override methods in the `LoudDog` class. You will override the speak method to return BARK!. You will then override the `toString` so that it returns `Clover is loud and likes to BARK!` where Clover is replaced by the `name` variable.

Create and print at least one `Dog` and one `LoudDog` in `Main` to test.

## Problem 2
With the addition of electric cars, we have a need to create a subclass of our `Car` class. In this exercise, we are going to create the `ElectricCar` subclass so that we can override a few methods to update them to work for `ElectricCars`.

The `Car` class has a field called `fuelLevel`. It represents the number of gallons left in the tank of a regular car. We’re going to reinterpret it to mean the battery percentage left in an Electric Car. Since it’s an int, to use `fuelLevel` in the `ElectricCar`, you’ll first need to convert it to a percentage by dividing by 100.

The `Car` class is complete, but you need to complete the `ElectricCar` class as outlined in the starter code with comments.

Once complete, use the `CarTester` to create both a `Car` and `ElectricCar` object and test these per the instructions in the `CarTester` class.

## Problem 3
There are many different types of companies out there so trying to make one class that fits them all would be a challenge. We are going to take a look at modeling out a general company with the `Company` class and then customize that class with the `OnlineCompany` subclass.

The basic structure is set up for both of these classes. Your task is to complete these classes as specified in the comments of each class.

Once complete, use the `CompanyTester` class to create a `Company` and `OnlineCompany` object, then print each out using the `toString()`.
