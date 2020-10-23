//Here we have given 2D array
//Suppose mouse is sitting 1st row 1st column
//we have to find the number of paths possible
//if mouse want to reach to nth row and nth column
//condition is mouse can move either down or right

//We can do this question using recursion
//and to make it optimal we can use dynamic programming

public int uniquePaths(int m, int n) {
	int[][] dp = new int[m + 1][n + 1];
	for (int[] row : dp)
		Arrays.fill(row, -1);
	return uniquePathUtil(1, 1, m, n, dp);
}
static int uniquePathUtil(int row, int col, int m, int n, int[][] dp) {
	if (row == m || col == n) {
		return 1;
	}
	if (row > m || col > n)
		return 0;
	if (dp[row][col] != -1)
		return dp[row][col];
	return dp[row][col] = uniquePathUtil(row + 1, col, m, n, dp) + uniquePathUtil(row, col + 1, m, n, dp);
}


//Problem is available on leetcode