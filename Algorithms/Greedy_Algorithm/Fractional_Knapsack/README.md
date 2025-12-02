# **Fractional Knapsack Problem (Greedy Algorithm)**

## **Definition**

The **Fractional Knapsack Problem** aims to maximize profit by selecting items with given **weights** and **values** to put into a knapsack with limited capacity **W**.

Unlike 0/1 knapsack, here you are allowed to take **fractions** of items.

You can break items and take part of them <br>
You cannot break items in 0/1 knapsack

---

# **Greedy Strategy**

Select items based on the **highest value/weight ratio (value density)**.

*Pick the item with the highest profit-to-weight ratio first.*

---

# **Formula**

[
\text{Ratio } = \frac{value}{weight}
]

Pick items in **descending order** of this ratio.

---

# **Algorithm Steps**

1. Compute value/weight ratio for each item
2. Sort items in decreasing order of ratio
3. Start adding items to knapsack until it is full
4. If an item doesn’t fit fully → take a fraction of it
5. Stop when knapsack is full

---

# **Example**

Suppose:

| Item | Value | Weight |
| ---- | ----- | ------ |
| 1    | 60    | 10     |
| 2    | 100   | 20     |
| 3    | 120   | 30     |

Knapsack capacity **W = 50**

### Step 1: Compute ratios

| Item | Value | Weight | Ratio |
| ---- | ----- | ------ | ----- |
| 1    | 60    | 10     | 6     |
| 2    | 100   | 20     | 5     |
| 3    | 120   | 30     | 4     |

Order: **Item 1 → Item 2 → Item 3**

### Step 2: Fill the knapsack

Take item 1 entirely → remaining W = 40 <br>
Take item 2 entirely → remaining W = 20 <br>
Only 20/30 of item 3 fits <br>
Fraction taken = 20/30 = 2/3 <br>

Profit from fraction = 2/3 × 120 = 80

### **Total Profit = 60 + 100 + 80 = 240**

---

# **Pseudo-code (Easy for exams)**

```pseudo
fractionalKnapsack(W, items):
    for each item:
        ratio = value / weight

    sort items by ratio decreasing

    totalValue = 0

    for item in sorted items:
        if item.weight <= W:
            totalValue += item.value
            W -= item.weight
        else:
            fraction = W / item.weight
            totalValue += item.value * fraction
            break

    return totalValue
```

---

# **Java Code**

```java
import java.util.*;

class Item {
    int value, weight;
    Item(int v, int w) {
        value = v;
        weight = w;
    }
}

public class FractionalKnapsack {

    public static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> 
            Double.compare((double)b.value/b.weight, (double)a.value/a.weight)
        );

        double totalValue = 0;

        for (Item item : items) {
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                double fraction = (double) capacity / item.weight;
                totalValue += item.value * fraction;
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;

        System.out.println("Maximum value = " + getMaxValue(items, capacity));
    }
}
```

---

# **Time Complexity**

Sorting items → **O(n log n)**
Greedy selection → **O(n)**

**Total: O(n log n)**
