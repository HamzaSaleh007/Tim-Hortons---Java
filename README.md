# Assignment 7: Polymorphism, Abstract Classes, and Interfaces (mini Tim Hortons)

## Description
This assignment focuses on implementing a class hierarchy for products available at Tim's using concepts such as polymorphism, abstract classes, and interfaces. The goal is to create classes and methods as per the UML diagram provided, ensuring proper relationships between the classes through inheritance, association, and implementation.

The assignment involves:
1. Adding two new products to the system (one consumable and one non-consumable).
2. Implementing `create()` methods for user interaction, following the Factory Design Pattern.
3. Creating an order system (`TimsOrder`) to manage and calculate the total price of products.

---

## Features
### Key Classes
1. **Interfaces**:
   - `Commodity`: Interface for all products with common attributes.
   - `Consumable`: Interface for consumable products with the `getConsumptionMethod()` method.

2. **Abstract Class**:
   - `TimsProduct`: Abstract class implementing both `Commodity` and `Consumable`.

3. **Concrete Classes**:
   - `Mug`: A non-consumable product with attributes like color, cost, and price.
   - `Donut`: A consumable product with attributes like description, calorie count, and price.
   - Two new custom products (to be implemented as part of the assignment).

4. **TimsOrder**:
   - Manages an array of `TimsProduct` objects.
   - Includes methods to calculate the total price and display order details.

### Features
- Implements the Factory Design Pattern using static `create()` methods for user interaction and object instantiation.
- Polymorphic behavior through abstract methods and interface implementation.
- User-friendly dialog-based interaction for creating orders and products.
- Accurate calculation of the total price for an order using the `getAmountDue()` method.
- Clear and structured output for orders using the `toString()` method.

---

## Implementation Notes
- **Factory Design Pattern**:
  - The `create()` method for each product interacts with the user to collect data and instantiate objects.
  - Example:
    ```java
    Mug mug = Mug.create();
    ```

- **TimsOrder**:
  - Collects the customer's name and products through the `create()` method.
  - Dynamically adds products to the order using user input.

- **getConsumptionMethod()**:
  - For consumable products, this method returns how the product is consumed (e.g., "Drink it", "Eat it").

- **Polymorphism**:
  - The `TimsOrder` class uses polymorphism to handle an array of `TimsProduct` objects, regardless of their specific type.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/assignment7-tims-products.git

2. Open the project in IntelliJ IDEA.
3. run the main file Main.java
