# [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

**Difficulty**: 🟡 Medium

**Topics**: `Array` `Matrix` `Simulation`

**Approach**: Two Pointers

---

## Problem

<p>Given an <code>m x n</code> <code>matrix</code>, return <em>all elements of the</em> <code>matrix</code> <em>in spiral order</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral1.jpg" style="width: 242px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3],[4,5,6],[7,8,9]]
<strong>Output:</strong> [1,2,3,6,9,8,7,4,5]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/13/spiral.jpg" style="width: 322px; height: 242px;" />
<pre>
<strong>Input:</strong> matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
<strong>Output:</strong> [1,2,3,4,8,12,11,10,9,5,6,7]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == matrix.length</code></li>
	<li><code>n == matrix[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 10</code></li>
	<li><code>-100 &lt;= matrix[i][j] &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `43.3 MB` (Beats 9.56%)

---

## References

**Time Complexity**: O\(n^2\)

**Space Complexity**: O\(n^2\)

**Notes**:
The algorithm uses four boundary pointers to traverse the matrix layer by layer, adding each element to the result list in O\(1\) time per element, resulting in linear time relative to the number of elements and linear auxiliary space for the output.

---

*Solved on: 9/12/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*