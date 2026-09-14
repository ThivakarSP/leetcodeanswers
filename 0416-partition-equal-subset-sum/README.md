# [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)

**Difficulty**: 🟢 Easy

**Topics**: `Array` `Dynamic Programming` `Knapsack Problem` `0-1 Knapsack`

**Approach**: Dynamic Programming

---

## Problem

<p>Given an integer array <code>nums</code>, return <code>true</code> <em>if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,5,11,5]
<strong>Output:</strong> true
<strong>Explanation:</strong> The array can be partitioned as [1, 5, 5] and [11].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,5]
<strong>Output:</strong> false
<strong>Explanation:</strong> The array cannot be partitioned into equal sum subsets.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 200</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `26 ms` (Beats 88.69%)

**Memory**: `43.6 MB` (Beats 93.07%)

---

## References

**Time Complexity**: O\(n * target\)

**Space Complexity**: O\(target\)

**Notes**:
Uses a 1‑dimensional DP array to track achievable sums up to half the total; iterates numbers in reverse to avoid reusing an element.

---

*Solved on: 9/14/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*