import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class RemoveDuplicates {
	private static void deleteDuplicates(int arr[], int len) {
		Set<Integer> list = new HashSet<Integer>(len);
		for (int i=0; i<len; i++) 
			list.add(arr[i]);
		System.out.print(list);
	}

	public static void main(String[] args) {
		var scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while (testCases-- >0) {
			int len = scan.nextInt();
			int arr[] = new int [len];
			for (int i=0; i<len; i++) 
				arr[i] = scan.nextInt();
			removeDuplicates(arr, len);
		}
		scan.close();
	}
}