# [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/)

**Difficulty**: ð¢ Easy

**Topics**: `Tree` `Depth-First Search` `Binary Tree`

**Approach**: Recursion

---

## Problem

<p>Given a binary tree, determine if it is <span data-keyword="height-balanced"><strong>height-balanced</strong></span>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/06/balance_1.jpg" style="width: 342px; height: 221px;" />
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/06/balance_2.jpg" style="width: 452px; height: 301px;" />
<pre>
<strong>Input:</strong> root = [1,2,2,3,3,null,null,4,4]
<strong>Output:</strong> false
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> true
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 5000]</code>.</li>
	<li><code>-10<sup>4</sup> &lt;= Node.val &lt;= 10<sup>4</sup></code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `45.7 MB` (Beats 23.51%)

---

## References

**Time Complexity**: O\(n^2\)

**Space Complexity**: O\(n\)

**Notes**:
The solution uses a separate depth calculation for each node, causing repeated traversal of subtrees and leading to quadratic time; recursion stack depth equals tree height.

---

*Solved on: 9/9/2026*

---

## Version 2

**Language**: Java

**Runtime**: `1 ms` (51.10%)

**Memory**: `45.4 MB` (71.33%)

*Solved on: 11/4/2026*

### References (v2)

**Approach**: Tree

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Performs a post-order DFS recursion that returns subtree heights and propagates -1 on imbalance, visiting each node once.


*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*