import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.LinkedList;

public class SortByFrequency {
  private static void mapInput(int arr[], int size) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i : arr) {
      if (map.containsKey(i)) {
        Integer count = map.get(i);
        map.put(i, count + 1);
      } else {
        map.put(i, 1);
      }
    }
    sortByFrequency(map);
  }

  private static void sortByFrequency(Map<Integer, Integer> map) {
    List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(map.entrySet());
  }

  public static void main(String args[]) {
    var scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    while (testCases-- > 0) {
      int size = scan.nextInt();
      int arr[] = new int[size];
      for (int i = 0; i < size; i++)
        arr[i] = scan.nextInt();
      mapInput(arr, size);
    }
  }
}