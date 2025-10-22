# Kadane's Algorithm

## What is Kadane's Algorithm?
- Finds the **maximum sum of a contiguous subarray** in an array.
- Works for arrays with **positive and negative numbers**.
- Very **efficient**: O(n) time, O(1) space.

## How It Works
1. Initialize `currentSum` and `maxSum` with the first element.
2. Loop through the array from the second element:
   - `currentSum = max(nums[i], currentSum + nums[i])`
   - `maxSum = max(maxSum, currentSum)`
3. `maxSum` gives the maximum subarray sum.

## Example
- Input: `[-2, -3, 4, -1, -2, 1, 5, -3]`
- Output: `7`  
- Explanation: Subarray `[4, -1, -2, 1, 5]` has the maximum sum.

## Steps to Run
1. Clone the repo: `git clone <repo_url>`
2. Compile: `javac KadaneExample.java`
3. Run: `java KadaneExample`

## Complexity
- **Time:** O(n)  
- **Space:** O(1)
