Space refers to the memory consumed by an algorithm to complete its execution.
Time refers to the required time for an algorithm to complete the execution.

Input enhancement: preprocess the input to store some info to be used later in solving the problem.
  Comparison counting sort
  Distribution counting sort
  String Matching

Pre-structuring: uses extra space to faciliate faster access to the data.
  Hashing
  Hash Function
  Collision Handling
  Efficiency of Hashing

Comparison Counting Sort
for i <- 0 to n - 2
  for j <- i + 1 to n - 1
    if input[i] < input[j]
      Count[j]++
    else
      Count[i]++
for i <- 0 to n - 1
  output[Count[i]] <- input[i]
Efficiency:
O(n^2)
Other sorts (mergesort, heapsort), are O(nlogn).



