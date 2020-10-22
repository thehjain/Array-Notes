//Here we have given 2d matrix
//filled with zeros and ones
//We have fill zeros and in column i and row j
//if there is zero present on ij'th position

//We can do this using extra 2d array
//it will take O(mn) space

//Another thing we can do is by making two array
//row and column with space O(m+n)

//But we can do this in O(1) as well
//its little bit tricky

//Below is the implementation of that solution

public void setZeroes(int[][] matrix) {
	boolean isCol = true;
	int rows = matrix.length;
	int cols = matrix[0].length;

	for (int i = 0; i < rows; i++) {
		if (matrix[i][0] == 0) isCol = false;
		for (int j = 1; j < cols; j++) {
			if (matrix[i][j] == 0)
				matrix[i][0] = matrix[0][j] = 0;
		}
	}

	for (int i = rows - 1; i >= 0; i--) {
		for (int j = cols - 1; j >= 1; j--) {
			if (matrix[i][0] == 0 || matrix[0][j] == 0)
				matrix[i][j] = 0;
		}
		if (!isCol) matrix[i][0] = 0;
	}

}

//This question is availabe on leetcode