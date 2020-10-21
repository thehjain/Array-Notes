import java.util.*;

//Merging Two sorted array is not very difficut task
//we can use another array of size m+n

//But, if you want to do it without using extra space
//than this is one efficient solution for that

class MergeTwoSortedArrays {

	final static int MIN = Integer.MIN_VALUE;
	final static int MAX = Integer.MAX_VALUE;

	public static void main(String[] args) {

		int[] a1 = { 10, 27, 38, 43, 82 };
		int[] a2 = { 3, 9 };

		merge(a1, a2, a1.length, a2.length);

		System.out.println("First Array");
		for (int ele : a1)
			System.out.print(ele + " ");

		System.out.println();

		System.out.println("Second Array");
		for (int ele : a2)
			System.out.print(ele + " ");

	}

	static void merge(int[] A, int[] B, int m, int n) {

		int gap = m + n, i, j;

		for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {

			//For first array
			for (i = 0; i + gap < m; i++) {
				if (A[i] > A[i + gap]) {
					int temp = A[i];
					A[i] = A[i + gap];
					A[i + gap] = temp;
				}
			}

			//for both arrays
			for (j = (gap > m) ? gap - m : 0; i < m && j < n; i++, j++) {
				if (A[i] > B[j]) {
					int temp = A[i];
					A[i] = B[j];
					B[j] = temp;
				}
			}

			//For second array
			if (j < m)
				for (j = 0; j + gap < n; j++) {
					if (B[j] > B[j + gap]) {
						int temp = B[j];
						B[j] = B[j + gap];
						B[j + gap] = temp;
					}
				}
		}
	}

	static int nextGap(int gap) {

		if (gap <= 1)
			return 0;
		return (gap / 2) + (gap % 2);

	}

}