### 🔹 **Definition**

**Insertion Sort** builds the final sorted array **one element at a time** — just like how you sort playing cards in your hands.
You take one card at a time and **insert it into the correct position** among the cards you’ve already sorted.

---

### 🔹 **How It Works — Step by Step**

Let’s take an example:
`arr = [5, 4, 1, 3, 2]`

We start sorting from index `1` (the second element), assuming the first element is already sorted.

---

#### **Step 1:**

Current element = `4` (index 1)
Compare with previous elements.
`5` > `4`, so shift `5` one step right.
👉 Insert `4` in position 0.
**Array:** `[4, 5, 1, 3, 2]`

---

#### **Step 2:**

Current element = `1` (index 2)
Compare with previous:
`5 > 1` → shift right
`4 > 1` → shift right
👉 Insert `1` at position 0.
**Array:** `[1, 4, 5, 3, 2]`

---

#### **Step 3:**

Current element = `3` (index 3)
Compare:
`5 > 3` → shift right
`4 > 3` → shift right
`1 < 3` → stop
👉 Insert `3` after `1`.
**Array:** `[1, 3, 4, 5, 2]`

---

#### **Step 4:**

Current element = `2` (index 4)
Compare:
`5 > 2` → shift right
`4 > 2` → shift right
`3 > 2` → shift right
`1 < 2` → stop
👉 Insert `2` after `1`.
**Array:** `[1, 2, 3, 4, 5]`

✅ **Final Sorted Array:** `[1, 2, 3, 4, 5]`

---

### 🔹 **Visualization**

```
Pass 1: [4, 5, 1, 3, 2]
Pass 2: [1, 4, 5, 3, 2]
Pass 3: [1, 3, 4, 5, 2]
Pass 4: [1, 2, 3, 4, 5]
```

---

### 🔹 **Algorithm (Logic)**

```java
for (int i = 1; i < arr.length; i++) {
    int current = arr[i];
    int j = i - 1;

    // shift larger elements to the right
    while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j--;
    }

    // place current in its correct position
    arr[j + 1] = current;
}
```

---

### 🔹 **Characteristics**

| Property                            | Description                                         |
| ----------------------------------- | --------------------------------------------------- |
| **Type**                            | Comparison-based sorting                            |
| **Time Complexity (Worst/Average)** | `O(n²)`                                             |
| **Time Complexity (Best Case)**     | `O(n)` (when array already sorted)                  |
| **Space Complexity**                | `O(1)` (in-place)                                   |
| **Stability**                       | ✅ *Stable* (doesn’t change order of equal elements) |
| **Adaptive**                        | ✅ *Yes* — performs better on nearly sorted data     |
| **In-place**                        | ✅ Yes                                               |

---

### 🔹 **When to Use**

✅ Good for **small arrays**
✅ Works well for **partially sorted arrays**
❌ Inefficient for **large datasets**

---
