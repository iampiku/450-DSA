// Using Sliding window Algorithm;

/*
* Minimum Sum of a given window of size 'k';
*/

public class MinSumSubArray {
	private static int minSum(int arr[], int subArrSize, int arrSize) {
		int sum = 0;
		for (int i = 0; i < subArrSize; i++)
			sum += arr[i];

		int currentSum = sum;
		for (int i = subArrSize; i < arrSize; i++) {
			currentSum += arr[i] - arr[i - subArrSize];
			sum = Math.min(sum, currentSum);
		}
		return sum;
	}

	public static void main(String args[]) {
		int arr[] = { 100, 200, 300, 400 };
		int subArr = 2;
		int size = arr.length;
		System.out.print(minSum(arr, subArr, size));
	}
}