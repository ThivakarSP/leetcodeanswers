# [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)

**Difficulty**: 🟡 Medium

**Topics**: `Tree` `Depth-First Search` `Binary Tree` `Binary Lifting` `Lowest Common Ancestor`

**Approach**: Tree

---

## Problem

<p>Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.</p>

<p>According to the <a href="https://en.wikipedia.org/wiki/Lowest_common_ancestor" target="_blank">definition of LCA on Wikipedia</a>: &ldquo;The lowest common ancestor is defined between two nodes <code>p</code> and <code>q</code> as the lowest node in <code>T</code> that has both <code>p</code> and <code>q</code> as descendants (where we allow <b>a node to be a descendant of itself</b>).&rdquo;</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px;" />
<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong> The LCA of nodes 5 and 1 is 3.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2018/12/14/binarytree.png" style="width: 200px; height: 190px;" />
<pre>
<strong>Input:</strong> root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
<strong>Output:</strong> 5
<strong>Explanation:</strong> The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [1,2], p = 1, q = 2
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.</li>
	<li><code>-10<sup>9</sup> &lt;= Node.val &lt;= 10<sup>9</sup></code></li>
	<li>All <code>Node.val</code> are <strong>unique</strong>.</li>
	<li><code>p != q</code></li>
	<li><code>p</code> and <code>q</code> will exist in the tree.</li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `23 ms` (Beats 10.23%)

**Memory**: `69.7 MB` (Beats 81.65%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(h\)

**Notes**:
The solution recursively traverses the tree, returning the node when it matches p or q and bubbling up the LCA when both left and right subcalls are non‑null. Time is linear in the number of nodes; space is the recursion stack depth, O\(h\) \(worst‑case O\(n\)\).

---

*Solved on: 11/5/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*