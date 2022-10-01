//Here we have given an array
//we have to find the next greater permutation
//lexiographically


//Algo
//Start from last of an array
//keep incrementing index while we have smaller element


//Anoher approch and code
// what I've done is reversed the elements from last which
// are in ascending order
// and then in the remaing half starting from last finds
// the first smaller element here is the code


class Solution {
    
    void reverseArray(int[] arr, int start, int end){
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        
        int start = nums.length - 1;
        int end = nums.length - 1;
        
        //ascending order finding
        // and then reverse that array
        for(int i = nums.length - 1; i >= 0; i--){
            if(i - 1 >= 0){
                if(nums[i] <= nums[i - 1])
                    start--;
                else
                    break;
            }
                
        }
        
        reverseArray(nums, start, end);
        
        if(start == 0)
            return;
        
        start--;
        
        for(int i = start + 1; i < nums.length; i++){
            if(nums[i] > nums[start]){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                break;
            }
        }
        
    }
}


////////////////////////Code end here///////////////////////////


public void nextPermutation(int[] nums) {
	int i = nums.length - 2;
	while (i >= 0 && nums[i + 1] <= nums[i])
		i--;
	if (i >= 0) {
		int j = nums.length - 1;
		while (j >= 0 && nums[j] <= nums[i])
			j--;
		swap(nums, i, j);
	}
	reverse(nums, i + 1);
}
void reverse(int[] nums, int start) {
	int i = start, j = nums.length - 1;
	while (i < j) {
		swap(nums, i, j);
		i++;
		j--;
	}
}
void swap(int[] nums, int i, int j) {
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}

//Question is available on leetcode
