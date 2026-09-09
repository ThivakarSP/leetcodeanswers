# [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

**Difficulty**: 🟢 Easy

**Topics**: `String` `Dynamic Programming` `Backtracking` `Bracket Sequences`

**Approach**: Backtracking

---

## Problem

<p>Given <code>n</code> pairs of parentheses, write a function to <em>generate all combinations of well-formed parentheses</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> n = 3
<strong>Output:</strong> ["((()))","(()())","(())()","()(())","()()()"]
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> n = 1
<strong>Output:</strong> ["()"]
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= n &lt;= 8</code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `2 ms` (Beats 69.40%)

**Memory**: `45 MB` (Beats 11.97%)

---

## References

**Time Complexity**: O\(2^n\)

**Space Complexity**: O\(2^n\)

**Notes**:
The algorithm recursively builds all valid combinations by adding '\(' when open < n and '\)' when close < open, effectively exploring a binary tree of depth 2n and storing each valid string in the result list.

---

*Solved on: 9/9/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*