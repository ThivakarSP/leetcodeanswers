# [Permutation in String](https://leetcode.com/problems/permutation-in-string/)

**Difficulty**: 🟡 Medium

**Topics**: `Hash Table` `Two Pointers` `String` `Sliding Window`

**Approach**: Sliding Window

---

## Problem

<p>Given two strings <code>s1</code> and <code>s2</code>, return <code>true</code> if <code>s2</code> contains a <span data-keyword="permutation-string">permutation</span> of <code>s1</code>, or <code>false</code> otherwise.</p>

<p>In other words, return <code>true</code> if one of <code>s1</code>&#39;s permutations is the substring of <code>s2</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> s1 = &quot;ab&quot;, s2 = &quot;eidbaooo&quot;
<strong>Output:</strong> true
<strong>Explanation:</strong> s2 contains one permutation of s1 (&quot;ba&quot;).
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> s1 = &quot;ab&quot;, s2 = &quot;eidboaoo&quot;
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s1.length, s2.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s1</code> and <code>s2</code> consist of lowercase English letters.</li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `9 ms` (Beats 38.75%)

**Memory**: `44 MB` (Beats 60.59%)

---

## References

**Time Complexity**: O\(n\)

**Space Complexity**: O\(1\)

**Notes**:
Uses two frequency arrays of fixed size 26 and a sliding window over s2 to compare character counts.

---

*Solved on: 9/5/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*