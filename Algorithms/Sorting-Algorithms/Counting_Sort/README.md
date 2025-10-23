### 🔹 **Definition**

**Counting Sort** is a **non-comparison** sorting algorithm —
it sorts numbers by **counting how many times each unique value appears**.

It’s efficient when:

* The range of input values (like 0 to k) is **not very large**.
* The elements are **non-negative integers**.

---

### 🔹 **How It Works — Step by Step**

Let’s take an example:
`arr = [4, 2, 2, 8, 3, 3, 1]`

---

#### **Step 1: Find the maximum element**

👉 `max = 8`

We’ll create a **count array** of size `max + 1` = `9`
(count indices go from 0 to 8)

---

#### **Step 2: Count the occurrences**

Initialize:
`count = [0,0,0,0,0,0,0,0,0]`

Now, for each element in `arr`, increment its index in `count`:

| Element | Action     | Count Array After   |
| ------- | ---------- | ------------------- |
| 4       | count[4]++ | [0,0,0,0,1,0,0,0,0] |
| 2       | count[2]++ | [0,0,1,0,1,0,0,0,0] |
| 2       | count[2]++ | [0,0,2,0,1,0,0,0,0] |
| 8       | count[8]++ | [0,0,2,0,1,0,0,0,1] |
| 3       | count[3]++ | [0,0,2,1,1,0,0,0,1] |
| 3       | count[3]++ | [0,0,2,2,1,0,0,0,1] |
| 1       | count[1]++ | [0,1,2,2,1,0,0,0,1] |

---

#### **Step 3: Modify count array (prefix sum)**

Each position now stores **the sum of previous counts** → shows position index for output.

| Index | Operation            | Count Array After   |
| ----- | -------------------- | ------------------- |
| 1     | count[1] += count[0] | [0,1,2,2,1,0,0,0,1] |
| 2     | count[2] += count[1] | [0,1,3,2,1,0,0,0,1] |
| 3     | count[3] += count[2] | [0,1,3,5,1,0,0,0,1] |
| 4     | count[4] += count[3] | [0,1,3,5,6,0,0,0,1] |
| 5     | count[5] += count[4] | [0,1,3,5,6,6,0,0,1] |
| 6     | count[6] += count[5] | [0,1,3,5,6,6,6,0,1] |
| 7     | count[7] += count[6] | [0,1,3,5,6,6,6,6,1] |
| 8     | count[8] += count[7] | [0,1,3,5,6,6,6,6,7] |

So final:
`count = [0,1,3,5,6,6,6,6,7]`

---

#### **Step 4: Place elements in the output array**

Now go through the original array **from right to left** (for stability):

Start with empty `output = [_,_,_,_,_,_,_]`

| Element | count[element] | Position | Output After    | Updated Count  |
| ------- | -------------- | -------- | --------------- | -------------- |
| 1       | 1              | index 0  | [1,*,*,*,*,*,*] | count[1]-- → 0 |
| 3       | 5              | index 4  | [1,*,*,*,3,*,_] | count[3]-- → 4 |
| 3       | 4              | index 3  | [1,*,*,3,3,*,*] | count[3]-- → 3 |
| 8       | 7              | index 6  | [1,*,*,3,3,_,8] | count[8]-- → 6 |
| 2       | 3              | index 2  | [1,*,2,3,3,*,8] | count[2]-- → 2 |
| 2       | 2              | index 1  | [1,2,2,3,3,_,8] | count[2]-- → 1 |
| 4       | 6              | index 5  | [1,2,2,3,3,4,8] | count[4]-- → 5 |

✅ **Final Sorted Array:** `[1, 2, 2, 3, 3, 4, 8]`

---

### 🔹 **Algorithm (Logic)**

```java
void countingSort(int arr[]) {
    int n = arr.length;

    // Find max value
    int max = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > max)
            max = arr[i];
    }

    // Create count array
    int count[] = new int[max + 1];
    for (int i = 0; i < n; i++) {
        count[arr[i]]++;
    }

    // Prefix sum
    for (int i = 1; i <= max; i++) {
        count[i] += count[i - 1];
    }

    // Output array
    int output[] = new int[n];
    for (int i = n - 1; i >= 0; i--) {
        output[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    // Copy to original array
    for (int i = 0; i < n; i++) {
        arr[i] = output[i];
    }
}
```

---

### 🔹 **Characteristics**

| Property             | Description                                                      |
| -------------------- | ---------------------------------------------------------------- |
| **Type**             | Non-comparison sorting                                           |
| **Time Complexity**  | `O(n + k)` → where `k` = range of numbers                        |
| **Space Complexity** | `O(n + k)`                                                       |
| **Stability**        | ✅ *Stable*                                                       |
| **In-place**         | ❌ *No* (needs extra arrays)                                      |
| **Works With**       | Non-negative integers (can be adapted for negatives with offset) |

---

### 🔹 **When to Use**

✅ When the range of numbers (`k`) is not much larger than the number of elements (`n`)
✅ Excellent for sorting integers or small-range IDs
❌ Not good if numbers are **very large or have huge range**

---
