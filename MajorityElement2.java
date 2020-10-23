//This is very similar to previous question
//which majority element (>N/2) in this
//just take two candidates instead of one


public List<Integer> majorityElement(int[] nums) {
	List<Integer> res = new ArrayList<Integer>();
	int num1 = -1, num2 = -1, count1 = 0, count2 = 0, n = nums.length;
	for (int ele : nums) {
		if (ele == num1)
			count1++;
		else if (ele == num2)
			count2++;
		else if (count1 == 0) {
			num1 = ele;
			count1 = 1;
		} else if (count2 == 0) {
			num2 = ele;
			count2 = 1;
		} else {
			count1--;
			count2--;
		}
	}
	count1 = 0;
	count2 = 0;
	for (int ele : nums) {
		if (ele == num1)
			count1++;
		else if (ele == num2)
			count2++;
	}
	if (count1 > n / 3) res.add(num1);
	if (count2 > n / 3) res.add(num2);
	return res;
}


//Question is available on leetcode