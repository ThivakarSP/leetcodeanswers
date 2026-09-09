# [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/)

**Difficulty**: 🟡 Medium

**Topics**: `Tree` `Depth-First Search` `String Matching` `Binary Tree` `Hash Function`

**Approach**: Recursion

---

## Problem

<p>Given the roots of two binary trees <code>root</code> and <code>subRoot</code>, return <code>true</code> if there is a subtree of <code>root</code> with the same structure and node values of<code> subRoot</code> and <code>false</code> otherwise.</p>

<p>A subtree of a binary tree <code>tree</code> is a tree that consists of a node in <code>tree</code> and all of this node&#39;s descendants. The tree <code>tree</code> could also be considered as a subtree of itself.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/28/subtree1-tree.jpg" style="width: 532px; height: 400px;" />
<pre>
<strong>Input:</strong> root = [3,4,5,1,2], subRoot = [4,1,2]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/04/28/subtree2-tree.jpg" style="width: 502px; height: 458px;" />
<pre>
<strong>Input:</strong> root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the <code>root</code> tree is in the range <code>[1, 2000]</code>.</li>
	<li>The number of nodes in the <code>subRoot</code> tree is in the range <code>[1, 1000]</code>.</li>
	<li><code>-10<sup>4</sup> &lt;= root.val &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= subRoot.val &lt;= 10<sup>4</sup></code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `3 ms` (Beats 64.64%)

**Memory**: `46.4 MB` (Beats 70.38%)

---

## References

**Time Complexity**: O\(n^2\)

**Space Complexity**: O\(n\)

**Notes**:
The algorithm recursively traverses the main tree and, at each node, checks for equality with the subtree using a recursive comparison, leading to a quadratic worst‑case time and linear auxiliary space due to recursion depth.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*