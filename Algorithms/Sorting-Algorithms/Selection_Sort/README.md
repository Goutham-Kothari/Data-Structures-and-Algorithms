### 🔹 **Definition**

**Selection Sort** is a simple comparison-based sorting algorithm.
It repeatedly finds the **smallest (or largest)** element from the **unsorted** part of the array and **places it at the beginning**.

---

### 🔹 **How It Works — Step by Step**

Let’s take an example:
`arr = [5, 4, 1, 3, 2]`

#### Step 1:

Find the **smallest element** in the whole array → `1`
Swap it with the **first element**.
👉 Array becomes: `[1, 4, 5, 3, 2]`

#### Step 2:

Now, consider the rest (from index 1 to end): `[4, 5, 3, 2]`
Smallest element = `2`
Swap with element at index 1.
👉 Array becomes: `[1, 2, 5, 3, 4]`

#### Step 3:

Next part `[5, 3, 4]`
Smallest element = `3`
Swap with element at index 2.
👉 Array becomes: `[1, 2, 3, 5, 4]`

#### Step 4:

Next part `[5, 4]`
Smallest element = `4`
Swap with element at index 3.
👉 Array becomes: `[1, 2, 3, 4, 5]`

#### Step 5:

Last element `[5]` is already sorted.

✅ **Final Sorted Array:** `[1, 2, 3, 4, 5]`

---

### 🔹 **Visualization**

```
Pass 1: [1, 4, 5, 3, 2]
Pass 2: [1, 2, 5, 3, 4]
Pass 3: [1, 2, 3, 5, 4]
Pass 4: [1, 2, 3, 4, 5]
Pass 5: [1, 2, 3, 4, 5]
```

---

### 🔹 **Algorithm (Logic)**

```java
for (int i = 0; i < arr.length - 1; i++) {
    int minIndex = i;
    for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[minIndex]) {
            minIndex = j;
        }
    }
    // swap
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
}
```

---

### 🔹 **Characteristics**

| Property                                 | Description                                         |
| ---------------------------------------- | --------------------------------------------------- |
| **Type**                                 | Comparison-based sorting                            |
| **Time Complexity (Best/Worst/Average)** | `O(n²)`                                             |
| **Space Complexity**                     | `O(1)` (in-place)                                   |
| **Stability**                            | ❌ *Not stable* (can change order of equal elements) |
| **Adaptive**                             | ❌ *No* — it always does n² comparisons              |
| **In-place**                             | ✅ Yes                                               |

---

### 🔹 **When to Use**

✅ Easy to understand and implement
❌ Not suitable for large datasets (inefficient for big arrays)
👉 Good for **small arrays** or **educational understanding** of sorting algorithms.

---
