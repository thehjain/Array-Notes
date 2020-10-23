//We simply have to calculate value
//pow(x,n)

//Naive approach is run a loop for n times

//Efficient apprach is using bitwise
//and checking if power is even



public double myPow(double x, int n) {
	double res = 1;
	for (int i = n; i != 0; i /= 2) {
		if ((i ^ 1) != i + 1) res *= x;
		x *= x;
	}
	return (n >= 0) ? res : 1 / res;
}



//Problem is available on leetcode