# 🧠 Two Sum – Leetcode Problem #1

## 📌 Problem Statement

Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in **any order**.

### 💡 Example:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] == 9


---

## 🐢 Brute-Force Approach

### 🔧 Logic:
Use two nested loops and check all pairs to find the two numbers that sum to the target.

### ⏱ Time Complexity:
- `O(n^2)` – because of the nested loops.

### 💾 Space Complexity:
- `O(1)` – no extra space used.

---

## ⚡ Better Approach – Using HashMap

### 🔧 Logic:
- Iterate through the array.
- For each element, compute its **complement** (i.e., `target - nums[i]`).
- Check if the complement is already in a HashMap.
- If yes, return its index and the current index.
- If no, store `nums[i]` with its index in the map.

### ✅ Code:
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            Integer value = map.get(target - nums[i]);
            if(value == null){
                map.put(nums[i], i);
            }else{
                arr[0]=value;
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}

⏱ Time Complexity:
O(n) – each element visited once.

💾 Space Complexity:
O(n) – to store up to n elements in the HashMap.

🧪 Sample Test Cases
Input	Target	Output
[2, 7, 11, 15]	9	[0, 1]
[3, 2, 4]	6	[1, 2]
[3, 3]	6	[0, 1]

📘 Learning Notes
Learned how brute-force can be improved with hashing.

Practiced HashMap operations (put, get).

Understood space-time tradeoffs.
  ->Traded O(1) space (no extra storage) for O(n) space (HashMap) to gain a big speed boost from O(n²) to O(n) time.

Logged solution to GitHub for portfolio and practice.

🔗 Source

https://leetcode.com/problems/two-sum/description/

