# Pizza and Fatayer Baking Simulator

## Overview
This repository contains a Java-based simulation framework for creating and managing bakeable items like pizzas and fatayers. The project is designed to help users understand object-oriented concepts such as inheritance, interfaces, and polymorphism by modeling real-world food items.

## Features
- **Bakeable Interface**: Defines the essential methods that any bakeable item must implement, including methods to get weight, price, calories, name, and type.
- **Pizza Class**: An abstract class representing a pizza, with subclasses for ThinCrust and ThickCrust pizzas. Includes methods to add toppings and calculate nutritional information.
- **Fatayer Class**: A class representing different types of fatayers, with predefined types like cheese, za'atar, and spinach.
- **Enums**: 
  - `Topping`: Enum for various pizza toppings.
  - `FatayerType`: Enum for different types of fatayers.
  - `BakeSize`: Enum for different sizes of bakeable items (Small, Medium, Large).

## Classes

### 1. `Bakeable`
An interface that mandates the implementation of methods for getting the weight, price, calories, name, and type of a bakeable item.

### 2. `Pizza`
An abstract class that implements the `Bakeable` interface. This class serves as the base for all pizza types and includes methods to manage toppings and calculate the pizza's properties based on its size and toppings.

### 3. `ThinCrust` and `ThickCrust`
Concrete classes that extend the `Pizza` class. They provide specific implementations for calculating weight, price, and calories based on the crust type and size.

### 4. `Fatayer`
A class representing fatayers, a popular Middle Eastern pastry. The class implements the `Bakeable` interface and allows users to create different types of fatayers with predefined weights, prices, and calorie counts.

### 5. `Runner`
The main class that demonstrates the usage of the other classes. It creates instances of `Pizza` and `Fatayer`, adds toppings, and prints out their details.
