# [Subsets II](https://leetcode.com/problems/subsets-ii/)

**Difficulty**: 🟡 Medium

**Topics**: `Array` `Backtracking` `Bit Manipulation`

**Approach**: Backtracking

---

## Problem

<p>Given an integer array <code>nums</code> that may contain duplicates, return <em>all possible</em> <span data-keyword="subset"><em>subsets</em></span><em> (the power set)</em>.</p>

<p>The solution set <strong>must not</strong> contain duplicate subsets. Return the solution in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [1,2,2]
<strong>Output:</strong> [[],[1],[1,2],[1,2,2],[2],[2,2]]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [0]
<strong>Output:</strong> [[],[0]]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10</code></li>
	<li><code>-10 &lt;= nums[i] &lt;= 10</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `2 ms` (Beats 99.72%)

**Memory**: `45.3 MB` (Beats 23.66%)

---

## References

**Time Complexity**: O\(2^n\)

**Space Complexity**: O\(2^n\)

**Notes**:
The algorithm sorts the input and recursively builds subsets, skipping duplicates by checking adjacent equal elements. It explores all 2^n possible subsets, using O\(n\) recursion depth and storing all subsets in the result.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*