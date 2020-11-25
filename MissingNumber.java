import java.util.Scanner;
import java.util.Arrays;

public class MissingNumber {
	private static int missingNum(int arr[], int n) {
		int num = 1;
		for (int i=0; i<n; i++) {
			if (arr[i] == num)
				num++;
			else
				break;
		}
		return num;
	}
	public static void main(String args[]) {
		var scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			int numElem = scan.nextInt();
			int arr[] = new int[numElem];
			for (int i = 0; i < numElem - 1; i++)
				arr[i] = scan.nextInt();
			System.out.println(missingNum(arr, numElem - 1));
		}
		scan.close();
	}
}