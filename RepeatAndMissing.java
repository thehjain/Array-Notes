//We have given an array of N size
//Array is consisiting of number from 1 to N
//One is number is missing and one is repeating
//we have to find both

//First thing is to find it after sorting the array
//it will take O(nlogn)

//Second thing is to use another array or hashet
//We can do that in O(n)

//But we can do this question in O(N) without using extra space
//Using Xor

void getTwoElements(int[] arr, int n) {

	int x = 0, y = 0;

	int xor = arr[0];
	int set_bit;

	for (int i = 1; i < n; i++)
		xor ^= arr[i];

	for (int i = 1; i <= n; i++)
		xor ^= i;

	set_bit = xor & ~(xor - 1);

	for (int i = 0; i < n; i++) {
		if ((arr[i] & set_bit) != 0)
			x ^= arr[i];
		else
			y ^= arr[i];
	}

	for (int i = 1; i <= n; i++) {
		if ((i & set_bit) != 0)
			x ^= i;
		else
			y ^= i;
	}

	//And here we got our x and y

}

