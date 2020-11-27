import java.util.Scanner;
import java.util.Arrays;

public class MinimunJump {
	private static String minJump(int arr[], int n) {

	}

	public static void main(String args[]) {
		var scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			int numElem = scan.nextInt();
			int arr[] = new int[numElem];
			for (int i = 0; i < numElem; i++)
				arr[i] = scan.nextInt();
			System.out.println(minJump(arr, numElem));
		}
		scan.close();
	}
}