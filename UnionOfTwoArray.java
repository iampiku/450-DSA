import java.util.*;

public class UnionOfTwoArray {
  private static void printUnion(int arr1[], int arr2[]) {
    Set<Integer> list = new HashSet<Integer>();
    for (int i=0; i<arr1.length; i++) {
        list.add(arr1[i]);
    }
    for (int j=0; j<arr2.length; j++) {
        list.add(arr2[j]);
    }
        
    System.out.println(list.size());
  }
  
  public static void main(String args []) {
    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    while (testCases-- > 0) {
        int size_1 = scan.nextInt();
        int arr_1[] = new int[size_1];
        int size_2 = scan.nextInt();
        int arr_2[] = new int[size_2];
        for(int i=0; i<size_1; i++) 
            arr_1[i] = scan.nextInt();
        for(int j=0; j<size_2; j++) 
            arr_2[j] = scan.nextInt();
        printUnion(arr_1, arr_2);
    }
  }
}