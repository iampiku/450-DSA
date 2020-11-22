import java.util.*;

public class KthSmallestElement {
  private static int kthSmallest(int arr[], int k) {
    Arrays.sort(arr);
    return arr[k - 1];
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int testCase = scan.nextInt();
    while (testCase-- > 0) {
      int numElem = scan.nextInt();
      int arr[] = new int[numElem];
      for (int i = 0; i < numElem; i++)
        arr[i] = scan.nextInt();
      int k = scan.nextInt();
      System.out.println(kthSmallest(arr, k));
    }
    scan.close();
  }
}