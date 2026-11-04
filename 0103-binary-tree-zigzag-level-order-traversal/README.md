# [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)

**Difficulty**: 🟢 Easy

**Topics**: `Tree` `Breadth-First Search` `Binary Tree`

**Approach**: Tree

---

## Problem

<p>Given the <code>root</code> of a binary tree, return <em>the zigzag level order traversal of its nodes&#39; values</em>. (i.e., from left to right, then right to left for the next level and alternate between).</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/tree1.jpg" style="width: 277px; height: 302px;" />
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> [[3],[20,9],[15,7]]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [[1]]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> []
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 2000]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `1 ms` (Beats 85.43%)

**Memory**: `43.2 MB` (Beats 89.42%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Uses a queue to perform level-order \(BFS\) traversal of the binary tree, collecting node values per level and reversing the list on alternate levels to achieve the zigzag order.

---

*Solved on: 11/4/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*