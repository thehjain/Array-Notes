//Here we have given an array
//We can choose two numbers or we can say days
//to buy a stock and then to sell it
//We have to mazimize out profit

//Naive approach is to run loop two times
//In that case time complexity will be O(n^2)

//Efficient approach

public int maxProfit(int[] prices) {
	int max_profit = 0;
	int min = 10000000;
	for (int i = 0; i < prices.length; i++) {
		if (prices[i] < min)
			min = prices[i];
		else if (prices[i] - min > max_profit)
			max_profit = prices[i] - min;
	}
	return max_profit;
}


//Question is available on leetcode