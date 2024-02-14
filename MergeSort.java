
public class MergeSortAlgorithm {

	// Divide and conquer technique to find max value
	static int findMax(int a[], int left, int right)
	{
		// Implement here
		int middle;
		if (left == right) {
			return a[left];
		}
		middle = (left + right) / 2;
		int findLeft = findMax(a, left, middle);
		int findRight = findMax(a, middle + 1, right);
		//System.out.println(Math.max(findLeft, findRight)); used this for testing, it shows 9 instead of 10.
		return Math.max(findLeft, findRight);	
	}

	static int[] mergeSort(int[] A) 
	{
		if (A.length < 2) {
			return A;
		}
		int middle = A.length / 2;
		
		if (A.length > 1) {
			// Implement here
			int[] left = new int[middle];
			int[] right = new int[A.length - middle];
			for (int i = 0; i < middle; i++) {
				left[i] = A[i];
			}
		
			for (int i = middle; i < A.length; i++) {
				right[i - middle] = A[i];
			}
			mergeSort(left);
			mergeSort(right);
			//merge(B, C, A);
            merge(A, left, right);
		}
		return A;
	}
	
	static void merge(int[] B, int[] C, int[] A) {
		// Implement here
		int left = A.length;
		int right = C.length;
		int i = 0, int j = 0, int k = 0;
		
		while (i < left && j < right) {
			if (A[i] <= C[j]) {
				B[k] = A[i];
				i++;
			} else {
				B[k] = C[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			B[k] = A[i];
			i++;
			k++;
		}
		while (j < right) {
			B[k] = C[j];
			j++;
			k++;
		}
	}

	public static void main(String[]args)
	{
		int a[] = {2,5,8,3,6,9,1,6,5};
		int b[] = {3,2,7,6,8};
		System.out.printf("Q1) findMax\nMaximum element: position %d\n", findMax(a, 0, a.length - 1) + 1);

		System.out.print("Q2) mergeSort\n");
		System.out.println("Before sort:");
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + ", ");
		
		mergeSort(b);
		
		System.out.println("\nAfter sort:");
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + ", ");
	}
}
