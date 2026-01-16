public class App {
	public static void main(String[] args) {
		int[][] a = {
				{ 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};
		int[] sums = rowSums(a);
		for (int sum : sums)
			System.out.println(sum);
		// this should print 4 6 11 3
	}

	public static int[] rowSums(int[][] nums) {
		int[] sums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				sum = sum + nums[i][j];
			}
			sums[i] = sum;
		}
		return sums;
	}

}
