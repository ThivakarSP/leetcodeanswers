# [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

**Difficulty**: 🟢 Easy

**Topics**: `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`

**Approach**: Recursion

---

## Problem

<p>Given the <code>root</code> of a binary tree, return <em>its maximum depth</em>.</p>

<p>A binary tree&#39;s <strong>maximum depth</strong>&nbsp;is the number of nodes along the longest path from the root node down to the farthest leaf node.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/11/26/tmp-tree.jpg" style="width: 400px; height: 277px;" />
<pre>
<strong>Input:</strong> root = [3,9,20,null,null,15,7]
<strong>Output:</strong> 3
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1,null,2]
<strong>Output:</strong> 2
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `47.1 MB` (Beats 45.67%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Recursively computes the depth of left and right subtrees, then returns 1 plus the maximum of those depths, effectively performing a depth‑first traversal of the tree.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*