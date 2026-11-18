# [Score After Flipping Matrix](https://leetcode.com/problems/score-after-flipping-matrix/)

**Difficulty**: 🟡 Medium

**Topics**: `Array` `Greedy` `Bit Manipulation` `Matrix`

**Approach**: Greedy

---

## Problem

<p>You are given an <code>m x n</code> binary matrix <code>grid</code>.</p>

<p>A <strong>move</strong> consists of choosing any row or column and toggling each value in that row or column (i.e., changing all <code>0</code>&#39;s to <code>1</code>&#39;s, and all <code>1</code>&#39;s to <code>0</code>&#39;s).</p>

<p>Every row of the matrix is interpreted as a binary number, and the <strong>score</strong> of the matrix is the sum of these numbers.</p>

<p>Return <em>the highest possible <strong>score</strong> after making any number of <strong>moves</strong> (including zero moves)</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/07/23/lc-toogle1.jpg" style="width: 500px; height: 299px;" />
<pre>
<strong>Input:</strong> grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
<strong>Output:</strong> 39
<strong>Explanation:</strong> 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> grid = [[0]]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == grid.length</code></li>
	<li><code>n == grid[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 20</code></li>
	<li><code>grid[i][j]</code> is either <code>0</code> or <code>1</code>.</li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `0 ms` (Beats 100.00%)

**Memory**: `42.8 MB` (Beats 71.69%)

---

## References

**Time Complexity**: O\(m*n\)

**Space Complexity**: O\(1\)

**Notes**:
Flips rows to ensure the first column is all 1s, then greedily chooses the optimal orientation for each remaining column to maximize the number of 1s, using bit shifts to compute the total score.

---

*Solved on: 11/18/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*