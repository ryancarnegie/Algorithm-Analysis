MatrixMultiplication(A[0..n-1, 0..n-1], B[0..n-1, 0..n-1]
for i <- 0 to n - 1 do
  for j <- 0 to n - 1 do
    C[i, j] <- 0
    for k <- 0 to n - 1 do
      C[i, j] <- C[i, j] + A[i, k] * B[k, j]
return C



 int A[][] = {{1, 2, 3}, {4, 5, 6}};
        int B[][] = {{7, 2, 1}, {5, 2, 1}};
        int C[][] = new int[2][10];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < C.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
                System.out.println(C[i][j] + " ");
            }
            System.out.println();
        }
    }
