## 🧩 **Array Syntax in Java**

### 🔹 **1. Declaration**

You declare an array by specifying:

* The **data type** of elements
* Square brackets `[]` to denote an array
* A **variable name**

```java
dataType[] arrayName;
```

or

```java
dataType arrayName[];
```

✅ Example:

```java
int[] numbers;
char letters[];
```

---

### 🔹 **2. Memory Allocation (Creation)**

You create an array using the `new` keyword and specify its **size** (number of elements).

```java
arrayName = new dataType[size];
```

✅ Example:

```java
numbers = new int[5];  // Creates an integer array of size 5
```

---

### 🔹 **3. Declaration and Creation (Combined)**

You can combine declaration and creation in a single line.

```java
int[] numbers = new int[5];
```

---

### 🔹 **4. Initialization**

You can assign values to array elements using the **index** (starting from 0).

```java
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
```

---

### 🔹 **5. Declaration + Initialization Together**

You can directly initialize an array with values using curly braces `{}`.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

### 🔹 **6. Accessing Elements**

You can access or modify elements using their **index**.

```java
System.out.println(numbers[0]);  // Output: 10
numbers[2] = 99;                 // Changes 3rd element to 99
```

---

### 🔹 **7. Length of Array**

To get the number of elements in an array, use the `.length` property.

```java
System.out.println(numbers.length);  // Output: 5
```

---

### 🧮 **Example: Full Program**

```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = new int[3];   // Declaration + Creation

        marks[0] = 85;              // Initialization
        marks[1] = 90;
        marks[2] = 95;

        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
```

### 📦 Call by Reference in Arrays (Explanation)

In Java, **arrays are passed by reference**. This means when you pass an array to a method:

1. **The method receives the address (reference) of the original array** in memory, not a copy of it.
2. **Any modifications made inside the method** (like changing elements) will **directly affect the original array**.
3. This behavior allows methods to **update, modify, or manipulate the array** without returning it explicitly.

---

#### Key Points:

* Arrays are **objects** in Java.
* Passing an array to a method does **not create a new array**, it shares the same memory location.
* Changes to the array **inside the method** are visible outside the method.

---

#### Analogy:

Think of an array as a **street address**:

* Passing the array to a method is like giving someone the **address of your house**.
* If they repaint your house (modify array elements), the **original house is changed**, because they have the actual address.

---
