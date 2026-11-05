# [Binary Tree Paths](https://leetcode.com/problems/binary-tree-paths/)

**Difficulty**: 🟡 Medium

**Topics**: `String` `Backtracking` `Tree` `Depth-First Search` `Binary Tree`

**Approach**: Tree

---

## Problem

<p>You are given the <code>root</code> of a binary tree.</p>

<p>Return all <strong>root-to-leaf</strong> paths<em> </em>in <strong>any order</strong>.</p>

<p>A <strong>leaf</strong> is a node with no children.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/12/paths-tree.jpg" style="width: 207px; height: 293px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,null,5]
<strong>Output:</strong> [&quot;1-&gt;2-&gt;5&quot;,&quot;1-&gt;3&quot;]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> [&quot;1&quot;]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[1, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `3 ms` (Beats 79.97%)

**Memory**: `48.8 MB` (Beats 61.68%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Recursively traverses the tree, building a path string and adding it when a leaf is reached. Each node is visited once, and the recursion stack plus output list require linear space.

---

*Solved on: 11/5/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*