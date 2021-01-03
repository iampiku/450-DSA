import java.util.Scanner;
import java.util.HashMap;

public class FindPairSum {
  private static void findPairSum(int arr_1[], int arr_2[], int size_1, int size_2, int sum) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    // Put all the element of the first arr_1[] into the hashmap;
    for (int i : arr_1)
      map.put(i, 0);
    
    // Subtract the sum from the elements of the second arr_2[]
    for (int i : arr_2) {
      if (map.containsKey(sum - i))
        System.out.print(i + " " + (sum - i) + ",");
    }
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int testCase = scan.nextInt();
    while (testCase-- > 0) {
      int size_1 = scan.nextInt();
      int size_2 = scan.nextInt();
      int sum = scan.nextInt();
      int arr_1[] = new int[size_1];
      for (int i = 0; i < size_1; i++)
        arr_1[i] = scan.nextInt();
      int arr_2[] = new int[size_2];
      for (int i = 0; i < size_2; i++)
        arr_2[i] = scan.nextInt();
      scan.close();
      findPairSum(arr_1, arr_2, size_1, size_2, sum);
    }
  }
}