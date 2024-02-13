import java.util.Arrays;

public class Divide&Conquer {

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

	public static void main(String[]args)
	{
		int a[] = {2,5,8,3,6,9,1,6,5,11};
		int b[] = {3,2,7,6,10};
		System.out.printf("Q1) findMax\nMaximum element: position %d\n", findMax(a, 0, a.length - 1) + 1);
}
