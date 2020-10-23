//We have given an array
//We have to count the reverse pairs in it
//Reverse pair is counted as when i<j and arr[i]>2*arr[j]

//Simple approach is to use two loops and count the pairs

//Efficient approach is to use modified merge sort


public int reversePairs(int[] nums) {
	return mergeSort(nums, 0, nums.length - 1);
}
static int mergeSort(int[] nums, int low, int high) {
	if (low >= high) return 0;
	int mid = (low + high) / 2;
	int res = mergeSort(nums, low, mid);
	res += mergeSort(nums, mid + 1, high);
	res += merge(nums, low, mid, high);
	return res;
}
static int merge(int[] nums, int low, int mid, int high) {
	int count = 0;
	int j = mid + 1;
	for (int i = low; i <= mid; i++) {
		while (j <= high && nums[i] > (2 * (long)nums[j]))
			j++;
		count += (j - (mid + 1));
	}
	Arrays.sort(nums, low, high + 1);
	return count;
}



//Problem is available on leetcode