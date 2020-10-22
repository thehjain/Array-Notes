//Here we have construct a pascal's triangle
//from a given integer

public List<List<Integer>> generate(int numRows) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();

	if (numRows == 0) return res;

	res.add(new ArrayList<>());
	res.get(0).add(1);

	for (int row = 1; row < numRows; row++) {

		List<Integer> row_list = new ArrayList<>();
		List<Integer> prev_list = res.get(row - 1);

		row_list.add(1);

		for (int j = 1; j < row; j++)
			row_list.add(prev_list.get(j - 1) + prev_list.get(j));

		row_list.add(1);

		res.add(row_list);
	}
	return res;
}

//Question is availble on leetcode