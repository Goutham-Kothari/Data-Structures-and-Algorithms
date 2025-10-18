### **What is Binary Search?**

Binary search is an **efficient algorithm** to find an element in a **sorted array** (ascending or descending).

Instead of checking every element one by one (like linear search), binary search **repeatedly divides the search space in half**.

**Key idea:**

* If the array is sorted, we can compare the middle element with the target:

  * If it’s equal → found it!
  * If the target is smaller → search the **left half**.
  * If the target is larger → search the **right half**.

---

### **Steps of Binary Search**

1. Start with two pointers:

   * `low = 0` (start of array)
   * `high = n-1` (end of array)
2. Find the middle index:
   [
   mid = \text{low} + \frac{\text{high - low}}{2}
   ]
3. Compare the middle element `arr[mid]` with the target:

   * If `arr[mid] == target` → return `mid`.
   * If `arr[mid] < target` → `low = mid + 1` (search right half)
   * If `arr[mid] > target` → `high = mid - 1` (search left half)
4. Repeat steps 2–3 until `low > high` (target not found).

---

### **Example**

Array: `[2, 5, 8, 12, 16, 23, 38]`
Target = `16`

1. `low=0`, `high=6`, `mid = (0+6)/2 = 3` → `arr[3]=12`

   * 12 < 16 → search **right half** (`low = mid + 1 = 4`)
2. `low=4`, `high=6`, `mid = (4+6)/2 = 5` → `arr[5]=23`

   * 23 > 16 → search **left half** (`high = mid - 1 = 4`)
3. `low=4`, `high=4`, `mid = 4` → `arr[4]=16`

   * Found the target! ✅

**Result:** Target `16` is at index `4`.

---

### **Time Complexity**

* **Best case:** O(1) → middle element is the target.
* **Average & Worst case:** O(log n) → because each step halves the search space.

---

### **Important Notes**

* Binary search **only works on sorted arrays**.
* Requires random access (works well with arrays, not linked lists).

---
