//Here we have given a 2d Array of size n*n
//or matrix

//We have to rotate it by 90 degree


//Approach
//First transpose the matrix
//And then reverse all the rows


public void rotate(int[][] matrix) {
	int n = matrix.length;
	for (int i = 0; i < n; i++)
		for (int j = i; j < n; j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[j][i];
			matrix[j][i] = temp;
		}
	for (int i = 0; i < n; i++)
		for (int j = 0; j < n / 2; j++) {
			int temp = matrix[i][j];
			matrix[i][j] = matrix[i][n - j - 1];
			matrix[i][n - j - 1] = temp;
		}
}


//This question is available on leetcode