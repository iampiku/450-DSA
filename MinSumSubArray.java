// Using Sliding window Algorithm
public class MinSumSubArray {
	private static int minSum(int arr[], int subArrSize, int arrSize) {
		int i = 0; 
		int j = 0; 
		int minsum = Integer.MIN_VALUE; 
		int sum = 0;
		while (j < arrsize) {
			if (j-i+1 < subArrSize)
				sum += arr[j];
				j++;
			if (j-i+1 == subArrSize) {
				minSum = Math.min(minSum, sum);
				i++;
				j++;
			}
		}
}

	public static void main(String args[]) {
		int arr[] = {100, 200, 300, 400};
		int subArr = 2;
		int size = arr.length;
		System.out.print(minSum(arr, subArr,));
	}
}