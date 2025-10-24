# 🧮 Array2D in Java

## 📘 Overview
This Java program demonstrates how to **work with two-dimensional (2D) arrays**.  
It allows the user to:
- Input elements into a 2D array
- Print the array in matrix form
- Search for a specific element
- Find the **largest** and **smallest** elements in the array

---

## 🧠 Concepts Covered
- **2D Arrays** (array of arrays)
- **Nested loops** for input/output
- **Linear Search** in a matrix
- **Finding minimum and maximum** values
- **Methods** for modular programming

---

## 🧩 Program Code
```java
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the no of colums : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the array element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        System.out.println((search(arr, 5) == true) ? "Found" : "Not found");
        minandmax(arr);
        sc.close();
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void minandmax(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                largest = Math.max(largest, arr[i][j]);
                smallest = Math.min(smallest, arr[i][j]);
            }
        }
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}
````

---

## 🖥️ Sample Input & Output

### **Input:**

```
Enter the no of rows : 2
Enter the no of colums : 3
Enter the array element
1 5 7
3 2 9
```

### **Output:**

```
1 5 7
3 2 9
Found
Largest element = 9
Smallest element = 1
```

---

## ⚙️ Explanation

### 🔹 2D Array Declaration:

```java
int arr[][] = new int[r][c];
```

Creates a 2D array with `r` rows and `c` columns.

### 🔹 Taking Input:

Nested loops are used to input values row by row.

### 🔹 Printing Array:

Displays all elements in matrix form using nested loops.

### 🔹 Searching for an Element:

Checks if a specific element (like `5`) exists in the array using a linear search.

### 🔹 Finding Min & Max:

Uses `Math.max()` and `Math.min()` to find the largest and smallest elements.

---

## 🧮 Complexity Analysis

| Operation      | Time Complexity | Space Complexity |
| -------------- | --------------- | ---------------- |
| Input Array    | O(r × c)        | O(r × c)         |
| Print Array    | O(r × c)        | O(1)             |
| Search Element | O(r × c)        | O(1)             |
| Find Min/Max   | O(r × c)        | O(1)             |

---

## 🧾 Summary

✅ Demonstrates basic **2D array operations**
✅ Uses **loops**, **methods**, and **conditional logic**
✅ Shows how to find **minimum**, **maximum**, and **search elements**

---

## 🧑‍💻 Author

**Goutham Kothari**
