public class MaxSumArray {
	private static int maxSum(int arr[], int subArr) {
		int maxSum = 0;
		for (int i=0; i<arr.length; i++) {
			int sum = 0;
			for (int j=i; j<i+subArr; j++) {
				int sum += arr[j];
				if (sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}

	public static void main(String args[]) {
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int subArr = 4;
		System.out.println(maxSum(arr, subArr));
	}
}