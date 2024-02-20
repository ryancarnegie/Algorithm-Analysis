

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

  
