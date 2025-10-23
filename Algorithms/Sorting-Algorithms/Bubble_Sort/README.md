### 🔹 **Definition**

**Bubble Sort** is a simple **sorting algorithm** that repeatedly steps through the list, **compares adjacent elements**, and **swaps them** if they are in the wrong order.

---

### ⚙️ **How It Works (Step-by-Step)**

Suppose we have an array:
`[5, 3, 8, 4, 2]`

#### **Pass 1:**

Compare each pair and swap if needed:

* Compare 5 & 3 → swap → `[3, 5, 8, 4, 2]`
* Compare 5 & 8 → no swap → `[3, 5, 8, 4, 2]`
* Compare 8 & 4 → swap → `[3, 5, 4, 8, 2]`
* Compare 8 & 2 → swap → `[3, 5, 4, 2, 8]`

➡️ After Pass 1: **Largest element (8)** moves to the end.

#### **Pass 2:**

Repeat for remaining (n-1) elements:

* Compare 3 & 5 → no swap → `[3, 5, 4, 2, 8]`
* Compare 5 & 4 → swap → `[3, 4, 5, 2, 8]`
* Compare 5 & 2 → swap → `[3, 4, 2, 5, 8]`

➡️ After Pass 2: **Next largest (5)** is in place.

#### **Pass 3:**

* Compare 3 & 4 → no swap
* Compare 4 & 2 → swap → `[3, 2, 4, 5, 8]`

#### **Pass 4:**

* Compare 3 & 2 → swap → `[2, 3, 4, 5, 8]`

✅ Now the array is sorted.

---

### 🧠 **Key Idea**

Each pass "bubbles" the largest unsorted element to its correct position at the end.

---

### 📊 **Complexity**

| Case                  | Time Complexity |
| --------------------- | --------------- |
| Best (already sorted) | O(n)            |
| Average               | O(n²)           |
| Worst                 | O(n²)           |
| Space Complexity      | O(1)            |

---

### 💡 **Optimization**

If in one full pass no swaps happen → the array is already sorted → stop early.

---
