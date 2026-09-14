# [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)

**Difficulty**: 🟡 Medium

**Topics**: `Array` `Binary Search` `Dynamic Programming` `Longest Increasing Subsequence`

**Approach**: Dynamic Programming

---

## Problem

<p>Given an integer array <code>nums</code>, return <em>the length of the longest <strong>strictly increasing </strong></em><span data-keyword="subsequence-array"><em><strong>subsequence</strong></em></span>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [10,9,2,5,3,7,101,18]
<strong>Output:</strong> 4
<strong>Explanation:</strong> The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [0,1,0,3,2,3]
<strong>Output:</strong> 4
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [7,7,7,7,7,7,7]
<strong>Output:</strong> 1
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 2500</code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
</ul>

<p>&nbsp;</p>
<p><b>Follow up:</b>&nbsp;Can you come up with an algorithm that runs in&nbsp;<code>O(n log(n))</code> time complexity?</p>


---

## Solution

**Language**: Java

**Runtime**: `37 ms` (Beats 74.70%)

**Memory**: `46.1 MB` (Beats 70.73%)

---

## References

**Time Complexity**: O\(n^2\)

**Space Complexity**: O\(n\)

**Notes**:
The algorithm builds a DP array where dp\[i\] stores the length of the longest increasing subsequence ending at index i, updating it by checking all previous elements. This results in quadratic time and linear auxiliary space.

---

*Solved on: 9/14/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*