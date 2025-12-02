# **Activity Selection Problem (Greedy Algorithm)**

## **Definition**

Given **start** and **finish** times of activities, select the **maximum number of activities** that do not overlap.

Only **one activity at a time**
Activities must be selected such that **no time intervals overlap**

---

# **Greedy Strategy**

Always pick the activity with the **earliest finishing time**, then pick the next activity whose start time is ≥ last selected activity’s finish time.

---

# **Example**

### Input:

```
Start:  {1, 3, 0, 5, 8, 5}
Finish: {2, 4, 6, 7, 9, 9}
```

### Step-by-Step Selection:

1. Sort by finish time → select activity that ends earliest
2. Pick activity 0: (1,2)
3. Next start ≥ 2 → pick activity 1: (3,4)
4. Next start ≥ 4 → pick activity 3: (5,7)
5. Next start ≥ 7 → pick activity 4: (8,9)

### Selected activities = **0, 1, 3, 4**

---

# **Pseudo-code**

```pseudo
activitySelection(start[], end[], n):
    create array activities[n][3]

    for i in 0..n-1:
        activities[i] = (start[i], end[i], i)

    sort activities by end time (ascending)

    selected = []
    lastFinish = -1

    for i in 0..n-1:
        if activities[i].start >= lastFinish:
            selected.add(activities[i])
            lastFinish = activities[i].end

    return selected
```
---

# **Time Complexity**

Sorting → **O(n log n)**
Selecting → **O(n)**

**Total = O(n log n)**

---

# **Flowchart**

```
           ┌────────────────────────────┐
           │  Read start[] and end[]    │
           └─────────────┬──────────────┘
                         │
         ┌───────────────▼───────────────┐
         │  Create activities with       │
         │  (start, end, index)          │
         └───────────────┬───────────────┘
                         │
         ┌───────────────▼───────────────┐
         │  Sort activities by end time  │
         └───────────────┬───────────────┘
                         │
         ┌───────────────▼───────────────┐
         │ Set lastFinish = -1           │
         └───────────────┬───────────────┘
                         │
     ┌───────────────────▼──────────────────────┐
     │ For each activity in sorted order:       │
     │   If start ≥ lastFinish → select it      │
     │   Update lastFinish = activity.end       │
     └───────────────────┬─────────────────────┘
                         │
           ┌─────────────▼──────────────┐
           │ Print selected activities  │
           └────────────────────────────┘
```
