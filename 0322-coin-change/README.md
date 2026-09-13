# [Coin Change](https://leetcode.com/problems/coin-change/)

**Difficulty**: 🟢 Easy

**Topics**: `Array` `Dynamic Programming` `Breadth-First Search` `Knapsack Problem` `Complete Knapsack`

**Approach**: Dynamic Programming

---

## Problem

<p>You are given an integer array <code>coins</code> representing coins of different denominations and an integer <code>amount</code> representing a total amount of money.</p>

<p>Return <em>the fewest number of coins that you need to make up that amount</em>. If that amount of money cannot be made up by any combination of the coins, return <code>-1</code>.</p>

<p>You may assume that you have an infinite number of each kind of coin.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> coins = [1,2,5], amount = 11
<strong>Output:</strong> 3
<strong>Explanation:</strong> 11 = 5 + 5 + 1
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> coins = [2], amount = 3
<strong>Output:</strong> -1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> coins = [1], amount = 0
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= coins.length &lt;= 12</code></li>
	<li><code>1 &lt;= coins[i] &lt;= 2<sup>31</sup> - 1</code></li>
	<li><code>0 &lt;= amount &lt;= 10<sup>4</sup></code></li>
</ul>


---

## Solution

**Language**: Java

**Runtime**: `15 ms` (Beats 83.61%)

**Memory**: `45.8 MB` (Beats 98.75%)

---

## References

**Time Complexity**: O\(n^2\)

**Space Complexity**: O\(n\)

**Notes**:
Uses a 1‑dimensional DP array to store the minimum coins needed for each amount up to the target; iterates over all coins for each sub‑amount.

---

*Solved on: 9/13/2026*

*Auto-synced by [CodeTrail](https://github.com/ThivakarSP/CodeTrail)*