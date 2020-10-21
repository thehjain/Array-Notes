import java.util.*;

//We have to find the maximum
//sum contigous subarray

class KadanesAlgo {

	static int MIN = Integer.MIN_VALUE;
	static int MAX = Integer.MAX_VALUE;

	public static void main(String[] args) {

		int [] a = { -2, -3, 4, -1, -2, 1, 5, -3};

		int res = maxSum(a);

		System.out.println(res);

	}

	static int maxSum(int[] a) {

		int n = a.length;
		int max_so_far = MIN, max_ending_here = 0;

		for (int ele : a) {
			max_ending_here += ele;
			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;
			if (max_ending_here < 0)
				max_ending_here = 0;
		}
		return max_so_far;
	}
}