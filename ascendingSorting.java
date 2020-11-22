/**
 * Given an array of size N containing 0s, 1s, and 2s; sort the array in
 * ascending order.
 */
 
import java.util.Arrays;
public class ascendingSorting {
  public static void ascendingSort(int arr[]) {
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i]);
  }

  public static void main(String args[]) {
    int arr[] = { 0, 2, 1, 2, 0 };
    ascendingSort(arr);
  }
}