### **What is an Array?**

An **array** is a **collection of elements** of the **same data type**, stored in **contiguous memory locations**.
Think of it like a row of boxes, each with a number, where each box has a unique address.

---

### **Key Characteristics**

1. **Fixed Size**

   * Once you create an array, its size cannot change (in most languages like C, Java).
2. **Same Data Type**

   * All elements must be of the same type: integers, floats, characters, etc.
3. **Indexed Access**

   * Each element has an **index** (position), starting from `0`.
   * Example: `arr[0]` is the first element, `arr[1]` is the second.

---

### **How Arrays Work in Memory**

* Elements are stored **contiguously** in memory.
* This allows **constant-time access** to any element using its index: `arr[i]`.
* Memory address of `arr[i]` is calculated as:
  [
  \text{address of arr[i]} = \text{base address of array} + i \times \text{size of each element}
  ]

**Example:**
Array: `[10, 20, 30, 40]`

* Index 0 → 10
* Index 1 → 20
* Index 2 → 30
* Index 3 → 40
* Accessing `arr[2]` directly gives 30 (no need to traverse previous elements).

---

### **Basic Operations**

1. **Traversal** → Visit each element
2. **Insertion** → Add an element (if space allows)
3. **Deletion** → Remove an element (may require shifting elements)
4. **Search** → Find an element (linear or binary search)
5. **Update** → Change the value of an element

---

### **Example in Java**

```java
int[] arr = {10, 20, 30, 40};
System.out.println(arr[2]); // Output: 30
arr[1] = 25;                // Update element at index 1
```

---

### **Pros of Arrays**

* Fast access by index (O(1))
* Simple and easy to use

### **Cons of Arrays**

* Fixed size (cannot grow dynamically in static arrays)
* Inserting/deleting in the middle is costly (O(n))

---

### Largest_Smallest.java

Java program, **Largest_Smallest.java
**, finds the largest and smallest numbers in an array. It defines two methods — `getLargest()` and `getSmallest()` — which iterate through the array elements to determine the maximum and minimum values, respectively. The `main()` method initializes an integer array `{1, 2, 6, 3, 5}` and prints the largest and smallest values found. This program demonstrates basic array traversal, comparison operations, and the use of `Integer.MIN_VALUE` and `Integer.MAX_VALUE` as initial extremes for finding boundaries efficiently.
