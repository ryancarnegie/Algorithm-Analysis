Sort a known range of numbers

u = largest number in A
l = lowest number in A
n = length of A

DistributionCountingSort(A[0..n-1])
  for j <- 0 to u-l do
    C[j] <- 0
  for i <- 0 to n-l do
    C[A[i]-l] <- C[A[i]-l] + 1
  for j <- 1 to u-l do
    C[j] <- C[j-l] + C[j]
  for i <- n-l downto 0 do
    j <- A[i] - l
    S[C[j]-1] <- A[i]
    C[j] <- C[j] -1
  return S

  
