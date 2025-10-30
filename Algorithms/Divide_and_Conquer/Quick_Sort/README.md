### **How Quick Sort Works (Step by Step)**

Let’s say the array is:
`[8, 3, 1, 7, 0, 10, 2]`

---

#### **Step 1 — Choose a Pivot**

We pick a pivot element (commonly the **last element**).
→ Pivot = `2`

---

#### **Step 2 — Partition the Array**

We rearrange elements:

* All **smaller than pivot** → left side
* All **greater than pivot** → right side

After partitioning:
`[1, 0] [2] [8, 3, 7, 10]`

Now the pivot `2` is at its **correct position**.

---

#### **Step 3 — Recursive Sorting**

We now apply the same steps:

* Sort the **left part** `[1, 0]` → `[0, 1]`
* Sort the **right part** `[8, 3, 7, 10]` → `[3, 7, 8, 10]`

Finally combine:
`[0, 1] + [2] + [3, 7, 8, 10]`
✅ Result: `[0, 1, 2, 3, 7, 8, 10]`

---

### **Core Idea**

Quick Sort works by:

1. Choosing a pivot.
2. Partitioning elements around the pivot.
3. Recursively sorting both sides.

---

### **Core Function Code Only**

Here are **only the two main functions** you need:

```java
// Quick Sort function
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);   // Sort left part
        quickSort(arr, pivotIndex + 1, high);  // Sort right part
    }
}

// Partition function
public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;  // Return pivot position
}
```
