//We have given an array of N size
//We have to find the element which is occuring
//more than n/2 times

//Naive apprach can be using two loops

//Another approach can be using HashMaps using extra space

//Best approach is using Boyer-Morre Voting Algorithm

public int majorityElement(int[] nums) {
	int count = 0;
	Integer candidate = null;

	for (int num : nums) {
		if (count == 0) {
			candidate = num;
		}
		count += (num == candidate) ? 1 : -1;
	}

	return candidate;
}


//Problem is available on leetcode