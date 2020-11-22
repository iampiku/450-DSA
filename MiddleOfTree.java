import java.util.Arrays;

public class MiddleOfTree {
  private static int getMiddle(int a, int b, int c) {
    int arr[] = { a, b, c };
    Arrays.sort(arr);
    return arr[1];
  }

  public static void main(String args[]) {
    System.out.println(getMiddle(162, 934, 200));
  }
}