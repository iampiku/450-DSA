import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FirstRepeat {
	private static char firstRepeatChar(String a) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character i : a.toCharArray()) {
			if (map.containsKey(i)) {
				Integer count = map.get(i);
				map.put(i, count + 1);
			} else {
				map.put(i , 1);
			}
		}
		for (Character j : a.toCharArray()) {
			if (map.get(j) > 1) 
				return j;
		}
		return '$';
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int testCase = scan.nextInt();
		while (testCase-- >0) {
	    String a = scan.next().toLowerCase();
	    System.out.println(firstRepeatChar(a));
		}
	}
}