## Conceptual Understanding

### 1. **Goal**

Place `N` queens on an `N x N` chessboard so that:

* No two queens attack each other.

  * ➜ Not in the same **row**
  * ➜ Not in the same **column**
  * ➜ Not in the same **diagonal**

---

### 2. **Key Insight**

Each **row** (or **column**) can have **only one queen**.

So:

* You can fix **one queen per row**,
  then recursively decide positions in the **next rows**.

This reduces complexity dramatically — from ( N^N ) possibilities to ( N! ).

---

### 3. **Recursion + Backtracking**

You’re building the solution **row by row**:

1. Try to place a queen in the current row.
2. Check if it’s **safe**.
3. If yes → place it → recurse for next row.
4. If not → **backtrack** (remove the queen and try another column).

Think of it as **exploring all valid paths** in a tree of choices.

---

## Technical Implementation Points

### 4. **Checking “Is Safe”**

For position `(row, col)`:

* Same column → check previous rows
* Left diagonal → `(row - i, col - i)`
* Right diagonal → `(row - i, col + i)`

Optimization:

* Use **boolean arrays** for O(1) checks:

  ```java
  boolean[] colUsed = new boolean[n];
  boolean[] diag1 = new boolean[2 * n]; // row + col
  boolean[] diag2 = new boolean[2 * n]; // row - col + n - 1
  ```

---

### 5. **Representation**

Common ways to represent the board:

* `int[] cols` → `cols[row] = column where queen is placed`
* Or `char[][] board` with `'Q'` and `'.'`

Using `int[]` is faster and simpler for recursion.

---

### 6. **Base Case**

When `row == n`:

* All queens are placed safely
  → One complete solution found → Print or store it.

---

### 7. **Backtracking Step**

After recursive call:

* Remove (undo) your last placement.
* Continue trying next column in the current row.

This ensures **all** possible valid configurations are explored.

---

## Example Trace (for N = 4)

```
Row 0: Try col 0 ❌ conflict → col 1 ✅
Row 1: Try col 0 ❌ diag conflict → col 2 ✅
Row 2: Try col 0 ✅ → col 1 ❌ → col 3 ❌
Row 3: Try col 0 ❌ → col 3 ✅ (Solution found)
```

Then backtrack and explore other configurations.

---

## Common Mistakes to Avoid

1. **Forgetting to unmark** the column/diagonals during backtrack.
2. **Checking diagonals incorrectly**
   (be careful with index math for `diag1` and `diag2`).
3. **Using global variables incorrectly** — prefer passing state down recursion.
4. **Printing too early** — print only when a full board is complete.
5. **Mixing row and column order** — be consistent: usually row is recursion depth.

---

## Bonus: Optimization Tips

* **Bitmasking** can make it super fast (for large N).
* **Symmetry reduction** (mirror solutions) for advanced efficiency.
* Visualize using a board — helps debugging.
