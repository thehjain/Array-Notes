//Given an array consisting of 0's,1's and 2's
// We have to sort an array

//Approaches:
//1.Using sort function in O(nlogn)
//2.Counting zeros ones and twos
//3.The one mentioned here is the fastest

public void sortColors(int[] nums) {
	int low = 0, high = nums.length - 1, mid = 0;
	while (mid <= high) {
		switch (nums[mid]) {
		case 0: {
			int temp = nums[low];
			nums[low] = nums[mid];
			nums[mid] = temp;
			low++; mid++;
			break;
		}
		case 1:
			mid++;
			break;
		case 2: {
			int temp = nums[high];
			nums[high] = nums[mid];
			nums[mid] = temp;
			high--;
		}
		}
	}
}

//Question is present on leetcode and gfg as well