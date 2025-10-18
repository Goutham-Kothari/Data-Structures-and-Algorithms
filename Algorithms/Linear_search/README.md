### **What is Linear Search?**

Linear search (also called **sequential search**) is the simplest way to find an element in a list or array.

**Key idea:**

* Start from the beginning of the array.
* Compare each element with the target one by one.
* Stop when you find the target or reach the end.

---

### **Steps of Linear Search**

1. Start at the first element of the array (`index = 0`).
2. Compare the element with the target:

   * If it matches → return the index (found it!).
   * If it doesn’t → move to the next element (`index + 1`).
3. Repeat step 2 until you reach the end of the array.
4. If the end is reached and no match is found → the target **does not exist** in the array.

---

### **Example**

Array: `[4, 2, 7, 9, 5]`
Target = `9`

1. Check `arr[0] = 4` → not 9 → move to next
2. Check `arr[1] = 2` → not 9 → move to next
3. Check `arr[2] = 7` → not 9 → move to next
4. Check `arr[3] = 9` → match found ✅

**Result:** Target `9` is at index `3`.

---

### **Time Complexity**

* **Best case:** O(1) → target is the first element
* **Worst & average case:** O(n) → must check every element

---

### **Key Points**

* Works for **unsorted or sorted arrays**.
* Very simple but **less efficient** for large arrays compared to binary search.
* No need for the array to be sorted.

---
