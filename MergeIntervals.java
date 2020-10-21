//We have given an intervals
//which can be overlapping
//We have to return the intervals after merging
//the overlapping intervals

public int[][] merge(int[][] intervals) {
	List<int[]> res = new ArrayList<>();

	if (intervals.length == 0 || intervals == null)
		return res.toArray(new int[0][]);

	Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

	int start = intervals[0][0];
	int end = intervals[0][1];

	for (int[] i : intervals) {
		if (i[0] <= end)
			end = Math.max(end, i[1]);
		else {
			res.add(new int[] {start, end});
			start = i[0];
			end = i[1];
		}
	}
	res.add(new int[] {start, end});
	return res.toArray(new int[0][]);
}


//This is present on leetcode