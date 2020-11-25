import java.util.Scanner;
import java.util.Arrays;

public class CyclicallyRotation {
	private static String rigthRotate(int arr[], int n) {
		int temp = arr[n - 1];
		for(int i=n-1; i>0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		return Arrays.toString(arr).replace("[","").replace("]","").replace(",","");
	} 

	public static void main(String args[]) {
		var scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase-- > 0) {
			int numElem = scan.nextInt();
			int arr[] = new int[numElem];
			for (int i = 0; i < numElem; i++)
				arr[i] = scan.nextInt();
			System.out.println(rigthRotate(arr, numElem));
		}
		scan.close();
	}
}