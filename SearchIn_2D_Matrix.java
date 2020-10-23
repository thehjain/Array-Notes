//We have given a 2D matrix which is completely sorted
//we have to search if given key is present in array
//or not

//Naive approach is to linearly search key in array
//Efficient Approach is to do binary search

public boolean searchMatrix(int[][] matrix, int target) {
	if (matrix.length == 0 || matrix[0].length == 0)
		return false;
	int n = matrix.length;
	int m = matrix[0].length;
	int low = 0;
	int high = (n * m) - 1;
	while (low <= high) {
		int mid = low + (high - low) / 2;
		if (matrix[mid / m][mid % m] == target)
			return true;
		else if (matrix[mid / m][mid % m] < target)
			low = mid + 1;
		else
			high = mid - 1;
	}
	return false;
}

//Problem is available on leetcode