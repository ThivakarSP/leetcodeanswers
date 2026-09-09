# [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/)

**Difficulty**: 🟡 Medium

**Topics**: `Tree` `Depth-First Search` `Breadth-First Search` `Binary Tree`

**Approach**: Breadth-First Search

---

## Problem

<p>Given the <code>root</code> of a binary tree, imagine yourself standing on the <strong>right side</strong> of it, return <em>the values of the nodes you can see ordered from top to bottom</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = [1,2,3,null,5,null,4]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1,3,4]</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/11/24/tmpd5jn43fs-1.png" style="width: 400px; height: 207px;" /></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = [1,2,3,4,null,null,null,5]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1,3,4,5]</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2024/11/24/tmpkpe40xeh-1.png" style="width: 400px; height: 214px;" /></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = [1,null,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1,3]</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">root = []</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the tree is in the range <code>[0, 100]</code>.</li>
	<li><code>-100 &lt;= Node.val &lt;= 100</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `1 ms` (Beats 71.21%)

**Memory**: `43.6 MB` (Beats 69.12%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(n\)

**Notes**:
Uses level-order traversal to capture the rightmost node at each depth, storing it in a list.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*