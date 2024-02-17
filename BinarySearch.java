Pseudocode

if end < start
  return not found
middle <- floor((start + end) / 2)
if k = a[middle]
  return found
if k > a[middle]
  return binarySearch(a[], k, middle, end)
else if k < a[middle]
  return binarySearch(a[], k, start, middle - 1)



Master Theorem
a is the amount of times we call a recursive function
b is how much we divide by the original size T(n)
F(n) is the combination step

a = 1
b = 2
F(n) = 1

n logb^a = n log2^1 = n^0 = 1
                     F(n) = 1
Since 1 and 1 are equal, therefore,
n logb^a = F(n), T(n) ∈ O(n logb^a log n) = log n

therefore, the big O of binary search is log n
