# [Permutations](https://leetcode.com/problems/permutations/)

**Difficulty**: 🟡 Medium

**Topics**: `Array` `Backtracking`

**Approach**: Backtracking

---

## Problem

<p>Given an array <code>nums</code> of distinct integers, return all the possible <span data-keyword="permutation-array">permutations</span>. You can return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,3]
<strong>Output:</strong> [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0,1]
<strong>Output:</strong> [[0,1],[1,0]]
</pre><p><strong class="example">Example 3:</strong></p>
<pre><strong>Input:</strong> nums = [1]
<strong>Output:</strong> [[1]]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 6</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
	<li>All the integers of <code>nums</code> are <strong>unique</strong>.</li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `1 ms` (Beats 87.98%)

**Memory**: `45.4 MB` (Beats 62.44%)

---

## References

**Time Complexity**: O\(n!\)

**Space Complexity**: O\(n!\)

**Notes**:
The algorithm recursively builds permutations by selecting unused elements, backtracking after each recursive call. It explores all n! permutations, each of length n, leading to factorial time and space usage.

---

*Solved on: 9/8/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*