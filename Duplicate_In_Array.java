
//Find duplicate in Array with N+1 size
//where N is number of elements

//There are mulitple solutions possible
//Naive approach is using HashSet

//Fastest Solution is using Slow and Fast pointer
//Floyd's Tortoise and Hair

int findDuplicate(int[] nums) {

	//Move slow pointer by 1 and fast by 2
	int slow = nums[0];
	int fast = nums[0];

	do {
		slow = nums[slow];
		fast = nums[nums[fast]];
	} while (slow != fast);

	fast = nums[0];
	while (slow != fast) {
		slow = nums[slow];
		fast = nums[fast];
	}

	return slow;
}

//This question is available on leetcode
