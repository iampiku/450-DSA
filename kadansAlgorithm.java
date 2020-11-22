import java.util.Scanner;

public class kadansAlgorithm {
	private static int maxContiguousSum(int arr[], int a) {
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < a; i++) {
			sum += arr[i];
			if (sum > maxSum)
				maxSum = sum;
			if (sum < 0)
				sum = 0;
		}
		return maxSum;
	}

	public static void main(String args[]) {
		var scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			int numElem = scan.nextInt();
			int arr[] = new int[numElem];
			for (int i = 0; i < numElem; i++)
				arr[i] = scan.nextInt();
			System.out.println(maxContiguousSum(arr, numElem));
		}
		scan.close();
	}
}