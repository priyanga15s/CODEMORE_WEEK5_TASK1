# ArrayListDemo - Explanation

## Objective

The objective of this program is to demonstrate how to use the `ArrayList` class in Java to store and manage a dynamic list of strings. The program allows the user to add, remove, search, and display elements using a menu-driven approach.

---

## Concepts Used

### 1. ArrayList
- `ArrayList` is a class in the `java.util` package.
- It stores elements in a dynamic array.
- Unlike normal arrays, its size can increase or decrease automatically.
- It allows duplicate elements and maintains insertion order.

Example:
```java
ArrayList<String> list = new ArrayList<>();
```

---

### 2. Scanner Class
The `Scanner` class is used to read input from the keyboard.

Example:
```java
Scanner sc = new Scanner(System.in);
```

Methods used:
- `nextInt()` - Reads an integer.
- `nextLine()` - Reads a complete line of text.

---

### 3. add() Method
The `add()` method inserts a new element into the ArrayList.

Syntax:
```java
list.add(element);
```

Example:
```java
list.add("Apple");
```

---

### 4. remove() Method
The `remove()` method deletes an element from the ArrayList.

Syntax:
```java
list.remove(element);
```

If the element exists, it is removed and the method returns `true`.
Otherwise, it returns `false`.

---

### 5. contains() Method
The `contains()` method checks whether an element is present in the ArrayList.

Syntax:
```java
list.contains(element);
```

It returns:
- `true` if the element exists.
- `false` if the element does not exist.

---

### 6. switch Statement
The `switch` statement is used to execute different operations based on the user's menu choice.

Options:
- Add element
- Remove element
- Search element
- Display elements
- Exit

---

### 7. do-while Loop
The `do-while` loop repeatedly displays the menu until the user chooses to exit.

Syntax:
```java
do {
    // menu operations
} while(choice != 5);
```

---

## Program Workflow

1. Create an empty `ArrayList`.
2. Display a menu.
3. Read the user's choice.
4. Perform one of the following operations:
   - Add a string
   - Remove a string
   - Search for a string
   - Display all strings
5. Repeat the menu until the user selects Exit.

---

## Java Packages Used

```java
import java.util.ArrayList;
import java.util.Scanner;
```

- `ArrayList` is used for storing strings dynamically.
- `Scanner` is used for accepting user input.

---

## Learning Outcomes

After completing this program, you will understand:

- How to create an `ArrayList`.
- How to add elements using `add()`.
- How to remove elements using `remove()`.
- How to search elements using `contains()`.
- How to display all elements in an `ArrayList`.
- How to build a menu-driven Java application.
- How to use loops and switch statements effectively.

---

## Conclusion

This program provides a simple implementation of the Java `ArrayList` class. It demonstrates basic list operations such as adding, removing, searching, and displaying elements while giving practical experience with dynamic collections, user input, loops, and decision-making statements.
