// Brute Force Approch

public class MaxSumSubArray {
	private static int maxSum(int arr[], int subArr) {
		int maxSum = 0;
		int size = arr.length;
		for (int i=0; i<size; i++) {
			int sum = 0;
			if (i+subArr > size)
				break;
			for (int j=i; j<i+subArr; j++) {
				sum += arr[j];
				if (sum > maxSum)
					maxSum = sum;
			}
		}
		return maxSum;
	}
	public static void main(String args[]) {
		int arr[] = {100, 200, 300, 400};
		int subArr = 2;
		System.out.print(maxSum(arr, subArr));
	}
}