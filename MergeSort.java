
import java.util.Arrays;

public class MergeSort {

	static int findMax(int a[], int left, int right)
	{
		int middle;

		if (left == right) {
			return a[left];
		}

		middle = (left + right) / 2;
		int findLeft = findMax(a, left, middle);
		int findRight = findMax(a, middle + 1, right);
		System.out.println(Math.max(findLeft, findRight));
		return Math.max(findLeft, findRight);	
		
	}

	
	// static int[] mergeSort(int[] A) {
	// 	if (A.length > 1) {
		
	// 		// Implement here
	// 		merge(B, C, A);
	// 	}
	// 	return A;
	// }
	
	static void merge(int[] B, int[] C, int[] A) {
		// Implement here

	}

	public static void main(String[]args)
	{
		int a[] = {2,5,8,3,6,9,1,6,5,11};
		int b[] = {3,2,7,6,10};
		System.out.printf("Q1) findMax\nMaximum element: position %d\n", findMax(a, 0, a.length - 1) + 1);

		System.out.print("Q2) mergeSort\n");
		System.out.println("Before sort:");
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + ", ");
		
		//mergeSort(b);
		
		System.out.println("\nAfter sort:");
		
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + ", ");
	}

}
