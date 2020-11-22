import java.util.*;

public class rotateArray {
  public static String rotateLeft(int arr[], int rotate) {
    for (int i = 0; i < rotate; i++) {
      int j, temp = arr[0];
      for (j = 0; j < arr.length - 1; j++)
        arr[j] = arr[j + 1];
      arr[arr.length - 1] = temp;
    }
    return Arrays.toString(arr).replace("[", "").replace("]", "");
  }

  public static String rotateRight(int arr[], int rotate) {
    for (int i = 0; i < rotate; i++) {
      int temp = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--)
        arr[j] = arr[j - 1];
      arr[0] = temp;
    }
    return Arrays.toString(arr).replace("[", "").replace("]", "");
  }

  public static void main(String args[]) {
    var scan = new Scanner(System.in);
    int numItems = scan.nextInt();
    int rotate = scan.nextInt();
    int arr[] = new int[numItems];
    for (int i = 0; i < numItems; i++)
      arr[i] = scan.nextInt();
    System.out.println(rotateLeft(arr, rotate));
    System.out.println(rotateRight(arr, rotate));
    scan.close();
  }
}