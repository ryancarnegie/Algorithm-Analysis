Transform & Conquer

1. Instance simplification
  - checking element uniqueness in an array
  - computing a node
2. Representation change
  - how to implement a heap
  - insert and delete frm a heap
  - construct a heap
use heap sort

Presort uniqueness in an array(A[0..n-1])
  for i <- to n-2 do
    if A[i] = A[i + 1] return false
  return true

Stage 1: sort by efficient sorting algorithm (mergesort) O(n logn)
Stage 2: scan array to check pairs of adjacent elements  O(n)
actual overall big O is drop lowest terms = O(n + n log n) = O(nlogn)

  
Given an array, let's transform it into a new data structure. The big O's of a heap - we can insert with O(logn), 
and we can delete with O(logn). These are much faster than O(n). Inserting with n for a million elements would be
a million steps. Inserting with n for a heap is logn - it will take 23 steps.

What is a heap?
A heap is a binary tree. A binary tree means that for each node it has 0 to 2 children. A heap is a binary tree filled
on all levels, filled from left to right, except the last level. Parents are greater or equal than its children.
