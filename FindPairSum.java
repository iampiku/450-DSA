import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FindPairSum {
	private static int findingPair(int arr_1[], int arr_2[], int size_1, int size_2, int sum) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer i : arr_1) {
			map.put(i)
		}
	}

	public static void main(String args[]) {
	  int testCases = scan.nextInt();
	  while (testCase-- > 0) {
      int size_1 = scan.nextInt();
      int arr_1[] = new int [size_1];
      int size_2 = scan.nextInt();
      int arr_2[] = new int [size_2];
      int sum = scan.nextInt();
      for (int i=0; i<size_1; i++) 
        arr_1[i] = scan.nextInt();
      for (int j=0; j<size_2; j++)
      	arr_2[j] = scan.nextInt();
      System.out.println(findingPair(arr_1, arr_2, size_1, size_2, sum))
    }
  }
}