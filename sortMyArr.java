import java.util.*;

public class sortMyArr {
  private static String sortArr(int arr[]) {
    Arrays.sort(arr);
    return Arrays.toString(arr).replace("[", "").replace("]", "").replace(",", "");
  }

  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int testCase = scan.nextInt();
    while (testCase-- > 0) {
      int numElem = scan.nextInt();
      int arr[] = new int[numElem];
      for (int i = 0; i < numElem; i++)
        arr[i] = scan.nextInt();
      System.out.println(sortArr(arr));
    }
  }
}