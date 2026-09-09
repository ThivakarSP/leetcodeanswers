# [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)

**Difficulty**: 🟡 Medium

**Topics**: `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`

**Approach**: Recursion

---

## Problem

<p>Given the <code>root</code> of a binary tree, invert the tree, and return <em>its root</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert1-tree.jpg" style="width: 500px; height: 165px;" />
<pre>
<strong>Input:</strong> root = [4,2,7,1,3,6,9]
<strong>Output:</strong> [4,7,2,9,6,3,1]
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/14/invert2-tree.jpg" style="width: 500px; height: 120px;" />
<pre>
<strong>Input:</strong> root = [2,1,3]
<strong>Output:</strong> [2,3,1]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `42.7 MB` (Beats 91.79%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Recursively swaps left and right subtrees for each node, visiting each node once.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*