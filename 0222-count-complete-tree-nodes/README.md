# [Count Complete Tree Nodes](https://leetcode.com/problems/count-complete-tree-nodes/)

**Difficulty**: 🟢 Easy

**Topics**: `Binary Search` `Bit Manipulation` `Tree` `Binary Tree`

**Approach**: Tree

---

## Problem

<p>Given the <code>root</code> of a <strong>complete</strong> binary tree, return the number of the nodes in the tree.</p>

<p>According to <strong><a href="http://en.wikipedia.org/wiki/Binary_tree#Types_of_binary_trees" target="_blank">Wikipedia</a></strong>, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between <code>1</code> and <code>2<sup>h</sup></code> nodes inclusive at the last level <code>h</code>.</p>

<p>Design an algorithm that runs in less than&nbsp;<code data-stringify-type="code">O(n)</code>&nbsp;time complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/14/complete.jpg" style="width: 372px; height: 302px;" />
<pre>
<strong>Input:</strong> root = [1,2,3,4,5,6]
<strong>Output:</strong> 6
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> root = []
<strong>Output:</strong> 0
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> root = [1]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 5 * 10<sup>4</sup>]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 5 * 10<sup>4</sup></code></li>
	<li>The tree is guaranteed to be <strong>complete</strong>.</li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `47.9 MB` (Beats 99.92%)

---

## References

**Time Complexity**: O\(log^2 n\)

**Space Complexity**: O\(log n\)

**Notes**:
Uses left/right height to detect perfect subtrees in a complete binary tree; recursion depth is logarithmic, giving O\(log^2 n\) time and O\(log n\) stack space.

---

*Solved on: 11/20/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*